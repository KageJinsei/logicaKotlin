fun main() {

// Estruturas de Repetição 1.3 - conversor de moedas com repetição

    var contador: Int = 0
    print("Quantas vezes você quer converter?: ")
    var quantidade = readln().toInt()

    while(contador < quantidade) {
        print("qual é a minha quantia em real?: R$ ")
        val reais = readln().toFloat()

        val dolar = reais / 4.8128 // cotação 17/07/2023
        println("Com os meus R$ ${reais} consigo comprar US$ ${dolar}")
        contador = contador + 1
    }
}