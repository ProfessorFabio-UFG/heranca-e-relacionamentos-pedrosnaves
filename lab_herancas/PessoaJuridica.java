public class PessoaJuridica extends Pessoas{
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(Pessoas p, String cnpj, String razaoSocial) {
        super(p.getNome(), p.getEndereco(), p.getTelefone());
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
