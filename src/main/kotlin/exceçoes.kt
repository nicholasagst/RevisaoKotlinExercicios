fun main(){



    try {
        val str: String? = null
        println(str!!.length)

        println(10/0)

        val abc = "oueoefoief"
        println(abc[100])
    } catch(e:NullPointerException){
        println("Erro - NullPointerException")
    } catch(e: ArithmeticException) {
        println("Erro na divisão por 0 - ArithmeticException")
    } catch (e: IndexOutOfBoundsException) {
        // capturar / tratar
        println("Erro - Index out of boundsS")
    } catch (e: Exception) {
        println("Erro - Exception(Genérica)")
    } finally{
        println("Finalmente!")
    }
}