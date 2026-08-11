/* Cálculo de bonus de funcionário, por tempo de empresa
menos de um ano -> 500
1 a 3 anos -> 2000
4 anos ou mais -> 5000
 */

fun calculabonus(tempo: Float): Float {
    if (tempo in 0f..0.9f) {
        return 500f
    }else if (tempo in 1f..3.9f) {
        return 2000f
    }else {
        return 5000f
    }

}
fun main(){
    print("A quantos anos está na empresa(para meses insira dessa forma ex:0.6 = 6 meses) :")
    val tempoEmpresa = readln().toFloat()

    println("Seu bonus salarial, com base em tempo de empresa é de R$ ${calculabonus(tempoEmpresa)}")
}