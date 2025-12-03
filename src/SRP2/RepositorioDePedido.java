package SRP2;

public class RepositorioDePedido {
    public void salvar(Pedido pedido) {
        System.out.println("Persistência: Pedido " + pedido.getId() + " salvo no banco de dados");
    }
}
