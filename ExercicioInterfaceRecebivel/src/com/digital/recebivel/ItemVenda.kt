package com.digital.recebivel

class ItemVenda : IRecebivel{

    var produto : String = "teste"
    var quantidade : Int = 0
    var valor : Double = 1.0

    fun itemVenda(produto : String, quantidade : Int, valor : Double){
        this.produto = produto
        this.quantidade = quantidade
        this.valor = valor
    }

    override fun toString() : String {
        return "Item Venda: $produto, quantidade $quantidade, valor unitario $valor - TOTAL: ${totalizarReceita()}"
    }

    override fun totalizarReceita(): Double {
        return quantidade * valor
    }
}