import javax.lang.model.element.NestingKind

fun main() {
    println(palavra())
    println(cub(2))
    println("Suas milhas convertidas em Kilometros: ${milhas(45.56)}KM")



    val poema :String = "\nA nós bastem nossos próprios ais,\n" +
            "Que a ninguém sua cruz é pequenina.\n" +
            "Por pior que seja a situação da China,\n" +
            "Os nossos calos doem muito mais...\n"
    println(poema.replace("a","x",true))
    println("Este poema tem no total ${poema.length} caracteres")
    println(poema.lowercase())




}

fun palavra(){
    println("Olá Mundo!".length)
}

fun cub(a:Int) = (a*a*a)

fun milhas(a:Double) = (a*(1.6))






