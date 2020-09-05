package br.digital.com.aula05

class Conta (
        var numeroDaConta: Int,
        var saldo: Double,
        var titular: Cliente
) {
    init {
        println("Conta de numero $numeroDaConta - gerada com saldo $saldo - para Cliente ${titular.nome} ${titular.sobrenome}")
        println()
    }
    fun deposito (valor : Double) {
        saldo += valor
        println("Transacao: deposito de R$$valor")
        println("Novo saldo: R$$saldo")
        println()
    }

    fun saque (valor: Double) {
        println("Transacao: saque de R$$valor")
        if (valor > saldo) {
            println("Saldo insuficiente")
            println()
        } else{
            saldo -= valor
            println("Novo saldo: R$$saldo")
            println()
        }
    }
}