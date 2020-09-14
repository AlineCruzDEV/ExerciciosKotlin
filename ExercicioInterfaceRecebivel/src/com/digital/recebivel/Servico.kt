package com.digital.recebivel

class Servico : IRecebivel {
    var descricao : String = "teste2"
    var horas : Int = 0
    var precoHora : Double = 0.0

    fun servico(descricao : String, horas : Int, precoHora : Double){
        this.descricao = descricao
        this.horas = horas
        this.precoHora = precoHora
    }

    override fun toString() : String {
        return "Servico: $descricao, horas gastar $horas, valor por hora $precoHora - TOTAL: ${totalizarReceita()}"
    }

    override fun totalizarReceita(): Double {
        return horas * precoHora
    }

}