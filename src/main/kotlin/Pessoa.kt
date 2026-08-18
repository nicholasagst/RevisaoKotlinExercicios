class Pessoa(var nome: String, var idade: Int) { //convenção: classe são sempre nomeadas com a inicial em maisculo.
    fun acordar() {

    }
    fun falar() {

        println("Olá! Me chamo $nome e tenho $idade anos")
    }
}

fun main() {
    var p: Pessoa = Pessoa("Nicholas", 30)

    p.falar()
}