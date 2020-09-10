package br.digital.com.aula05

class Corrente (
        numeroDaConta: Int,
        saldo: Double,
        titular: Cliente,
        var limiteChequeEspecial: Double
) : Conta (numeroDaConta, saldo, titular) {

    fun depositaCheque (cheque: Cheque){
        saldo += cheque.valor
        println("Transacao: deposito de Cheque R$${cheque.valor}")
        println("Novo saldo: R$$saldo")
        println()
    }

    override fun saque(valor: Double) {
        println("Transacao: saque de R$$valor")
        if (valor > (saldo + limiteChequeEspecial)) {
            println("Saldo insuficiente mesmo com Cheque Especial")
            println()
        } else if(valor > saldo){
                limiteChequeEspecial -= (valor - saldo)
                saldo = 0.0
                println("Novo saldo: R$$saldo")
                println("Novo saldo Cheque especial: R$ $limiteChequeEspecial")
                println()
            } else {
                saldo -= valor
                println("Novo saldo: R$$saldo")
                println()
        }
    }
}