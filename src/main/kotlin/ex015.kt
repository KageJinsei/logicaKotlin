fun main() {

// Estruturas de Repetição 1.2 - somador numérico

    var cont: Int = 1
    var soma: Int = 0
    var maior: Int = 0
    var menor = ' '.code

    while (cont <= 5) {
        print("Digite o ${cont}o. valor: ")
        var numero = readln().toInt()

        if (numero > maior) {
            maior = numero
        }
        if (numero < menor) {
            menor = numero
        }
        soma = soma + numero
        cont = cont + 1
    }

    println("A soma de todos os valores foi: ${soma}")
    println("O maior valor digitado foi: ${maior}")
    print("O menor valor digitado foi: ${menor}")
}