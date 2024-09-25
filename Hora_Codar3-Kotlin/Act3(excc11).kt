/*11 - Escreva um programa em que o usuário informe 10 valores
e escreva quantos desses valores lidos estão entre os números
24 e 42 (incluindo os valores 24 e 42) e quantos deles estão fora deste intervalo.
*/

fun main() {
    var valoresFora = 0
    var valoresDentro = 0

    for (i in 1..10) {
        println("Informe o ${i}º valor:")
        val valor = readln().toInt()

        if (valor >= 24 && valor <= 42) {
            valoresDentro = valoresDentro + 1
        } else {
            valoresFora = valoresFora + 1
        }
    }
    println("A quantidade de valores lidos fora do intervalo 24 a 42 é: $valoresFora")
    println("A quantidade de valores lidos dentro do intervalo 24 a 42 é: $valoresDentro")
}
