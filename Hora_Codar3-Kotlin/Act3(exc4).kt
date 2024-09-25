//4 - Faça um algoritmo que calcule e escreva a média aritmética dos
// números inteiros entre 15 (inclusive) e 100 (inclusive).

fun main(){

    var num = 15
    var cont = 0
    var soma = 0

    cont = 101 - 15

    while (num <= 100){
        soma = soma + num
        num = num + 1
    }

    var med = soma/cont

    println("A média aritmética dos números inteiros entre 15 e 100 é: $med")
}