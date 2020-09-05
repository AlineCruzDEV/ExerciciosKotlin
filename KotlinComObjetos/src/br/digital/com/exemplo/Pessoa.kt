package br.digital.com.exemplo

class Pessoa (
        var nome: String,
        var sobrenome: String,
        var idade: Int
) {
    init {
        jantar()
    }
    fun jantar() {
        println("Pessoa $nome está jantando")
    }

    init {
        println("$nome $sobrenome completou $idade")
    }

    fun passearComDog(cachorro: Cachorro) {
        println("Estou passeando com meu dog ${cachorro.nome}")
    }
}