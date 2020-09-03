package br.digital.com.aulakotlinsemobjeto

fun main() {

    println(meuNome("Aline", "Cruz"))

    println("Questao 1: " + maiorDeTres(5, 10, 7))

    println("Questao 2: " + comparaString("uva", "pera"))

    println("Questao 3: " + seNumeroPar(14))

    println("Questão 4: ")
    imprimirCemPrimeirosImpares()

    println("Questao 5: " + analisaQuatroInteiros(3, 6, 4, 5))

    println("Questão 6: ")
    exibirCemNumerosPositivos()

}

//função exemplo
fun meuNome(nome: String, sobrenome: String): String {
    return nome + sobrenome
}

//funcao exercicio 1
fun maiorDeTres(num1: Int, num2: Int, num3: Int): Int {
    return maxOf(num1, num2, num3)
}

//funcao exercicio 2
fun comparaString(texto1: String, texto2: String): Boolean {
    return texto1 != texto2
}

//funcao exercicio 3
fun seNumeroPar(num: Int): Boolean {
    return (num % 2) == 0
}

//funcao exercicio 4
fun imprimirCemPrimeirosImpares() {
    for (x in 1..200 step 2) {
        println(x)
    }
}

//funcao exercicio 5
fun analisaQuatroInteiros(num1: Int, num2: Int, num3: Int, num4: Int): Boolean {
    return (num1 > num3 && num1 > num4) || (num2 > num3 && num2 > num4);
}

//funcao exercicio 6
fun exibirCemNumerosPositivos() {
    for (x in 1..100) {
        println(x)
    }
}