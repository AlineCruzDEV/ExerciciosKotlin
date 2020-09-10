package br.digital.com.aula05

fun main() {
    val cliente1 = Cliente(1,"Joao", "Felipe", "1452525", "01221441225")
    val cliente2 = Cliente(2,"Vitoria", "Goncalves", "654645", "65445665425")

    val poupanca = Poupanca(11, 2600.13, cliente1, 0.5)

    poupanca.deposito(100.0)
    poupanca.recolherJuros()
    poupanca.saque(2700.04)
    poupanca.saque(100.0)


    println("--------------------------------")

    val corrente = Corrente(22, 1856.04, cliente2, 1500.0)

    corrente.deposito(3000.0)
    corrente.saque(4800.0)
    corrente.depositaCheque(Cheque(3000.0,"Santender", "12/09/2020"))

}