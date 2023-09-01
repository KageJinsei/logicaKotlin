fun main() {

// Exercírio 1 - calcular idade subtraindo os valores fornecidos

    print("Em que ano nós estamos?: ")
    val anoAtual = readln().toInt()

    print("Em que ano eu nasci?: ")
    val anoNascimento = readln().toInt()

    val idade = anoAtual - anoNascimento
    print("Então a minha idade é ${idade}!")
}