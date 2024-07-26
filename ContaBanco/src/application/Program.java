package application;

import model.Conta;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número de conta: ");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o número da agência com código separado por '-': ");
        String agencia = sc.next();
        System.out.println("Por favor, digite o nome completo do Cliente: ");
        String nomeCliente = sc.next();
        System.out.println("Por favor, insira a quantia que deseja fazer ao deposito inicial: ");
        double deposito = sc.nextDouble();
        Conta conta = new Conta(numero, agencia, nomeCliente, deposito);

        System.out.println(conta);

        sc.close();
    }
}
