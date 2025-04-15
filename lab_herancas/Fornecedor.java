public class Fornecedor extends PessoaJuridica{
    private String produtos;

    public Fornecedor(String nome, String endereco, String telefone, String cnpj, String razaoSocial, String produtos){
        super(nome, endereco, telefone, cnpj, razaoSocial);
        this.produtos = produtos;
    }


    public String toString() {
        return super.toString() +
                "\nProdutos: " + this.produtos;

    }
}
