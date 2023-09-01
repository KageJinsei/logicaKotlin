fun main() {

// Estruturas Condicionais 2 - sistema de doação

    print(
        "==========================\n" +
        "-- CRIANÇA SEMPRE FELIZ --\n" +
        "==========================\n" +
        "Muito obrigado por ajudar!\n" +
        "\n[1] para doar R$ 10,00\n" +
        "[2] para doar R$ 20,00\n" +
        "[3] para doar R$ 30,00\n" +
        "[4] para doar R$ 50,00\n" +
        "[5] para doar outro valor\n" +
        "[0] para cancelar\n" +
        "\nDigite a opção desejada: "
    )

    var opcaoDoacao = readln().toInt()

    when (opcaoDoacao) {
        1 -> {
            opcaoDoacao = 10
        }
        2 ->{
            opcaoDoacao = 20
        }
        3 -> {
            opcaoDoacao = 30
        }
        4 -> {
            opcaoDoacao = 50
        }
        5 ->{
            print("Qual valor deseja doar?: R$ ")
            opcaoDoacao = readln().toInt()
        }
        0 -> {
            opcaoDoacao = 0
        }
    }
    print(
        "\n-----------------------\n" +
        "  Sua doação foi de:\n  " +
        "    [ R$ ${opcaoDoacao} ]" +
        "\n ** MUITO OBRIGADO! **\n" +
        "-----------------------"
    )
}