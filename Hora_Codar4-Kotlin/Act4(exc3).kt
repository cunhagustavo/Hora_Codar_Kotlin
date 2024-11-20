//Vamos criar uma lista de compras.
//Crie uma array de frutas, exiba-a ao usuário e, em seguida,
// peça ao usuário para digitar o nome de uma das frutas.
//
//Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista".
//
//Peça novamente para o usuário digitar o nome de uma fruta para ser removida.
//
//Sempre que o usuário procurar por uma fruta que não está no array
// exiba a mensagem "Fruta indisponível no nosso mercado".
//
//Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada".

fun main(){

    val frutas = mutableListOf<String>("Maça", "Morango", "Uva", "Laranja", "Manga")

    println("Lista das frutas disponivéis pra compra: $frutas")

    while (frutas.isNotEmpty()){
        println()
        println("Escolha uma opção:")
        println("1 - Remover uma fruta da lista")
        println("2 - Adicionar uma fruta da lista")
        println("3 - Sair")

        val opcao = readln()!!.trim().toInt()

        when (opcao){
            1 -> {
                println("Digite a fruta que deseja remover:")
                val frutasUser = readln()!!.trim().toLowerCase()

                if (frutas.any { it.toLowerCase() == frutasUser}) {
                    frutas.removeIf { it.toLowerCase() == frutasUser }
                    println("Fruta foi retirada da lista")
                }else{
                    println("Fruta indisponível no nosso mercado.")
                }
            }
            2 ->{
                println("Digite a fruta que deseja adicionar:")
                val frutasUser = readln()!!.trim()

                frutas.add(frutasUser)
                println("Fruta '$frutasUser' foi adicionada à lista.")
            }
            3 -> {
                println("Saindo...")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
        println("Lista atual de frutas: $frutas")
    }
    println("Lista de compras finalizadas.")
}