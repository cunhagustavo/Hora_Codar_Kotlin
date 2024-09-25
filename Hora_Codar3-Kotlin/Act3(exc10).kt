/*10 - Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.*/

fun main() {
    inicio()
}
    fun inicio () {
        println("BEM-VINDO A TABUADA!!")
        println("Informe um número e vamos calcular:")
        val num = readLine()?.toInt()

        if (num != null && num > 0) {
            for (i in 1..num!!) {
                println("Tabuada do $i")

                for (j in 1..10) {
                    println("$i X $j = ${i * j}")
                }
                println("")
            }
        }else{
            println("Erro! Informe um valor positivo maior que 1:")
            inicio()
        }
    }

