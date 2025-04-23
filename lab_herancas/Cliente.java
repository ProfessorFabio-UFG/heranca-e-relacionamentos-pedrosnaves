public class Cliente extends PessoaFisica{
    private double renda;
    private String interesses;
    private String profissao;

    public Cliente(PessoaFisica pf, double renda, String interesses, String profissao) {
        super(pf, pf.getCpf(), pf.getSexo(), pf.getEstadoCivil());
        this.renda = renda;
        this.interesses = interesses;
        this.profissao = profissao;
    }

    public String toString() {
        return "\nCliente: \n" +
                super.toString() +
                "\nRenda: " + this.renda +
                "\nInteresses: " + this.interesses +
                "\nProfissão: " + this.profissao;
    }
}
