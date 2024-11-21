//Agenda
//Considerando a necessidade de desenvolver uma agenda que contenha nomes,
// endereços e telefones de 10 pessoas, defina a estrutura de registro apropriada,
// o diagrama de blocos e a codificação de um programa que por meio do uso de um
// menu de opções, execute as seguintes etapas:
//
//a) Cadastrar os 10 registros.
//b) Pesquisar um dos 10 registros de cada vez pelo campo nome (usar o método seqüencial).
//c) Classificar por ordem de nome os registros cadastrados.
//d) Apresentar todos os registros.
//e) Sair do programa de cadastro.

data class Pessoa(
    var nome: String,
    var endereco: String,
    var telefone: String
)

fun main() {
    val agenda = mutableListOf<Pessoa>()
    var opcao: Int

    do {
        println("\nEscolha uma opção:")
        println("1. Cadastrar 10 registros")
        println("2. Pesquisar um registro por nome")
        println("3. Classificar registros por nome")
        println("4. Apresentar todos os registros")
        println("5. Sair")

        opcao = readLine()!!.toInt()

        when (opcao) {
            1 -> cadastrarRegistros(agenda)
            2 -> pesquisarPorNome(agenda)
            3 -> classificarPorNome(agenda)
            4 -> apresentarRegistros(agenda)
            5 -> println("Saindo do programa...")
            else -> println("Opção inválida. Tente novamente.")
        }
    } while (opcao != 5)
}

fun cadastrarRegistros(agenda: MutableList<Pessoa>) {
    if (agenda.size < 10) {
        for (i in 1..10) {
            println("\nCadastro da pessoa $i:")

            println("Digite o nome:")
            val nome = readLine()!!.trim()

            println("Digite o endereço:")
            val endereco = readLine()!!.trim()

            println("Digite o telefone:")
            val telefone = readLine()!!.trim()

            agenda.add(Pessoa(nome, endereco, telefone))
        }
    } else {
        println("Já foram cadastrados 10 registros.")
    }
}

fun pesquisarPorNome(agenda: MutableList<Pessoa>) {
    println("\nDigite o nome para pesquisar:")
    val nomeBusca = readLine()!!.trim()

    val pessoa = agenda.find { it.nome.equals(nomeBusca, ignoreCase = true) }

    if (pessoa != null) {
        println("Pessoa encontrada: ${pessoa.nome}, Endereço: ${pessoa.endereco}, Telefone: ${pessoa.telefone}")
    } else {
        println("Pessoa não encontrada na agenda.")
    }
}

fun classificarPorNome(agenda: MutableList<Pessoa>) {
    agenda.sortBy { it.nome.lowercase() }
    println("Registros classificados por nome.")
}

fun apresentarRegistros(agenda: MutableList<Pessoa>) {
    if (agenda.isNotEmpty()) {
        println("\nRegistros na agenda:")
        agenda.forEach {
            println("Nome: ${it.nome}, Endereço: ${it.endereco}, Telefone: ${it.telefone}")
        }
    } else {
        println("Não há registros na agenda.")
    }
}
