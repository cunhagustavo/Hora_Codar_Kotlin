//Crie um programa onde o usuário possa cadastrar estudantes sem limites,
// e, em seguida, Se o usuário digitar "PARE" o programa deve exibir a quantidade
// de estudantes cadastrados e a lista com cada um deles.

fun main() {

    val aluno = mutableListOf<String>()
    var cont = true

    while (cont){
        println("Digite o nome do aluno ou 'PARE' para finalizar:")

        val nome = readln()!!.trim()

        if (nome.equals("PARE", ignoreCase = true)) cont = false else aluno.add(nome)
    }

    println()
    println("Qantidade de alunos cadastrados: ${aluno.size}")

    println()
    println("Lista dos alunos cadastrados:")
    for (aluno in aluno){
        println(aluno)
    }
}