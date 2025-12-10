package LSP;

public class ProcessadorDePagamento {

    public void processar(Pedido pedido, EstrategiaDeFrete estrategia) {
        double valorFinal = estrategia.calcularValorFinal(pedido);

        System.out.println("Processamento realizado Valor Final: R$ " + valorFinal);

        if (valorFinal < pedido.getValorBruto()) {
            throw new IllegalStateException("Erro: O valor final não pode ser menor que o valor dos produtos");
        }
    }
}
