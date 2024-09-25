/*8 - Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
Considere que o N será sempre maior que ZERO. N  é um valor informado pelo usuário
*/

fun main() {
    iniciar()
}
fun iniciar(){
    println("Informe um valor (Maior que 0): ")
    val valor = readLine()?.toInt()

    if (valor != null && valor > 0 ) {
        for (i in 1..valor){
            println(i)
        }
    } else {
        println("Erro! Digite um valor maior que 0")
        iniciar()
    }
}
