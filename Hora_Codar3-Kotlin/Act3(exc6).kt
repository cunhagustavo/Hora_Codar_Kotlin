/*6 - Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?"
e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente,
caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.
 */

fun main () {

    var qntdalunos = 0

while (true){
    println("Escreva a 1º nota: ")
    var nota1 = readln().toDouble()
    println("Escreva a 2º nota: ")
    var nota2 = readln().toDouble()

    var med = (nota1 + nota2) / 2


    if (med >= 9.5){println("Aluno aprovado! A média foi $med")
    qntdalunos += 1
    }else { println("Aluno reprovado! A média foi $med")}

    println("Calcular a média de outro aluno? (S/N)")
    var resposta = readln()

    if (resposta == "N" || resposta == "n" || resposta == "Não" || resposta == "não") println("A quantidade de alunos aprovados é: $qntdalunos")
    break
}
}


