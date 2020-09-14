package com.digital.recebivel

fun main() {

    val registro = RegistroRecebimentos()

    val item1 = ItemVenda()
    item1.itemVenda("caneca", 2, 41.20)

    val servico1 = Servico()
    servico1.servico("manutencao", 4, 25.50)

    registro.adicionarRecebimento(item1, servico1)
    registro.apresentarRecebimentos()
}