fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "123456789",
        salario = 1230.0,
        tipo = 1
    )
    println("Nome ${alex.nome} CPF ${alex.cpf} Salario ${alex.salario} ")
    println("bonificacao ${alex.bonificacao()}")
}



