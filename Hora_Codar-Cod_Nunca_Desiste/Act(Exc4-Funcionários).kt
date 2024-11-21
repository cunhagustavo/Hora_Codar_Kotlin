//Funcionários
//Considerando os registros de 20 funcionários, contendo os campos: matrícula, nome e salário,
//desenvolver um programa que, por meio de um menu, execute as seguintes etapas:
//
//a) Cadastrar os 20 empregados e classificar os registros por número de matrícula.
//b) Pesquisar um determinado empregado pelo número de matrícula.
//c) Apresentar de forma ordenada (por matrícula) os registros dos empregados que recebem salários
//acima de R$1.000,00.
//d) Apresentar de forma ordenada (por matrícula) os registros dos empregados que recebem salários
//abaixo de R$1.000,00.
//e) Apresentar de forma ordenada (por matrícula) os registros dos empregados que recebem salários
//iguais a R$1.000,00.
//f) Sair do programa.

data class Funcionario(
    val matricula: Int,
    val nome: String,
    val salario: Double
)

fun main() {
    val listaFuncionarios = mutableListOf<Funcionario>()
    var opcao: Int

    do {
        println("\nEscolha uma opção:")
        println("1. Cadastrar 20 funcionários e classificar por matrícula")
        println("2. Pesquisar funcionário por matrícula")
        println("3. Exibir funcionários com salário > R$1.000,00")
        println("4. Exibir funcionários com salário < R$1.000,00")
        println("5. Exibir funcionários com salário = R$1.000,00")
        println("6. Sair")

        opcao = readLine()!!.toInt()

        when (opcao) {
            1 -> cadastrarFuncionarios(listaFuncionarios)
            2 -> pesquisarFuncionario(listaFuncionarios)
            3 -> exibirSalarioMaiorQue1000(listaFuncionarios)
            4 -> exibirSalarioMenorQue1000(listaFuncionarios)
            5 -> exibirSalarioIgual1000(listaFuncionarios)
            6 -> println("Saindo do programa...")
            else -> println("Opção inválida. Tente novamente.")
        }
    } while (opcao != 6)
}

fun cadastrarFuncionarios(listaFuncionarios: MutableList<Funcionario>) {
    if (listaFuncionarios.size < 20) {
        for (i in 1..20) {
            println("\nCadastro do funcionário $i:")

            println("Digite a matrícula (número único):")
            val matricula = readLine()!!.toInt()

            println("Digite o nome:")
            val nome = readLine()!!.trim()

            println("Digite o salário:")
            val salario = readLine()!!.toDouble()

            listaFuncionarios.add(Funcionario(matricula, nome, salario))
        }
        listaFuncionarios.sortBy { it.matricula }
        println("20 funcionários cadastrados e classificados com sucesso.")
    } else {
        println("Já foram cadastrados 20 funcionários.")
    }
}

fun pesquisarFuncionario(listaFuncionarios: MutableList<Funcionario>) {
    println("\nDigite o número da matrícula para pesquisa:")
    val matriculaPesquisa = readLine()!!.toInt()

    val funcionario = listaFuncionarios.find { it.matricula == matriculaPesquisa }

    if (funcionario != null) {
        println("\nFuncionário encontrado:")
        println("Matrícula: ${funcionario.matricula}, Nome: ${funcionario.nome}, Salário: R$${"%.2f".format(funcionario.salario)}")
        val situacao = if (funcionario.salario >= 1000) "Aprovado" else "Reprovado"
        println("Situação: $situacao")
    } else {
        println("Funcionário não encontrado.")
    }
}

fun exibirSalarioMaiorQue1000(listaFuncionarios: MutableList<Funcionario>) {
    val funcionariosAcima1000 = listaFuncionarios.filter { it.salario > 1000 }

    if (funcionariosAcima1000.isNotEmpty()) {
        println("\nFuncionários com salário acima de R$1.000,00:")
        funcionariosAcima1000.forEach {
            println("Matrícula: ${it.matricula}, Nome: ${it.nome}, Salário: R$${"%.2f".format(it.salario)}")
        }
    } else {
        println("Não há funcionários com salário acima de R$1.000,00.")
    }
}

fun exibirSalarioMenorQue1000(listaFuncionarios: MutableList<Funcionario>) {
    val funcionariosAbaixo1000 = listaFuncionarios.filter { it.salario < 1000 }

    if (funcionariosAbaixo1000.isNotEmpty()) {
        println("\nFuncionários com salário abaixo de R$1.000,00:")
        funcionariosAbaixo1000.forEach {
            println("Matrícula: ${it.matricula}, Nome: ${it.nome}, Salário: R$${"%.2f".format(it.salario)}")
        }
    } else {
        println("Não há funcionários com salário abaixo de R$1.000,00.")
    }
}

fun exibirSalarioIgual1000(listaFuncionarios: MutableList<Funcionario>) {
    val funcionariosIgual1000 = listaFuncionarios.filter { it.salario == 1000.0 }

    if (funcionariosIgual1000.isNotEmpty()) {
        println("\nFuncionários com salário igual a R$1.000,00:")
        funcionariosIgual1000.forEach {
            println("Matrícula: ${it.matricula}, Nome: ${it.nome}, Salário: R$${"%.2f".format(it.salario)}")
        }
    } else {
        println("Não há funcionários com salário igual a R$1.000,00.")
    }
}
