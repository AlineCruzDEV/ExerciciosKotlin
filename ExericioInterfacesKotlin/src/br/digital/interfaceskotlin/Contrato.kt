package br.digital.interfaceskotlin

class Contrato (override var nome : String,  override var tipoDocumento: String): Imprimivel {

    override fun imprimir() = println("Sou um contrato muito legal: $nome.$tipoDocumento")
}