fun main() {

// Exercício 1.2 - converter a quantidade em real para dólar

    print("qual é a minha quantia em real?: R$ ")
    val reais = readln().toFloat()

    val dolar = reais / 4.9626 // cotação 02/06/2023
    print("Com os meus R$ ${reais} consigo comprar US$ ${dolar}")
}