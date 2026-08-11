/** Tipoas de Dados
 * Type    Bit
 * Double  64 utilizado para números com virgula = 4.56
 * Float   32 utilizado para numeros com virgula = 7.94
 * Long    64 utilizado para numeros inteiros = 67
 * Int     32 utilizado para numeros inteiros = 4985
 * Short   16 utilizado para numeros inteiros = 69
 * Byte    8  utilizado para numeros inteiros = 29832
 * Boolen  ?  True or False
 * String  ?  ocup o tamanho necessário
 * Char    ?  defini aopenas um valor ex: var c: Char = 'a'

Cada um desses tipos de dados podem aramzenar uma certa quantidade
de bits para se usar, e estarão descritos abaixo, e quando não
definimos o tipo para esse valor que estamos inserindo o Kotlin por
si só define esse valor como Int - Inteiro */

fun main() {

    var double: Double = 10.0 /* aqui para forçarmos um numero inteiro
                              utilizamos o .0 para dizer que é um numero com virgula, pois é um tipo de dado de número
                              com virgula*/
    var float: Float = 10f /* aqui para forçarmos um número inteiro em um tipo de dado float(que é o dado que
                            utiliza números com virgula) utilizamos f no final */
    var long: Long = 10L /* aqui utilizamos o L no final para forçar caso precise, pois o long e o int são
                            tipos de dados parecidos */
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10
    var char: Char = 'a'/* utiliza apenas um caractere*/
    var s: String = "Nicholas Daniel Augusto"/* no caso de string o seu tamanho será relacionado a quantidade de letras que ela possui,
    se forem poucas ocupara pouco espaço e se aumentar aumentará tbm seu espaço na memória*/
    var b: Boolean = true


    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")/* quando usamos ${} estamos utilizando a
    interpolação, que é a junção de string com variavel por exemplo .*/
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")
    println(double)
}