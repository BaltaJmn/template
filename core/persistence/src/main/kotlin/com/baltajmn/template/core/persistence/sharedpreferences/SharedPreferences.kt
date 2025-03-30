package com.baltajmn.template.core.persistence.sharedpreferences

import android.content.Context
import com.baltajmn.template.core.persistence.encrypted.CryptoManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class SharedPreferencesProvider(
    context: Context
) : DataProvider {

    private val cryptoManager by lazy { CryptoManager() }

    companion object {
        const val SHARED_CONFIG = "shared_config"
    }

    private val sharedPreferences by lazy {
        context.getSharedPreferences(SHARED_CONFIG, Context.MODE_PRIVATE)
    }

    override fun getString(key: SharedPreferencesItem, decrypt: Boolean): String? {
        if (decrypt) {
            val encryptedValue =
                sharedPreferences.getString(key.name.lowercase(), null) ?: return null
            return cryptoManager.decrypt(encryptedValue)
        }
        return sharedPreferences.getString(key.name.lowercase(), null)
    }

    override fun setString(key: SharedPreferencesItem, value: String, encrypt: Boolean) {
        val finalValue = if (encrypt) cryptoManager.encrypt(value) else value
        sharedPreferences.edit().putString(key.name.lowercase(), finalValue).apply()
    }

    override fun getLong(key: SharedPreferencesItem): Long {
        return sharedPreferences.getLong(key.name.lowercase(), 0L)
    }

    override fun setLong(key: SharedPreferencesItem, value: Long) {
        sharedPreferences.edit().putLong(key.name.lowercase(), value).apply()
    }

    override fun <T : Any> getObject(key: SharedPreferencesItem): T? {
        val rawString = sharedPreferences.getString(key.name.lowercase(), null) ?: return null
        val type: Type = object : TypeToken<T>() {}.type
        return Gson().fromJson(rawString, type)
    }

    override fun setObject(key: SharedPreferencesItem, value: Any) {
        val rawString = Gson().toJson(value)
        sharedPreferences.edit().putString(key.name.lowercase(), rawString).apply()
    }

}