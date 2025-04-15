public class PessoaFisica extends Pessoas {
    private String cpf;
    private char sexo;
    private int estadoCivil;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return this.cpf;
    }

    public char getSexo() {
        return this.sexo;
    }

    public int getEstadoCivil() {
        return this.estadoCivil;
    }

    public String toString() {
        return super.toString() +
                "\nCPF: " + this.cpf +
                "\nSexo: " + this.sexo +
                "\nEstado Civil: " + this.estadoCivil;
    }
}
