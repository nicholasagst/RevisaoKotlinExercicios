abstract class Funcionario {
    abstract fun calculaBonus(): Float
}

class Gerente : Funcionario() {
    override fun calculaBonus(): Float {
        return 5000f
    }
}

class Analista : Funcionario() {
    override fun calculaBonus(): Float {
        return 3000f
    }
}

fun imprimeValorBonus(funcionario: Funcionario){
    println(funcionario.calculaBonus())
}

fun main() {
    println(imprimeValorBonus(Gerente()))
    println(imprimeValorBonus(Analista()))
}