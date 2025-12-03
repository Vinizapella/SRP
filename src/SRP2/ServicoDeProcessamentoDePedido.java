package SRP2;

public class ServicoDeProcessamentoDePedido {
    private final ValidadorDeEstoque validador;
    private final CalculadoraDeTaxas calculadora;
    private final RepositorioDePedido repositorio;
    private final NotificadorDePedido notificador;

    public ServicoDeProcessamentoDePedido(
            ValidadorDeEstoque validador,
            CalculadoraDeTaxas calculadora,
            RepositorioDePedido repositorio,
            NotificadorDePedido notificador) {

        this.validador = validador;
        this.calculadora = calculadora;
        this.repositorio = repositorio;
        this.notificador = notificador;

    }
    public Pedido processar(Pedido pedido) throws Exception {
        validador.validar(pedido);

        double valorFinal = calculadora.calcularValorFinal(pedido);
        pedido.setValorFinal(valorFinal);

        pedido.setPago(true);

        repositorio.salvar(pedido);

        notificador.enviarConfirmacao(pedido);

        return pedido;

    }
}