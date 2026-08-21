fun main() {
 val e1 = Endereco("rua 1", "cidade 1")
 val e2 = DataEndereco("rua 1", "cidade 1")

    println(e1.toString())
    println(e1.hashCode())
    println(e1.equals(e2))
}

class Endereco(var rua: String, var cidade: String)

data class DataEndereco(var rua: String, var cidade: String)