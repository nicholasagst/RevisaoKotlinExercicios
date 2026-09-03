import kotlinx.coroutines.flow.flow

fun main() {
    //Flow - Fluxo (data streams) -  assincrona
    //emitir dados - coletar os dados

    flow<Int> {
        emit(1)
    }
}