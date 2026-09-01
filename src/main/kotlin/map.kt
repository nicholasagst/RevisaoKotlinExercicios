fun main() {


    //Map é um conceito de chave e valor

    val map1 = mapOf(Pair("chave", "valor"), Pair("chave2", "valor2"), Pair("chave3", "valor3"))
    val map2 = mutableMapOf(Pair("chave", "valor"), Pair("chave2", "valor2"), Pair("chave3", "valor3"))

    map2["Brasil"] = "Brasilia"
    map2.remove("Brasil")
    println(map1.keys)
    println(map1.values)

    map1.containsKey("chave")
    map2.size




    println(map1)
}