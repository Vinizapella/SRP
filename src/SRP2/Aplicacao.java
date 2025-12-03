package SRP2;

public class Aplicacao{

public static void main(String[] args) {
    ValidadorDeEstoque validador = new ValidadorDeEstoque();
    CalculadoraDeTaxas calculadora = new CalculadoraDeTaxas();
    RepositorioDePedido repositorio = new RepositorioDePedido();
    NotificadorDePedido notificador = new NotificadorDePedido();

    ServicoDeProcessamentoDePedido servico = new ServicoDeProcessamentoDePedido(
            validador, calculadora, repositorio, notificador
    );
    Pedido pedido1 = new Pedido("PED-789", 450.00, 2, "vzapella@gmail.com");

    System.out.println("Iniciando");

    try {
        Pedido pedidoProcessado = servico.processar(pedido1);

        System.out.println("\nresultado final");
        System.out.println("Status do Pedido " + pedidoProcessado.getId() + ": pagamento efetuado");
        System.out.println("Valor Bruto: R$" + pedidoProcessado.getValorBruto());
        System.out.println("Valor Final (com taxas): R$" + pedidoProcessado.getValorFinal());

    } catch (Exception e) {
        System.out.println("Falha no processamento: " + e.getMessage());
    }
}
}