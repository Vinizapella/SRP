package ISP;

public class ClienteComumService implements ICadastroCliente {

    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("comum: Cadastrando " + nome);
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "comum: Encontrado cliente com email " + email;
    }
}
