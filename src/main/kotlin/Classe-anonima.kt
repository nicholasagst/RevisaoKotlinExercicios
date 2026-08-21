interface Funcionario2 {
    fun calculaBonus(): Float
}

fun imprimeValorBonus(funcionario: Funcionario2){
    println(funcionario.calculaBonus())
}

fun main() {// uma classe anonima é aquela que funciona apenas uma vez e depois de ser usada ela deixa de existir
    println(imprimeValorBonus(object : Funcionario2 {
        override fun calculaBonus(): Float {
            return 0f
        }

    }))
}