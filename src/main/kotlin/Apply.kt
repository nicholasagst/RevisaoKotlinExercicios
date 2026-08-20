fun main() {
    val pessoa = Pessoa("Junior", 2029)
   /* with(p){
        acordar()
        doc
    }*/

    pessoa.apply {
        nome = "Nicholas"
        doc = "32859235829"
        "apply"
    }//aqui temos o apply que não retorna valor se acrescentarmos ao final qualquer informação

    val abc = with(pessoa) {
        nome = "Daniel"
        doc = "476268727224"
        false
        "ewugwegf"
        7337
    }//aqui temos o with, que retorna valores se os inserirmos ao final do escopo
}
