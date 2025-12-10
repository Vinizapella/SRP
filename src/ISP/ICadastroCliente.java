package ISP;

// Interface coesa para operações básicas de cadastro
public interface ICadastroCliente {

    void cadastrarCliente(String nome, String email);

    String buscarClientePorEmail(String email);

}

