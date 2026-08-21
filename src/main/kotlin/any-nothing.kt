
/*fun abc(): Nothing{
    //função que não retorna nada , a unica coisa que pode ser retornada nela é uma exceção
    throw Exception()
}*/


fun media(vararg abc: Any) : Float{
    var soma = 0F
    for (i in abc){
        soma +=1
    }
    return soma / abc.size
}
/* Any é o parametro dado a qualquer dado dentro do codigo, seja ele int, Float, Double , String
Boolen entr outros
 */



fun main() {

    media(9f, 8f,3f, 9.8, 1.7,"True", false)
}