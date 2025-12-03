package SRP3;

public class Main {
    public static void main(String[] args) {
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        double valorCompra = 1000.00;

        System.out.println("VIP: " +
                calculadora.calcularDescontoFinal(valorCompra, new DescontoVIP()));

        System.out.println("Cupom: " +
                calculadora.calcularDescontoFinal(valorCompra, new DescontoCupom()));

        System.out.println("Aniversário: " +
                calculadora.calcularDescontoFinal(valorCompra, new DescontoAniversario()));
    }
}
