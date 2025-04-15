import java.util.ArrayList;

public class Loja {
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Cliente> cliente;
    private ArrayList<Fornecedor> fornecedor;

    public Loja() {
        funcionarios = new ArrayList<>();
        cliente = new ArrayList<>();
        fornecedor = new ArrayList<>();
    }

    public void contratarFuncionarios(Funcionario f) {
        funcionarios.add(f);
    }

    public void demitirFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }

    public void cadastrarCliente(Cliente c) {
        cliente.add(c);
    }

    public void cadastrarFornecedor(Fornecedor fr) {
        fornecedor.add(fr);
    }

    public void ListarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public void ListarClientes() {
        for (Cliente c : cliente) {
            System.out.println(c);
        }
    }

    public void listarFornecedores() {
        for (Fornecedor fr : fornecedor) {
            System.out.println(fr);
        }
    }
}
