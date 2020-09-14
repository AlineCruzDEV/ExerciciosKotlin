package com.digital.recebivel

class RegistroRecebimentos {
    val registroRecebimentos = mutableListOf<IRecebivel>()

    fun adicionarRecebimento(vararg r: IRecebivel) = r.forEach { registroRecebimentos.add(it) }

    fun apresentarRecebimentos() {
        registroRecebimentos.forEach { (println(it.toString())) }
    }
}