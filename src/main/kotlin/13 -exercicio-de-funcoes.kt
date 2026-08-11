/* 1-Escreva uma função que seja capaz de receber a quantidade de anos e transformar
em meses, dias, horas, minutos e segundos.
-2 Escreva uma função capaz de receber uma string e retornar
a quantidade de caracteres.
-3 Escreva uma função capaz de calcular o cubo de um número inteiro(cubo = n*n*n).
-4 Escreva uma função capaz de receber milhas e converter em KM (1milha = 1,6 km).
- 5 Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras "a" ou "A" por "x".

 */


fun converteAnos(anos: Int) {
    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60}minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")

}

fun caracteres(str: String) = str.length

fun cubo(n: Int) = n * n * n


fun milhaskm(milhas: Float): Float =milhas * 1.6f


fun ex5(str: String) {
    println(str.replace("a", "x", true).lowercase())

}


fun main() {
    converteAnos(2)
    println(caracteres("oodfvkndo dpfsdp sdjvp ip psdjv"))
    println(cubo(3))
    println(milhaskm(100f))
    ex5("AAAAaAAaAa Akaoi oiAAOioaa OA oA AOA AOAOianO ia o9xxaxxaaaaAaoaoa oa")
}