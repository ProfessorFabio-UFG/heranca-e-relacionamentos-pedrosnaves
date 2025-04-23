public class Main {
    public static void main(String[] args) {

        Loja loja = new Loja();

        Pessoas p1 = new Pessoas("Paulo", "Rua 29, 145", "62999584175");
        Pessoas p2 = new Pessoas("Julia", "Rua 2, 1461", "62999584175");
        Pessoas p3 = new Pessoas("Raissa", "Rua 31, 202", "62999584175");
        Pessoas p4 = new Pessoas("Abadia", "Rua 45, 2957", "62999584175");
        Pessoas p5 = new Pessoas("Fabricio", "Rua 103, 10", "62999584175");

        PessoaFisica pf1 = new PessoaFisica(p1, "006523114789", 'm', 1);
        PessoaFisica pf2 = new PessoaFisica(p2, "12256488523", 'f', 1);
        PessoaFisica pf3 = new PessoaFisica(p3, "02155698741", 'f', 0);

        PessoaJuridica pj1 = new PessoaJuridica(p4, "47.182.395/0001-04", "Mecânica M7");
        PessoaJuridica pj2 = new PessoaJuridica(p5, "03.649.710/0001-65", "Lojas Estrela");

        Cliente c1 = new Cliente(pf1, 1520.35, "Agronegocio", "Agropecuarista");

        Funcionario f1 = new Funcionario(pf2, 1111, 5200.00, "Analista");
        Funcionario f2 = new Funcionario(pf3, 2222, 10800.50, "Superintendente");

        Fornecedor for1 = new Fornecedor(pj1, "Auto-peças");
        Fornecedor for2 = new Fornecedor(pj2, "Moveis planejados");

        loja.contratarFuncionarios(f1);
        loja.contratarFuncionarios(f2);

        loja.cadastrarCliente(c1);
        
        loja.cadastrarFornecedor(for1);
        loja.cadastrarFornecedor(for2);

        loja.ListarFuncionarios();
        loja.ListarClientes();
        loja.listarFornecedores();

        loja.demitirFuncionario(f2);

        System.out.println("\n------------------------------\n");

        loja.ListarFuncionarios();

    }
}
