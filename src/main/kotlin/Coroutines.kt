import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    //Coroutines - não é uma Thread, mas usa a Thread para ser executada
    //paralelo / concorrente / assincrono
    println("a")
    runBlocking {
        launch {
            delay(2000)
            helloWord()
        }
    }
    println("d")

    //bloqueia a thread principal até o processo seja finalizado
    //usado muito em testes
}
suspend fun helloWord() {
        coroutineScope {
            println("Hello")
            println("Hello")
            println("Hello")
            println("Hello")
        }
        println("Fora do Coroutine scope")
    }
