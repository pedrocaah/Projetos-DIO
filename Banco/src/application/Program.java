package application;

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupança;

public class Program {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(new Cliente("Pedro", "123.456.789-10"),
                "123456-X", "0001-X");
        ContaCorrente cc1 = new ContaCorrente(new Cliente("Henrique", "154.845.789-10"),
                "456-X", "0001-X");
        ContaPoupança cp = new ContaPoupança(new Cliente("Pedro", "123.456.789-10"),
                "1236-X", "0002-X");
        ContaPoupança cp1 = new ContaPoupança(new Cliente("Henrique", "154.845.789-10"),
                "4567-X", "0002-X");

        cc.depositar(00.00);
//        cc.imprimirExtrato();
        cc.sacar(2000.00);
//        cc.imprimirExtrato();
        cc.tranferir(1000.00, cp1);
        cc.imprimirExtrato();
        cp1.imprimirExtrato();
    }
}
