object Config {
    const val baseApplicationId = "com.baltajmn.template"

    object Feature {
        const val Splash = "$baseApplicationId.features.splash"
        const val Home = "$baseApplicationId.features.home"
    }

    object Core {
        const val Auth = "$baseApplicationId.core.auth"
        const val Common = "$baseApplicationId.core.common"
        const val Data = "$baseApplicationId.core.data"
        const val Database = "$baseApplicationId.core.database"
        const val Design = "$baseApplicationId.core.design"
        const val Navigation = "$baseApplicationId.core.navigation"
        const val Network = "$baseApplicationId.core.network"
        const val Persistence = "$baseApplicationId.core.persistence"
    }

    object Tests {
        const val SharedTests = "$baseApplicationId.test.sharedTests"
    }

}