fun main() {

// Estruturas de Repetição 1.4 - contagem inteligente

    print(
        "CONTAGEM INTELIGENTE\n" +
                "--------------------\n"
    )
    print("Inicio: ")
    val inicio = readln().toInt()
    print("Fim: ")
    val fim = readln().toInt()
    print(
        "--------------------\n" +
                "  C O N T A N D O\n" +
                "--------------------\n"
    )

        if (inicio < fim) {
            var numero = inicio
            while (numero <= fim) {
                print("$numero..")
                numero++
            }
        } else {
            var numero = inicio
            while (numero >= fim) {
                print("$numero..")
                numero--
            }
        }
}

