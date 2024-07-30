package application;

import service.SalarioService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor bruto");
        double valorBruto = sc.nextDouble();
        System.out.println("Digite o valor dos beneficios");
        double valorBeneficios = sc.nextDouble();

        SalarioService salarioService = new SalarioService();
        salarioService.calculoSalario(valorBruto, valorBeneficios);
        System.out.println(salarioService);

        sc.close();
    }
}
