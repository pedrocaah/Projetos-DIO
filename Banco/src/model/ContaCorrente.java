package model;

import service.Conta;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente, String numeroDaConta, String agencia) {
        super(cliente, numeroDaConta, agencia);
    }

    public void imprimirExtrato() {
        System.out.println("#### Extrato da Conta Corrente ####");
        super.extrato();
    }
}
