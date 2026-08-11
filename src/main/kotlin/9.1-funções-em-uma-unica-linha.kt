fun main() {

    var somar: Int = (somar(2, 3))

    println(somar)
    println(somar2(4, 8))
    println(helloworld())
    println(div(10f, 3.5f))


}

fun somar(a: Int, b: Int): Int = (a + b)/* podemos utilizar dessa forma para deixarmos a função menor, sendo uma função de unica linha*/

fun somar2(a: Int, b: Int) = (a + b) /* nesse caso em específico podemos tirar ao final o tipo de retorno pois o resultado que queremos será interio*/

fun div(a: Float, b: Float) = a / b /*aqui utilizamos uma forma mais simples de uma função fazendo a divisão de 2 números */


fun helloWorld() = println("Hello World!")/* podemos também utilizar funções que não retornam um resultado especificado*/

