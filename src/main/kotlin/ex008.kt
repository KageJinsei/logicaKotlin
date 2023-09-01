fun main() {

// Estruturas Condicionais 1.3 - calcular média e verificar se o aluno foi aprovado ou reprovado


    print(
        "=====================\n" +
        "1 - KT Tecnologias \n" +
        "2 - Java Tecnologias \n" +
        "3 - C# Informáticas \n" +
        "===================== \n" +

        "escolha a escola: "
    )

    val instituicao = readln().toInt()


    print("Digite o seu nome: ")
    val nome = readln()

    print("Digite a sua nota em conhecimentos de Hardware: ")
    val nota1 = readln().toFloat()
    print("Digite a sua nota em conhecimentos de Software: ")
    val nota2 = readln().toFloat()

    val notaFinal = (nota1 + nota2) / 2
    println("A média do aluno(a) $nome é de: $notaFinal")

    if (notaFinal >= 7) {
        print("Parabéns! Você foi aprovado na ")
    }
    else {
        if (notaFinal >= 5 && notaFinal < 7) {
            print("Você está em recuperação na ")
        } else {
            println("Ah, que pena! Você foi reprovado...")
        }
    }

    if (instituicao == 1) {
        print("KT Tecnologias")
    }
    if (instituicao == 2) {
        print("Java Tecnologias")
    }
    if (instituicao == 3) {
        print("C# Informáticas")
    }
}