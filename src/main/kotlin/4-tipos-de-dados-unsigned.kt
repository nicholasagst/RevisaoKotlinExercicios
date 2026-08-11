fun main() {

     // Unsigned apebnas para numeros inteiros, e não nos da a opção de números negativos
     
     println("ULong MAX - ${ULong.MAX_VALUE} - ${ULong.MIN_VALUE}")
     println("UInt MAX - ${UInt.MAX_VALUE} - ${UInt.MIN_VALUE}")
     println("UShort MAX - ${UShort.MAX_VALUE} - ${UShort.MIN_VALUE}")
     println("UByte MAX - ${UByte.MAX_VALUE} - ${UByte.MIN_VALUE}")

     val abc: UInt = 0u
     val short: UShort = 10u
     val byte: UByte = 10u
     val long: ULong = 10u
     //precisamos utilizar o "u" no final de cada número para deixar claro que queremos utilizar número inteiros sem sinal.

     //números Unsigned são apenas para números inteiros

}
