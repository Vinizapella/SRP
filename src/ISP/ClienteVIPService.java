package ISP;


public class ClienteVIPService implements ICadastroCliente, INotificador, IGerenciadorFidelidade {

    // Metodos de Cadastro
    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("vip: Cadastrando " + nome);
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "vip: Encontrado cliente com email " + email;
    }

    // metodos de notificacao
    @Override
    public void enviarNotificacao(String email, String mensagem) {
        System.out.println("vip: Enviando notificacao para " + email);
    }

    // metodos de fidelidade
    @Override
    public void aplicarDescontoVIP(String email, double percentual) {
        System.out.println("vip: usando " + percentual + "% de desconto para " + email);
    }
}

