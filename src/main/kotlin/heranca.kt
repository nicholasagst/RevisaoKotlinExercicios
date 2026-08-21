class Computador(marca: String, preco: Float, var cor: String) : Eletronico(marca, preco) {
    fun instalarSoftware() {
        super.ligar()
        println("Instalando...")
        println("Instalado.")
        super.desligar()
    }
}

class Microfone(marca: String, preco: Float) : Eletronico(marca, preco) {}

open class Eletronico(var marca: String, var preco: Float) {

    fun ligar() {}
    fun desligar() {}
}


fun main() {


    val microfone = Microfone(marca = "xpto", preco = 500f)

    val computador = Computador("Dell", 5000f, "azul")
}