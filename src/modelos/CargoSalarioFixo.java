package modelos;

import calculo.CalculadoraSalario;

public class CargoSalarioFixo extends Funcionarios implements CalculadoraSalario {
    double salarioFixo;

    public CargoSalarioFixo(String nome, String nascimento, String cpf, int matricula, double salarioFixo) {
        super(nome, nascimento, cpf, matricula);
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double CalculaSalario(double porcentagem) {
        double comissao = salarioFixo * porcentagem;
        return comissao + salarioFixo;
    }

    public String toString() {
        return "--------------------------------" + "\n" +
                "Cargo: Salario Fixo" + "\n" +
                "Nome: " + getNome() + "\n" +
                "Data de nascimento: " + getNascimento() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Matricula: " + getMatricula() + "\n" +
                "SalarioFixo: " + salarioFixo;
    }

}
