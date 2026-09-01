//Coleções são uma forma de agrupar itens


fun main() {
    val list = listOf("pc", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val list2 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val list3 = mutableListOf<Int>(20, 30, 40, 50)

    println(list3.contains(2))
    list3.addFirst(10)
    println(list3)
    list3.addLast(60)
    println(list3)
    list3.add(0, 0)
    println(list3)
    println(list3.size)
    list3.clear()
    println(list3)


}