package br.digital.interfaceskotlin

class Documento (override var nome : String,  override var tipoDocumento: String) : Imprimivel {

    override fun imprimir() = println("Eu sou um documento Word: $nome.$tipoDocumento")
}