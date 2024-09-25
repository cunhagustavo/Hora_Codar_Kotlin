/*7 - Escreva um algoritmo para ler as notas de avaliações de um aluno,
calcule e imprima a média (simples) desse aluno. Só devem ser aceitos valores válidos
durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido,
deve ser solicitado um novo valor ao usuário.
 */
fun main() {
    val notas = mutableListOf<Double>()
    var soma = 0.0

    while (notas.size < 6) {
        println("Digite as notas do aluno:")
        val input = readLine()
        val nota = input?.toDoubleOrNull()

        if (nota == null || nota < 0 || nota > 10) {
            println("Erro! Digite a nota novamente (valores entre 0 e 10):")
            continue
        }
        notas.add(nota)
        soma += nota
    }

    val media = soma / notas.size
    println("A média final é: $media")
}

