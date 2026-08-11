fun main() {
    val nome = "Tony"
    val sobrenome = "Stark"

    println("Olá, " + nome + " " + sobrenome) // dessa maneira o nome aparecerá corretamente

    println("Ola, $nome $sobrenome") /* e aqui é a forma correta de formatarmos
                                        a string em modo Kotlin*/
    nome.length // dessa forma podemos acesar o tamanho da nossa string
    nome.reversed()
    println(nome.reversed())

    var str: String = "kfaofbafjoasofbqafasofauosfob" +

            "kfbnsdfbnasdofgajkofgbajasdofgao" +

            "djkfbiabfiafiasbfqaifiajsfasfasifia"
            // dessa forma podemos adicionar um texto grande com muitas linhas
    println(str)

}