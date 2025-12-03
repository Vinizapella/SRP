package SRP2;

public class NotificadorDePedido {
    public void enviarConfirmacao(Pedido pedido) {
        if (pedido.isPago()) {
            System.out.println("notificação: Email de confirmação enviado para: " + pedido.getEmailCliente());
        }
    }
}
