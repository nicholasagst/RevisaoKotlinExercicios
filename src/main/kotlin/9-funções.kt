fun main() {

    /* FUNÇÃO É ALGO QUE O PROCESSADOR IRÁ EXECUTAR */
    helloworld()

    soma(10, 5)// aqui eu posso invocar a função e introduzo os valores correspondentes a´a e b
    subtracao(8, 45)
    divisao(34f, 27f)

    println(" A soma de 10 e 5 é ${soma(10, 5)}")/*também posso fazer dessa forma, onde colocamos os valores para a
    e para b */
    println("O resutado 8-45 é : ${subtracao(8, 45)}")
    println("Dividindo 34 por 27 temos o resultado : ${divisao(34.52f, 27.9f)}")

    println(olamundo("nicholas"))
}
/* podemmos tbm enxugar e deixar o código mais limpo com algumas alterações na função*/

fun soma(a: Int, b: Int): Int {  //- aqui temos a função completa
    return (a + b)

}

fun subtracao(a: Int, b: Int):Int{
    return (a - b) /* aqui temos a função resumida e se os valores que formos inserir forem
inteiros, ainda podemos diminuir ainda mais. Não precisamos definir o resultado como Int se sabemos que o resultado vai ser
inteiro*/
}

fun divisao(a: Float, b: Float):Float {
        return (a / b)

}


fun helloworld(): Unit {      //Unit quer dizer que a função não retorna nada
    println("Hello, world!!")
}

fun olamundo(nome:String):String {
    return "Ola, $nome"
}

