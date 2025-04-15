public class Funcionario extends PessoaFisica{
    private int matricula;
    private double salario;
    private String cargo;

    public Funcionario(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil, int matricula, double salario, String cargo) {
        super(nome, endereco, telefone, cpf, sexo, estadoCivil);
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String toString() {
        return super.toString() +
                "\nMatricula: " + this.matricula +
                "\nSalario: " + this.salario +
                "\nCargo: " + this.cargo;
    }


}
