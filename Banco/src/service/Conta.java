package service;

import model.Cliente;
import model.IConta;

public abstract class Conta implements IConta {

    private double saldo;
    private String agencia;
    private String numeroDaConta;
    private final Cliente cliente;

    public Conta(Cliente cliente, String numeroDaConta, String agencia) {
        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque de: " + valor + " negado, valor disponível para saque: " + this.saldo);
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Insira um valor de depósito maior do que 0");
        }
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transfêrencia");
        }
    }

    @Override
    public void extrato() {
        System.out.println(String.format("Nome: %s", cliente.getNome()));
        System.out.println(String.format("CPF: %s", cliente.getCpf()));
        System.out.println(String.format("Agência: %s", this.agencia));
        System.out.println(String.format("Número: %s", this.numeroDaConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
