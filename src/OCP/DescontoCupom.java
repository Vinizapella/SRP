package OCP;

public class DescontoCupom implements EstrategiaDeDesconto {
    @Override
    public double calcular(double valorTotal) {
        return valorTotal * 0.85;
    }
}