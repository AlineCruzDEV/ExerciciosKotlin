package br.digital.com.exercicio1collection

fun main() {
    val loteriaDosSonhos = mapOf<Int,String>(0 to "Ovos", 1 to "Agua", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo")

    val apelidos = mapOf<String, String>("Joao" to "Juan, Fissura, Maromba", "Miguel" to "Night Watch, Bruce Wayne, Tampinha", "Maria" to "Wonder Woman, Mary, Marilene", "Lucas" to "Lukinha, Jorge, George")

    println("Loteria dos Sonhos")
    loteriaDosSonhos.forEach { println(it)}
    println()
    println("Apelidos")
    apelidos.forEach { println(it)}

}