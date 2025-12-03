package SRP3;

public class CalculadoraDeDesconto {

    public double calcularDescontoFinal(double valorTotal, EstrategiaDeDesconto estrategia) {
        return estrategia.calcular(valorTotal);
    }
}