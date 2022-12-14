class Gerente(
     nome: String,
     cpf: String,
     salario: Double,
     senha: Int

) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

     override val bonificacao: Double get() = bonificacao * 0.1 + salario

}