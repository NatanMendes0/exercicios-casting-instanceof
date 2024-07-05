package br.com.alura.modelos;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, String tipo, String raca) {
        super(nome, tipo);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
