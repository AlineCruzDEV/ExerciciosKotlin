package br.digital.com

open class Pato(nome: String) : Animal(nome) {

    final override fun andar() {
        println("Estou andando como um pato")
    }

    override fun comer(){
        println("comendo como um pato")
    }
}