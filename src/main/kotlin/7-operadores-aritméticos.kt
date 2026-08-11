fun main() {

    // +, -, *, /, %
    var idade = 30
    idade +=1
    idade -=2
    idade *=32
    idade /=3
    /* utilizando o sinal antes do = nós estamos dizendo ao Kotlin que queremos
    modificar o número 30 que é nossa idade, podemos modificar ele somando, subtraindo
    entre outras formas
     */
   var idade2 = 10 % 3 /* nesse exemplo usamos o % para nos dar o restante da operação
   10/3, utilizando o % temos o resto de uma operação, e também nos ajuda a descobrir
   se um numero é impar ou par, se o resultado der 0 o número é par, se der  o número é impar.*/
    idade++ //dessa forma incrementamos 1 unidade a variável, porém apenas uma
    ++idade/*podemos usar dessa forma tbm, porém aqui o valor é adicionado antes
    da variável ser chamada, isso fica mais simples de ver quando utilizamos println
    se usar println(idade++), ele exibirá o valor de 10 apenas, mas depois ira adicionar
    +1 após, agora se usarmos println(++idade), ele irá somar primeiro e depois buscar
    o valor da variável. Também podemos usar idade-- ou --idade para subtrair*/


    println(idade)
    println(idade2)
}