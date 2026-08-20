class Matematica {
    val id: Int = 10
    val PI = 3.14159265358979

    companion object{
        val PI = 3.14159265358979
    }

    object OBJ1{
        val abc = "gherhe"
    }

    object OBJ2{
        val def = "645363"

    }
}


fun main() {
    Matematica.PI
    Matematica().PI
    Matematica.OBJ1.abc
    Matematica.OBJ2.def
}