package OCP;

public class DescontoSazonal implements EstrategiaDeDesconto {
    @Override
    public double calcular(double valorTotal) {
        return valorTotal * 0.95;
    }
}