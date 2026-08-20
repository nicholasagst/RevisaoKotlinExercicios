class DataBase(){
    fun openConnection() {
        println("Conexão Estabelecida")
    }

}


    var nome: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }


class Server{

    lateinit var db:DataBase

    fun initServer(){
       if(!::db.isInitialized){
           db=DataBase()
       }
        db.openConnection()
    }

}

fun main() {

    val server = Server()
    server.initServer()

val p = Pessoa("Junior", 2029)

    with(p){
        acordar()
        doc
    }




















    /*var numero1 = 89
    val numero2 = 90
    println(numero1 + numero2)
    println("Olá, Mundo!")
    numero1 = 20
    println(numero1)*/

}