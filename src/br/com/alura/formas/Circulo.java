package br.com.alura.formas;

import br.com.alura.interfaces.Forma;

public class Circulo implements Forma {
    private double raio, pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return pi * (raio*raio);
    }
}
