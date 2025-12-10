package LSP;

public class Main {
    public static void main(String[] args) {
        ProcessadorDePagamento processador = new ProcessadorDePagamento();
        Pedido pedido = new Pedido(100.00);

        System.out.println("Pedido Comum");
        processador.processar(pedido, new FretePadrao(20.00));

        System.out.println("Pedido Promocional");
        processador.processar(pedido, new FreteGratis());
    }
}
