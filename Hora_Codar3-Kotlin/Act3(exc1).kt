// 1 - Escreva um algoritmo para ler 2 valores informados pelo usuário e se o segundo valor informado
// for igual ou menor que ZERO, deve ser lido um novo valor. Ou seja, para o segundo valor não pode
// ser aceito o valor zero, nem um valor negativo.

// O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor e exibir
// o resultado ao usuário.

fun main() {
    print("Digite o 1º valor: ")
    var num1 = readln().toInt()

        print("Digite o 2º valor: ")
        var num2 = readln().toInt()

        while (num2 <= 0) {
            print("Digite o 2º valor (o valor não deve ser 0 ou menor que zero): ")
            num2 = readln().toInt()

        }


    if (num2 > 0){
        var result = num1/num2
        println("O valor da divisão é: $result")
    }
}