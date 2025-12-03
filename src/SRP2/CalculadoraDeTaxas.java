package SRP2;

public class CalculadoraDeTaxas {
    public double calcularValorFinal(Pedido pedido) {
        double valor = pedido.getValorBruto();
        double frete = calcularFrete(valor);
        double impostos = valor * 0.15;

        double valorFinal = valor + frete + impostos;

        System.out.println("-> Frete (R$" + frete + ") e Impostos (R$" + impostos + ") calculados");

        return valorFinal;
    }

    private double calcularFrete(double valor) {
        if (valor < 500.00) {
            return 50.00;
        }
        return 0.0;
    }

}
