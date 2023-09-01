fun main() {

// Estruturas Condicionais 2.3 - calcular a média e mostrar o aproveitamento

    print(
        "----------------\n" +
        "ESCOLA TECH PLUS\n" +
        "----------------\n"
    )

    print("Digite a primeira nota: ")
    val primeiraNota = readln().toDouble()

    print("Digite a segunda nota: ")
    val segundaNota = readln().toDouble()

    val resultado = (primeiraNota + segundaNota) / 2

    if (resultado >= 9) {
        print(
            "-------------------\n" +
            "Média Final: ${resultado}\n" +
            "Aproveitamento: A\n" +
            "\n-------------------")
    }
    if (resultado >= 7 && resultado <= 8) {
        print(
            "-------------------\n" +
            "Média Final: ${resultado}\n" +
            "Aproveitamento: B\n" +
            "\n-------------------")
    }
    if (resultado >= 5 && resultado <= 6) {
        print(
            "-------------------\n" +
            "Média Final: ${resultado}\n" +
            "Aproveitamento: C\n" +
            "\n-------------------")
    }
    if (resultado >= 3 && resultado <= 4) {
        print(
            "-------------------\n" +
            "Média Final: ${resultado}\n" +
            "Aproveitamento: D\n" +
            "\n-------------------")
    }
    if (resultado >= 1 && resultado <= 2) {
        print(
            "-------------------\n" +
            "Média Final: ${resultado}\n" +
            "Aproveitamento: E\n" +
            "\n-------------------")
    }
    if (resultado <= 0) {
        print(
            "-------------------\n" +
            "Média Final: ${resultado}\n" +
            "Aproveitamento: F\n" +
            "REPROVADO!!!" +
            "\n-------------------")
    }
}