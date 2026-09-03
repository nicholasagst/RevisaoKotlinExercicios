
class ConfigManager {

    val UserLanguage = "pt-br"

    val databaseConfig: Map<String, String> by lazy {
        loadDatabaseConfiguration()
    }

    private fun loadDatabaseConfiguration(): Map<String, String> {
        return mapOf(Pair("CONFIG", "shjjfkdgfj"))
    }
}

fun main() {
    //lazy

    val str: String by lazy {
         println("Inicializando")
        "grgnernhgeronheo"
    }

    val configManager = ConfigManager()
    configManager.UserLanguage
}