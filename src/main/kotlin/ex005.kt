fun main() {

// Exercício 1.5 - calcular o valor de um emprestimo com juros de 20% e dividir em parcelas

    print("Qual o valor do emprestimo?: R$ ")
    val emprestimo = readln().toFloat()
    val juros: Double = 20.0 / 100

    print("Quantas parcelas?: ")
    val parcelas = readln().toInt()

    val valorDebitoJuros = emprestimo + (emprestimo * juros)
    val valorFinal = valorDebitoJuros / parcelas
    print("Você pagará ${parcelas} de ${valorFinal}")
}