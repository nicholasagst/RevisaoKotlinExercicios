fun main() {
    val str = "Programação Kotlin."

    str.length//length é um propriedade usada para saber o tamanho da string

    println("Tamanho da string: ${str.length} ")//pegamos a string e acessamos o length ea utilizando .length

    println("Posição (index) 0 da minha string: ${str[0]}")// aqui podemos acessar a posição de cada caractere dentro dos colchetes, tbm uma propriedade
    println(str.startsWith("Pr"))//aqui temos uma função de string, que podemos verificar se algo esta no começo da string.
    println(str.endsWith("abc"))//aqui tbm uma função de string, que podemos verificar se algo esta no final da minha string.


    println(str.substring(11, 19))//nessa função ele nos da os carateres dentro de um intervalo de posições
    println(str.replace("Kotlin.", "Java"))
    println(str.lowercase())
    println(str.uppercase())
    var str2:String = ("        meu nome é         NIcholas    ".trim())
    println("        meu nome é         NIcholas    .".trim())

}