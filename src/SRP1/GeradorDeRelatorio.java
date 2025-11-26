package SRP1;

public class GeradorDeRelatorio {

    public void imprimir(Funcionario funcionario, CalculadoraDeSalario calculadora){

        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);

        System.out.println("--- Relatório de Funcionário ---");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário Base: R$ " + funcionario.getSalarioBase());
        System.out.println("Salário Líquido Calculado: R$ " + salarioLiquido);
        System.out.println("--------------------------------");

    }
}
