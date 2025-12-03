package SRP4;

public class FretePadrao implements EstrategiaDeFrete {
    private double valorDoFrete;

    public FretePadrao(double valorDoFrete) {
        this.valorDoFrete = valorDoFrete;
    }

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto() + this.valorDoFrete;
    }
}
