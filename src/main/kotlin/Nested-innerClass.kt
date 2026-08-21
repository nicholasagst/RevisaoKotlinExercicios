class Visibilidade2{
    protected var str: String = ""

    protected fun abc (){

    }

    //Nested - interna

    class NestedClass(){// é para ser usada  uma classe interna que não enxerga metodos e variaveis extrernas como
        //str fun abc
        var id: Int = 0

        fun teste(){
            abc()
        }
    }

    private class Teste()
    var id2: Int = 0
    fun teste(){

    }
}


fun main() {

}