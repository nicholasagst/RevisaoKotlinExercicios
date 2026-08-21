// SAM - Single Abstract Method
// interface funcional


fun interface Empregado {
    fun calcBonus(str: String, id: Int): Float
}

fun imprimeValBonus(empregado: Empregado) {
    println(empregado.calcBonus("egvwegbwgvw", 10))
}

fun main() {
    imprimeValBonus { str, id ->
        println(str)
        0F
    }
}