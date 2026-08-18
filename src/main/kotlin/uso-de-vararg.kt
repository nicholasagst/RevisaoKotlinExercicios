

fun media ( vararg n: Float) :Float{
    var soma = 0F
    for (i in n){
        soma += i
    }
    return soma / n.size
}


fun main() {
   println( media(10f,5f,6f,10f))
}