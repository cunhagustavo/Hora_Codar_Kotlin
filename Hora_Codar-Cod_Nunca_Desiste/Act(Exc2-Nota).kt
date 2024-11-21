//Qual a nota?
//Considerando a necessidade de um programa que armazene o nome e as notas bimestrais
// de 20 alunos do curso de Técnicas de Programação, defina a estrutura de registro apropriada,
// o diagrama de blocos e a codificação de um programa que, por meio do uso de um menu de opções,
// execute as seguintes etapas:
//
//a) Cadastrar os 20 registros (após o cadastro efetuar a classificação por nome).
//b) Pesquisar os 20 registros, de cada vez, pelo campo nome. Nesta pesquisa o programa deverá
//também apresentar a média do aluno e as mensagens: “Aprovado” caso sua média seja maior ou
//igual a 5, ou “Reprovado” para média abaixo de 5.
//c) Apresentar todos os registros, médias e a mensagem de aprovação ou reprovação.
//d) Sair do programa de cadastro.

data class Aluno(
    var nome: String,
    var notas: List<Double>
) {
    fun media(): Double = notas.average()

    fun status(): String = if (media() >= 5.0) "Aprovado" else "Reprovado"
}

fun main() {
    val alunos = mutableListOf<Aluno>()
    var opcao: Int

    do {
        println("\nEscolha uma opção:")
        println("1. Cadastrar 20 registros")
        println("2. Pesquisar um registro por nome")
        println("3. Apresentar todos os registros")
        println("4. Sair")

        opcao = readLine()!!.toInt()

        when (opcao) {
            1 -> cadastrarRegistros(alunos)
            2 -> pesquisarPorNome(alunos)
            3 -> apresentarRegistros(alunos)
            4 -> println("Saindo do programa...")
            else -> println("Opção inválida. Tente novamente.")
        }
    } while (opcao != 4)
}

fun cadastrarRegistros(alunos: MutableList<Aluno>) {
    if (alunos.size < 20) {
        for (i in 1..20) {
            println("\nCadastro do aluno $i:")

            println("Digite o nome:")
            val nome = readLine()!!.trim()

            println("Digite as 4 notas bimestrais (separadas por espaço):")
            val notas = readLine()!!.trim().split(" ").map { it.toDouble() }

            alunos.add(Aluno(nome, notas))
        }

        alunos.sortBy { it.nome.lowercase() }

        println("Registros cadastrados e classificados por nome.")
    } else {
        println("Já foram cadastrados 20 registros.")
    }
}

fun pesquisarPorNome(alunos: MutableList<Aluno>) {
    println("\nDigite o nome para pesquisar:")
    val nomeBusca = readLine()!!.trim()

    val aluno = alunos.find { it.nome.equals(nomeBusca, ignoreCase = true) }

    if (aluno != null) {
        println("Aluno encontrado: ${aluno.nome}")
        println("Notas: ${aluno.notas}")
        println("Média: ${aluno.media()}")
        println("Status: ${aluno.status()}")
    } else {
        println("Aluno não encontrado na agenda.")
    }
}

fun apresentarRegistros(alunos: MutableList<Aluno>) {
    if (alunos.isNotEmpty()) {
        println("\nRegistros de todos os alunos:")
        alunos.forEach {
            println("---------------------------------------------------")
            println("Nome: ${it.nome}")
            println("Notas: ${it.notas}")
            println("Média: ${it.media()}")
            println("Status: ${it.status()}")
            println("---------------------------------------------------")
        }
    } else {
        println("Não há registros de alunos cadastrados.")
    }
}
