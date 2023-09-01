fun main() {

// Estruturas Condicionais 1 - descubra se um número é par ou impar

    print("Digite um número: ")
    val numero = readln().toInt()

    if (numero % 2 == 0) {
        print("O número ${numero} é PAR!")
    } else {
        print("O número ${numero} é IMPAR!")
    }
}