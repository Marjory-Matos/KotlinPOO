//open permite que qualquer outra classe faca a heranca dessa classe
abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double

) {
    abstract val bonificacao: Double

}