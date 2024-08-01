package desafio_salario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorImposto;
        System.out.println("Digite o valor bruto");
        double valorBruto = sc.nextDouble();
        System.out.println("Digite o valor dos beneficios");
        double valorBeneficios = sc.nextDouble();

        if (valorBruto <= 1100.00) {
            valorImposto = 0.05 * valorBruto;
        } else if (valorBruto < 2500.00) {
            valorImposto = 0.1 * valorBruto;
        } else {
            valorImposto = 0.15 * valorBruto;
        }
        double salarioLiquido = valorBruto - valorImposto + valorBeneficios;
        System.out.printf("Salario líquido é: %.2f", salarioLiquido);
        sc.close();
    }
}

