class Computador2(marca: String, preco: Float, var cor: String) : Eletronico2(marca, preco){
    override fun ligar(){ // seria a sobreescrita de uma função
        super.ligar()
        println("Carregar o sistema operacional")
    }

    fun instalarSoftware(){
        super.ligar()
        println("Instalando...")
        println("Instalado.")
        super.desligar()
    }
}

open class Eletronico2(var marca: String, var preco: Float){
    private var correnteEletrica = false

    open fun ligar(){
        correnteEletrica = true
    }
    fun desligar(){
        correnteEletrica = false
    }
}

fun abc(){}
fun abc(str: String){}
fun abc(str: Int){}
fun abc(id: Int,str: String){}
/*Sobrecarga - overload| é a capacidade de uma função ter vários tipos e quantidade de parametros como o exemplo acima
podemos dar o mesmo nome porém os tipos e quantidade de parametros precia variar.
 */
