//Crie uma array de planetas que inclua "Terra", "Marte", "Plutão", "Vênus",
// "Júpiter", "Saturno"  e, em seguida, peça ao usuário para digitar  o nome de um planeta.
//Verifique se o planeta que o usuário informou está na array e informe ao usuário.

fun main(){

    val planetas = arrayOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno",)

    println("Digite o nome de um planeta:")
    var listaplanetas = readln()!!.trim()

    if (planetas.any { it.equals(listaplanetas, ignoreCase = true) }) {
        println("O planeta $listaplanetas está na lista!")
    }else{
        println("O planeta $listaplanetas não está na lista.")
    }
}