package br.digital.interfaceskotlin

class Impressora {

/* Solução Inicial

    var listaImprimivel = mutableListOf<Imprimivel>()

    fun add(vararg imprimivel: Imprimivel) {
        listaImprimivel.addAll(imprimivel)
    }

    fun imprimirTudo() {
        for (imp in listaImprimivel) {
            imp.imprimir()
        }
    }*/

    //solução com inline functions e varargs

    val listaImprimivel = mutableListOf<Imprimivel>()
    fun add(vararg item: Imprimivel) = listaImprimivel.addAll(item)
    val imprimir = { listaImprimivel.forEach { it.imprimir() } }

}