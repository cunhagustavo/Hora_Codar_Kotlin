/*5 - Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros
informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre
será menor que o segundo.
 */

fun main (){

    println("Escreva o primeiro número: ")
    var num1 = readln().toInt()

    println("Escreva o segundo número: ")
    var num2 = readln().toInt()

    if (num1 > num2) return println("Escreva o primeiro valor novamente (O primeiro valor deve ser menor que o segundo valor): ")

    var med = (num1+num2).toDouble()/2

    println("A média aritmétida de $num1 e $num2 é: $med")
}