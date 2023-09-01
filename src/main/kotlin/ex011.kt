fun main() {

// Estruturas Condicionais 2.2 - definir novo salário de acordo a quantidade de dependentes

    print("Digite o nome do funcionário: ")
    val nomeFuncionario = readln()

    print("Digite o salário do funcionário: ")
    val salarioFuncionario = readln().toDouble()

    print("Digite a quantidade de dependentes deste funcionário: ")
    val dependentes = readln().toInt()

    var novoSalario: Float

    when (dependentes) {
        0 -> {
            novoSalario = (salarioFuncionario + (salarioFuncionario*5/100)).toFloat()
        }
        1, 2, 3 -> {
            novoSalario = (salarioFuncionario + (salarioFuncionario*10/100)).toFloat()
        }
        4, 5, 6 -> {
            novoSalario = (salarioFuncionario +(salarioFuncionario*15/100)).toFloat()
        }
        else -> {
            novoSalario = (salarioFuncionario + (salarioFuncionario*18/100)).toFloat()
        }
    }
    print("O novo salário de ${nomeFuncionario} é de ${novoSalario}")    
}