package br.digital.interfaceskotlin

fun main() {

    val foto = Foto("photo", "jpeg")
    val contrato = Contrato("escritura","pdf")
    val documento = Documento ("exercicioInterface", "docx")

    val impressora = Impressora()
    impressora.add(foto, contrato, documento)

    impressora.imprimir()
}