public class Pessoas {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoas(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String toString() {
        return "\nNome: " + this.nome +
                "\nEndereço: " + this.endereco +
                "\nTelefone: " + this.telefone;
    }

}
