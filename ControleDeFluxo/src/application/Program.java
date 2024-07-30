package application;

import exceptions.ParametrosInvalidosException;
import service.Contador;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Contador contador = new Contador();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int primeiro = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundo = sc.nextInt();
        try{
            contador.contar(primeiro, segundo);
        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Reinicie o programa");
        }

        sc.close();

    }
}
