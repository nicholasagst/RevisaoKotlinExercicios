fun main() {

}

interface Selvagem{
    fun atacar ()
}

abstract class Mamifero(var nome: String) {
    abstract fun falar()

    fun acordar() {
        println("Acordei")
    }
}

class Cachorro(nome: String) : Mamifero(nome), Selvagem {
    override fun falar() {
        println("au au")
    }
    override fun atacar(){

    }
}

class Gato(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("miau")
    }
}