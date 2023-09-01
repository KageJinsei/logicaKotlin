fun main() {

// Exercício 1.3 - converter a temperatura de fahrenheit para celsius

    print("Qual é a temperatura em fahrenheit?: F° ")
    val tempoFahrenheit = readln().toFloat()

    val tempoCelsius = (tempoFahrenheit - 32) / 1.8
    println("A temperatura no Brasil seria C° ${tempoCelsius}")

    if (tempoCelsius >= 30) {
        println("Está calor!")
    }
    if (tempoCelsius <= 10) {
        println("Está frio!")
    }
}