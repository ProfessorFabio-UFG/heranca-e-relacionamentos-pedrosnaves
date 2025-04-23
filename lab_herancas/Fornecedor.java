public class Fornecedor extends PessoaJuridica{
    private String produtos;

    public Fornecedor(PessoaJuridica pj, String produtos){
        super(pj, pj.getCnpj(), pj.getRazaoSocial());
        this.produtos = produtos;
    }


    public String toString() {
        return "\nFornecedor: \n" +
                super.toString() +
                "\nProdutos: " + this.produtos;

    }
}
