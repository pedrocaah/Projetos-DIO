package model;

import service.Conta;

public class ContaPoupança extends Conta {


    public ContaPoupança(Cliente cliente, String numeroDaConta, String agencia) {
        super(cliente, numeroDaConta, agencia);
    }

    public void imprimirExtrato() {
        System.out.println("#### Extrato da Conta Poupança ####");
        super.extrato();
    }
}
