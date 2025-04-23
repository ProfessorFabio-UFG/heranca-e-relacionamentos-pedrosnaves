public class Funcionario extends PessoaFisica{
    private int matricula;
    private double salario;
    private String cargo;

    public Funcionario(PessoaFisica pf,int matricula, double salario, String cargo) {
        super(pf, pf.getCpf(), pf.getSexo(), pf.getEstadoCivil());
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String toString() {
        return "\nFuncionario: \n" +
                super.toString() +
                "\nMatricula: " + this.matricula +
                "\nSalario: " + this.salario +
                "\nCargo: " + this.cargo;
    }


}
