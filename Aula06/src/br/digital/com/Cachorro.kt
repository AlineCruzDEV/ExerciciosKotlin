package br.digital.com

class Cachorro(nome: String) : Animal(nome) {

    override fun andar() {
        println("Estou andando como um cachorro")
    }

    override fun comer(){
        println("comendo como um cachorro")
    }
}