fun main() {

    print("Escreva aqui seu nome: ")
    val nomeUsuario = readln() // Readline sempre irá ler um texto
    print("Quantos anos você tem? ")

    val idade = readln().toInt()

    val anoNascimento = 2026 - idade
    println("Olá, $nomeUsuario! É um prazer te conhecer.\n" +
            "Você nasceu por volta do ano de $anoNascimento.")



 }