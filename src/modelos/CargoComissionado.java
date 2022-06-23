package modelos;

import calculo.CalculadoraSalario;

public class CargoComissionado extends Funcionarios implements CalculadoraSalario {
    double totalVendas;

    public CargoComissionado(String nome, String nascimento, String cpf, int matricula, double totalVendas) {
        super(nome, nascimento, cpf, matricula);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double CalculaSalario(double porcentagem) {
        double comissao = porcentagem * totalVendas;
        return comissao + totalVendas;
    }

    public String toString() {
        return "--------------------------------" + "\n" +
                "Cargo: Comissionado \n" +
                "Nome: " + getNome() + "\n" +
                "Data de Nascimento: " + getNascimento() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Matricula: " + getMatricula() + "\n" +
                "Total de vendas: " + totalVendas ;
    }
}
