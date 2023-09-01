import kotlin.math.pow

fun main() {

// Estruturas Condicionais 1.2 - calcular IMC

    print("Qual é o seu peso?: ")
    val massa = readln().toFloat()

    print("Qual é a sua altura?: ")
    val altura = readln().toFloat()

    val imc: Float = massa / (altura.pow(2))
    println("O seu IMC é: ${imc}")

    if (imc < 17) {
        println("Você está abaixo do peso.")
    }
    if (imc >= 18.5  && imc < 25.0) {
        println("Parabéns! Você está no seu peso ideal.")
    } else {
        if (imc >= 25 && imc < 30) {
            println("Você está no sobrepeso")
        }
    }
    if(imc >= 30 && imc < 35) {
        print("Você está na obesidade!")
    } else {
        if (imc >= 35 && imc < 40) {
            println("Você está na obesidade severa!!")
        }
    }
    if(imc >= 40) {
        println("PERIGO! Você está na obesidade mórbida!!!")
    }
}