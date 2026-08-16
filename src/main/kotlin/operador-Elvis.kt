fun main(){

    val str: String? = null

    //Exemplo de como o operador elvis funciona.
    if (str == null){
        println("Nulo")
    }else {
        println(str)
    }

    println(str ?: "Nulo")
}