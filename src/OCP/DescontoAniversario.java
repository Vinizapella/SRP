package OCP;

public class DescontoAniversario implements EstrategiaDeDesconto {
    @Override
    public double calcular(double valorTotal) {
        return valorTotal * 0.80;
    }
}