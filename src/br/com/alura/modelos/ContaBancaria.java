package br.com.alura.modelos;

public class ContaBancaria {
    private int numConta;
    private double saldo;

    public ContaBancaria(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Classe Conta Bancaria {" +
                "Número da Conta = " + numConta +
                ", saldo = " + saldo +
                '}';
    }
}
