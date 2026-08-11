

fun saudacao(dia: Boolean): String {
    return if (dia)
        "Bom dia"
    else{
        "Boa noite"
    }
}

fun main() {

    println(saudacao(false))

}