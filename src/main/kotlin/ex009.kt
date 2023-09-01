fun main() {

// Estruturas Condicionais 1.4 - verificar se está apto ou não (carteira de motorista)

    print("Digite o ano atual (yyyy): ")
    val anoAtual = readln().toInt()

    print("Digite o seu ano de nascimento (yyyy): ")
    val anoNascimento = readln().toInt()

    val idadeAtual = anoAtual - anoNascimento

    if (idadeAtual >= 18) {
        print("Parabéns! Você está apto a tirar a carteira de motorista!")
    } else {
        print("Que pena, você ainda não está apto...")
    }
}