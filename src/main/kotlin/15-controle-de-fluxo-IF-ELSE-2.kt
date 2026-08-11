fun maiorDeIdade(idade: Int) {
    if (idade > 18) {
        println("Maior de idade ")

        if(idade > 60){
            println("Terceira Idade")
        }
        if (idade > 100){
            println("Centenário")
        }
    } else if (idade < 10) {
        println("Criança")
    }
    else {
        println("Menor de idade")
    }
}


fun main() {


    maiorDeIdade(19)
    maiorDeIdade(15)
    maiorDeIdade(65)
    maiorDeIdade(120)

}