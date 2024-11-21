//Nome e Altura
//Elaborar um programa que armazene o nome e a altura de 15 pessoas, por meio do uso de
//registros. O programa deverá ser manipulado por um menu que execute as seguintes etapas:
//
//a) Cadastrar os 15 registros.
//b) Apresentar os registros (nome e altura) das pessoas menores ou iguais a 1.5m.
//c) Apresentar os registros (nome e altura) das pessoas que sejam maiores que 1.5m.
//d) Apresentar os registros (nome e altura) das pessoas que sejam maiores que 1.5m e menores que
//2.0m.
//e) Apresentar a média extraída de todas as alturas armazenadas.
//f) Sair do programa.

data class PessoaAltura(
    val nome: String,
    val altura: Double
)

fun main() {
    val listaPessoas = mutableListOf<PessoaAltura>()
    var opcao: Int

    do {
        println("\nEscolha uma opção:")
        println("1. Cadastrar 15 registros")
        println("2. Mostrar pessoas com altura <= 1.5m")
        println("3. Mostrar pessoas com altura > 1.5m")
        println("4. Mostrar pessoas com altura entre 1.5m e 2.0m")
        println("5. Calcular média das alturas")
        println("6. Sair")

        opcao = readLine()!!.toInt()

        when (opcao) {
            1 -> cadastrarPessoas(listaPessoas)
            2 -> exibirMenoresOuIguais1_5(listaPessoas)
            3 -> exibirMaioresQue1_5(listaPessoas)
            4 -> exibirEntre1_5e2_0(listaPessoas)
            5 -> calcularMediaAlturas(listaPessoas)
            6 -> println("Saindo do programa...")
            else -> println("Opção inválida. Tente novamente.")
        }
    } while (opcao != 6)
}

fun cadastrarPessoas(listaPessoas: MutableList<PessoaAltura>) {
    if (listaPessoas.size < 15) {
        for (i in 1..15) {
            println("\nCadastro da pessoa $i:")

            println("Digite o nome:")
            val nome = readLine()!!.trim()

            println("Digite a altura (em metros):")
            val altura = readLine()!!.toDouble()

            listaPessoas.add(PessoaAltura(nome, altura))
        }
        println("15 registros cadastrados com sucesso.")
    } else {
        println("Já foram cadastrados 15 registros.")
    }
}

fun exibirMenoresOuIguais1_5(listaPessoas: MutableList<PessoaAltura>) {
    val menoresOuIguais1_5 = listaPessoas.filter { it.altura <= 1.5 }

    if (menoresOuIguais1_5.isNotEmpty()) {
        println("\nPessoas com altura menor ou igual a 1.5m:")
        menoresOuIguais1_5.forEach { println("${it.nome} - ${it.altura}m") }
    } else {
        println("Não há pessoas com altura menor ou igual a 1.5m.")
    }
}

fun exibirMaioresQue1_5(listaPessoas: MutableList<PessoaAltura>) {
    val maioresQue1_5 = listaPessoas.filter { it.altura > 1.5 }

    if (maioresQue1_5.isNotEmpty()) {
        println("\nPessoas com altura maior que 1.5m:")
        maioresQue1_5.forEach { println("${it.nome} - ${it.altura}m") }
    } else {
        println("Não há pessoas com altura maior que 1.5m.")
    }
}

fun exibirEntre1_5e2_0(listaPessoas: MutableList<PessoaAltura>) {
    val entre1_5e2_0 = listaPessoas.filter { it.altura > 1.5 && it.altura < 2.0 }

    if (entre1_5e2_0.isNotEmpty()) {
        println("\nPessoas com altura entre 1.5m e 2.0m:")
        entre1_5e2_0.forEach { println("${it.nome} - ${it.altura}m") }
    } else {
        println("Não há pessoas com altura entre 1.5m e 2.0m.")
    }
}

fun calcularMediaAlturas(listaPessoas: MutableList<PessoaAltura>) {
    if (listaPessoas.isNotEmpty()) {
        val somaAlturas = listaPessoas.sumOf { it.altura }
        val media = somaAlturas / listaPessoas.size
        println("\nA média das alturas é: $media metros.")
    } else {
        println("Não há registros de altura cadastrados.")
    }
}
