package br.com.alura.modelos;

public class Animal {
    private String nome, tipo;

    public Animal(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome = '" + nome + '\'' +
                ", tipo = '" + tipo + '\'' +
                "} ";
    }
}
