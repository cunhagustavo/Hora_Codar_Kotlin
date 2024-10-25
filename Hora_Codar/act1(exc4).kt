/*
4 - Considerando a figura abaixo, escreva um programa para cada forma
que calcule e exiba em tela cada uma de suas respectivas áreas.
O usuário irá informar os valores de cada variável.
 */

fun main (){
    menu()

}
fun menu(){
    println("VAMOS CALCULAR!!")
    println("Escolha uma figura:")
    println ("1 - RETÂNGULO")
    println ("2 - QUADRADO")
    println ("3 - LOSANGO")
    println ("4 - TRAPEZIO")
    println ("5 - PARALILOGRAMO")
    println ("6 - TRIÂNGULO")
    println ("7 - CIRCUlO")
    println()
    println("Escolha uma figura:")
    var opcao = readLine()!!.toInt()

    when (opcao){
        1 -> {
            println("Vamos calcular a área do retângulo!!")
            println("Informe a base do retângulo:")
            val base = readLine()!!.toDouble()
            println("Informe a altura do retângulo:")
            val altura = readLine()!!.toDouble()
            val area = base*altura
            println("A Área do retângulo é: $area")
            println()
            println("Vamos calcular novamente (S/N)?")
            var resposta = readLine().toString()
            if (resposta == "S" || resposta == "s" || resposta == "sim" || resposta == "Sim") menu() else println("MUITO OBRIGADO! VOLTE SEMPRE!")
        }
        2 -> {
            println("Vamos calcular a área do quadrado!!")
            println("Informe o valor lateral do quadrado:")
            val lado = readLine()!!.toDouble()
            val area = lado*lado
            println("A Área do quadrado é: $area")
            println()
            println("Vamos calcular novamente (S/N)?")
            var resposta = readLine().toString()
            if (resposta == "S" || resposta == "s" || resposta == "sim" || resposta == "Sim") menu() else println("MUITO OBRIGADO! VOLTE SEMPRE!")
        }
        3 -> {
            println("Vamos calcular a área do losango!!")
            println("Informe a diagona maior do losango:")
            val diagM = readLine()!!.toDouble()
            println("Informe a diagona menor do losango:")
            val diagm = readLine()!!.toDouble()
            val area = (diagM*diagm)/2
            println("A Área do losango é: $area")
            println()
            println("Vamos calcular novamente (S/N)?")
            var resposta = readLine().toString()
            if (resposta == "S" || resposta == "s" || resposta == "sim" || resposta == "Sim") menu() else println("MUITO OBRIGADO! VOLTE SEMPRE!")
        }
        4 -> {
            println("Vamos calcular a área do trapézio!!")
            println("Informe a base maior do trapézio:")
            val baseM = readLine()!!.toDouble()
            println("Informe a base menor do trapézio:")
            val basem = readLine()!!.toDouble()
            println("Informe a altura do trapézio:")
            val altura = readLine()!!.toDouble()
            val area = ((baseM+basem)*altura)/2
            println("A Área do trapézio é: $area")
            println()
            println("Vamos calcular novamente (S/N)?")
            var resposta = readLine().toString()
            if (resposta == "S" || resposta == "s" || resposta == "sim" || resposta == "Sim") menu() else println("MUITO OBRIGADO! VOLTE SEMPRE!")
        }
        5 -> {
            println("Vamos calcular a área do paralelograma!!")
            println("Informe a base do paralelograma:")
            val base = readLine()!!.toDouble()
            println("Informe a altura do paralelograma:")
            val altura = readLine()!!.toDouble()
            val area = base*altura
            println("A Área do paralelograma é: $area")
            println()
            println("Vamos calcular novamente (S/N)?")
            var resposta = readLine().toString()
            if (resposta == "S" || resposta == "s" || resposta == "sim" || resposta == "Sim") menu() else println("MUITO OBRIGADO! VOLTE SEMPRE!")
        }
        6 -> {
            println("Vamos calcular a área do triângulo!!")
            println("Informe a base do triângulo:")
            val base = readLine()!!.toDouble()
            println("Informe a altura do triângulo:")
            val altura = readLine()!!.toDouble()
            val area = (base*altura)/2
            println("A Área do triângulo é: $area")
            println()
            println("Vamos calcular novamente (S/N)?")
            var resposta = readLine().toString()
            if (resposta == "S" || resposta == "s" || resposta == "sim" || resposta == "Sim") menu() else println("MUITO OBRIGADO! VOLTE SEMPRE!")
        }
        7 -> {
            println("Vamos calcular a área do círculo!!")
            println("Informe o raio do círculo:")
            val raio = readLine()!!.toDouble()
            val pi = 3.14
            val area = (pi*(raio*raio))
            println("A Área do círculo é: $area")
            println()
            println("Vamos calcular novamente (S/N)?")
            var resposta = readLine().toString()
            if (resposta == "S" || resposta == "s" || resposta == "sim" || resposta == "Sim") menu() else println("MUITO OBRIGADO! VOLTE SEMPRE!")
        }
        8 -> {
            println("Essa figura não existe")
            println("Gostaria de voltar ao menu (S/N)?")
            var resposta = readLine().toString()
            if (resposta == "S" || resposta == "s" || resposta == "sim" || resposta == "Sim") menu() else println("MUITO OBRIGADO! VOLTE SEMPRE!")
        }
    }
}
