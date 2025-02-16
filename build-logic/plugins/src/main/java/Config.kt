object Config {
    const val baseApplicationId = "com.baltajmn.template"

    object Feature {
        const val Splash = "$baseApplicationId.features.splash"
        const val Home = "$baseApplicationId.features.home"
    }

    object Core {
        const val Data = "$baseApplicationId.core.data"
        const val Persistence = "$baseApplicationId.core.persistence"
        const val Auth = "$baseApplicationId.core.auth"
        const val Navigation = "$baseApplicationId.core.navigation"
        const val Common = "$baseApplicationId.core.common"
        const val Design = "$baseApplicationId.core.design"
    }

    object Tests {
        const val SharedTests = "$baseApplicationId.test.sharedTests"
    }

}