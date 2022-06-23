package modelos;

public class Funcionarios {
    private String nome;
    private String nascimento;
    private String cpf;
    private int matricula;


    public Funcionarios(String nome, String nascimento, String cpf, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCpf(){
        return cpf;
    }

    public  String getNascimento() {
        return nascimento;
    }

    public String toString() {
        return "Funcionário{" +
                "Nome:" + nome +'\'' +
                ", dataNascimento:'" + nascimento + '\'' +
                ", cpf:'" + cpf + '\'' +
                ", matricula:" + matricula +
                '}';
    }

}
