package SRP3;

public class DescontoVIP implements EstrategiaDeDesconto {
    @Override
    public double calcular(double valorTotal) {
        return valorTotal * 0.90;
    }
}