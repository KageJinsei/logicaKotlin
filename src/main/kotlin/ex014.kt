fun main() {

// Estruturas de Repetição 1 - contando e saltando números

    var contador = 0

    print("Quer contar até quanto?: ")
    var valor = readln().toInt()
    print("Qual será o valor do salto?: ")
    var salto = readln().toInt()

    while (contador <= valor) {
        print(contador)
        contador = contador + salto
       }
    print("\nTerminei de contar")
}