var saldo = 0.0
var nome = ""
val senhaCorreta = 3589

fun main() {
    nomeuser()
    menu()

} fun nomeuser(){
    println()
    println("SEJAM BEM VINDOS!")
    println("Vamos calucular?")
    println()
    println("Qual é o seu nome?")
    nome = readln().toString()

    println()
    println("Olá, ${nome} é um prazer ter você por aqui!")
    println()

}fun menu(){

    println("====================MENU PRINCIPAL====================")
    println("1 - Saldo        | 2 - Extrato           | 3 - Saque")
    println("4 - Depósito     | 5 - Transferência     | 6 - Sair")
    println()
    println("Escolha uma opção:")
    val opcao = readln().toInt()

    when (opcao){
        1 -> Saldoo()
        2 -> Extratoo()
        3 -> Saquee()
        4 -> Despositoo()
        5 -> Transferenciaa()
        6 -> Sair()
        else -> Erro()
    }
}
fun Saldoo (){

    println()
    println("===============Ver Saldo===============")
    println("Digite sua senha para prosseguir:")
    var senha = readln().toInt()

    if (senha == senhaCorreta){

        println("\n${nome}, seu saldo atual é de R$$saldo")
        println("\nDeseja voltar ao menu (S/N)?")
        var escolha = readln()

        if (escolha == "S" || escolha == "s") {
            menu()
        } else {
            println("\n${nome}, foi um prazer ter você por aqui!")
        }
    }else{
        println()
        println("SENHA INCORRETA!")
        Saldoo()
    }
}
fun Extratoo (){

    println()
    println("===============Ver Extrato===============")
    println("Digite sua senha para prosseguir:")
    var senha = readln().toInt()

    if (senha == senhaCorreta){

        println("\n${nome}, seu extrato dos 3 últimos meses")
        println()
        println("Data       | Descrição                        | Valor (R$)")
        println("-----------|----------------------------------|---------------")
        println("06/07/2024 | Pichau - Placa de vídeo          | 2.500,00")
        println("19/07/2024 | Cinemark                         | 50,00")
        println("26/07/2024 | Compra - Supermercado            | 350,00")
        println("07/08/2024 | Pagamento - Conta de Luz         | 120,00")
        println("10/08/2024 | Pagamento - Conta de água        | 200,00")
        println("18/08/2024 | Steam                            | 13,99")
        println("14/09/2024 | Udemy                            | 29,90")
        println("20/09/2024 | McDonald's                       | 24,59")

        println("\nDeseja voltar ao menu (S/N)?")
        var escolha = readln()

        if (escolha == "S" || escolha == "s") {
            menu()
        } else {
            println("\n${nome}, foi um prazer ter você por aqui!")
        }
    }else{
        println()
        println("SENHA INCORRETA!")
        Extratoo()
    }
}
fun Saquee(){
    println()
    println("===============Realizar Saque===============")
    println("Digite sua senha para prosseguir:")
    var senha = readln().toInt()

    if (senha == senhaCorreta){

        println("\n${nome}, qual será o valor do saque?")
        val saque = readln().toFloatOrNull()

        if (saque == null || saque <= 0){
            println("\nOPERAÇÃO NÃO AUTORIZADA!")
            println("Deseja voltar ao menu (S/N)?")
            var escolha = readln()

            if (escolha == "S" || escolha == "s") {
                menu()
            } else {
                Saquee()
            }

        } else if (saque > saldo) {
            println("\n${nome}, seu saldo atual é de R$$saldo")
            println("\nOPERAÇÃO NÃO AUTORIZADA!")
            println("Deseja voltar ao menu (S/N)?")
            var escolha = readln()

            if (escolha == "S" || escolha == "s") {
                menu()
            } else {
                Saquee()
            }
        }else{
            saldo -= saque
            println()
            println("Saque realizado com sucesso! Saque no valor de R$$saque")
            println("\n${nome}, seu saldo atual é de R$$saldo")

            println("\nDeseja voltar ao menu (S/N)?")
            var escolha = readln()

            if (escolha == "S" || escolha == "s") {
                menu()
            } else {
                println("\n${nome}, foi um prazer ter você por aqui!")
            }
        }
    }else{
        println()
        println("SENHA INCORRETA!")
        Saquee()
    }
}
fun Despositoo(){

    println()
    println("===============Realizar Depósito===============")
    println("Digite sua senha para prosseguir:")
    var senha = readln().toInt()

    if (senha == senhaCorreta){

        println("\n${nome}, qual será o valor do depósito?")
        val deposito = readln().toFloatOrNull()

        if (deposito == null || deposito <= 0){
            println("\nOPERAÇÃO NÃO AUTORIZADA!")
            println("Realizamos apenas depósitos maior que R$0!")
            println("Deseja voltar ao menu (S/N)?")
            var escolha = readln()

            if (escolha == "S" || escolha == "s") {
                menu()
            } else {
                Despositoo()
            }
        }else{
            saldo = saldo + deposito
            println()
            println("Depósito realizado com sucesso! Depósito no valor de R$$deposito")
            println("${nome}, seu saldo atual é de R$$saldo")
            println("\nDeseja voltar ao menu (S/N)?")
            var escolha = readln()

            if (escolha == "S" || escolha == "s") {
                menu()
            } else {
                println("\n${nome}, foi um prazer ter você por aqui!")
            }
        }
    }else{
        println()
        println("SENHA INCORRETA!")
        Despositoo()
    }
}
fun Transferenciaa(){

    println()
    println("===============Realizar Transferência===============")
    println("Digite sua senha para prosseguir:")
    var senha = readln().toInt()

    if (senha == senhaCorreta){

        println("\n${nome}, qual será o número da conta para realizar a transferência?")
        val contaTrans = readln().toFloatOrNull()

        if (contaTrans == null){
            println("\nOPERAÇÃO NÃO AUTORIZADA!")
            println("Não realizamos tranferências menor que R$0!")
            println("Deseja voltar ao menu (S/N)?")
            var escolha = readln()

            if (escolha == "S" || escolha == "s") {
                menu()
            } else {
                Transferenciaa()
            }
        }
        println("\nQual será o valor da transferência?")
        var transfer = readln().toFloatOrNull()

        if (transfer == null || transfer <= 0){
            println("\nOPERAÇÃO NÃO AUTORIZADA!")
            println("Realizamos apenas depósitos maior que R$00!")
            println("Deseja voltar ao menu (S/N)?")
            var escolha = readln()

            if (escolha == "S" || escolha == "s") {
                menu()
            } else {
                Transferenciaa()
            }
        }else if (transfer > saldo){
            println("\nOPERAÇÃO NÃO AUTORIZADA!")
            println("${nome}, seu saldo atual é de R$${saldo}. Saldo insuficiente!")
            println("\nDeseja voltar ao menu (S/N)?")
            var escolha = readln()

            if (escolha == "S" || escolha == "s") {
                menu()
            } else {
                println("\n${nome}, foi um prazer ter você por aqui!")
            }
        }else{
            saldo -= transfer
            println()
            println("Tranferência de R$$transfer, para a conta $contaTrans realizado com sucesso!")
            println("${nome}, seu saldo atual é de R$$saldo")
            println("\nDeseja voltar ao menu (S/N)?")
            var escolha = readln()

            if (escolha == "S" || escolha == "s") {
                menu()
            } else {
                println("\n${nome}, foi um prazer ter você por aqui!")
            }
        }
    }else{
        println()
        println("SENHA INCORRETA!")
        Transferenciaa()
    }
}
fun Sair(){
    println("\n${nome}, foi um prazer ter você por aqui!")
}
fun Erro(){
    println()
    println("Essa operação é inexistente")
    println("Digite uma operação válida de 1 a 6.")
    println()
    menu()
}