/* Cálculo de bonus de funcionário, por tempo de empresa
menos de um ano -> 500
1 a 3 anos -> 2000
4 anos ou mais -> 5000
 */

/* calculabonus(tempo: Float): Float {
    if (tempo in 0f..0.9f) {
        return 500f
    } else if (tempo in 1f..3.9f) {
        return 2000f
    } else if (tempo >= 4){
        return 5000f
    }
    return 0f
}*/
fun calculabonus(tempo: Float): Float {
    return when (tempo) {
        in 0f..0.9f -> 500f
        in 1f..3.9f -> 2000f
        else -> 5000f

    }
}

fun main() {
    while (true) {
        print("---------------Calculo de bonus salarial------------------ \n" +
        "Para meses insira da seguinte forma ex:0.6 = 6 meses \n" +
        "Para finalizar digite -1 \n"+
        "Por favor, digite a quanto anos ou meses está na empresa : ")
        val tempoEmpresa = readln().toFloat()

        if(tempoEmpresa != -1f){
            println("Seu bonus salarial, com base em tempo de empresa é de R$ ${calculabonus(tempoEmpresa)}")
        }
        if (tempoEmpresa == -1f) {
            println("Você digitou : -1 Comando Sair")
            break
        }

    }
    println("Programa Finalizado")
}