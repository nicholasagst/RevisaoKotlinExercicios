fun main(){
    //nul safety -  é a segurança da variavel de valor nulo, é uma proteção para o null pointer exeception - exceções
    val str: String? = null // usando interrogação podemos definir que não o retorno seja nulo.

    println(str?.length)//podemos acessar as funções de uma variavel se usarmos também ?, mesmo que o resultado seja nulo.
    println(str!!.length)/* neste caso usamos 2 ! para forçar o retorno de exceção, dizemos que pode ser envaiada a exceção
    estamos assumindo que queremos o retorno desta variavel mesmo sabendo que ela é nula.*/
}