public class PessoaJuridica extends Pessoas{
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String razaoSocial) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String toString() {
        return super.toString() +
                "\nCNPJ: " + this.cnpj +
                "\nRazão Social: " + this.razaoSocial;
    }

}
