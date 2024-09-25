//2 - Crie uma bomba relógio (usando somente código - para deixar claro!)
// cuja contagem regressiva vá de 30 a 0. No final da repetição escreva "EXPLOSÃO".

fun main(){
    var cont = 31

    while (cont >= 1){
        cont = cont - 1
        println("Detonação em $cont segundos")
    }

    println("BOOOOOOOOOOOOOOM!!!!")
}