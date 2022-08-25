//open permite que qualquer outra classe faca a heranca dessa classe
open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double

) {
    open val bonificacao: Double get() = salario * 0.1

}