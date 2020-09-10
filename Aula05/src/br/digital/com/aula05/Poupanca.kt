package br.digital.com.aula05

class Poupanca (
        numeroDaConta: Int,
        saldo: Double,
        titular: Cliente,
        var taxaJuros: Double
) : Conta (numeroDaConta, saldo, titular){

    fun recolherJuros(){
        saldo += (saldo * taxaJuros/100)
        println("Transacao: Recolher juros com taxa $taxaJuros")
        println("Novo saldo: R$$saldo")
        println()
    }

}