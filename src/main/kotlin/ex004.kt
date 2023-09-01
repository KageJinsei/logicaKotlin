fun main() {

// Exercício 1.4 - calcular valor da taxa (60%) em um produto importado

    print("Qual o valor do produto?: US$ ")
    val preco = readln().toFloat()

    val taxa = (preco * 60) / 100
    print("O valor da taxa será de US$ ${taxa}")
}