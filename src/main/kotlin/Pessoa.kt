class Pessoa(var nome: String, val anoNascimento: Int) { //convenção: classe são sempre nomeadas com a inicial em maisculo.

    var doc: String? = null

    // Init - executado quando a classe é instanciada
    init{
        if(anoNascimento < 0){
            throw Exception("Ano nascimento não pode ser negativo")
        }
    }
    init{
        println("Classe criada")
    }



    //secundario
    constructor(nome: String, anoNascimento: Int, doc: String) : this(nome, anoNascimento) {}

    fun acordar() {

    }
    /* fun falar() {

         println("Olá! Me chamo $nome e tenho $idade anos")
     }*/
}
/*class Pessoa(var nome: String, val anoNascimento: Int) { //convenção: classe são sempre nomeadas com a inicial em maisculo.

    // Init - executado quando a classe é instanciada
    init{
        if(anoNascimento < 0){
            throw Exception("Ano nascimento não pode ser negativo")
        }
    }
    init{
        println("Classe criada")
    }
    fun acordar() {}
    fun dormir(){}

}*/


fun main() {
    //val p: Pessoa = Pessoa("Nicholas", 30)
    val p: Pessoa = Pessoa("Pessoa", 1800)


}