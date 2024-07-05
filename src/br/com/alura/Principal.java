package br.com.alura;

import br.com.alura.formas.Circulo;
import br.com.alura.formas.Quadrado;
import br.com.alura.interfaces.Forma;
import br.com.alura.modelos.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        var pessoa1 = new Pessoa("Natan", 20);
        var pessoa2 = new Pessoa("Maria", 19);
        var pessoa3 = new Pessoa("Mauricio", 63);

        //Exercicio 1
        System.out.println("\nExercicio 1:\n");
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        listaDePessoas.forEach(System.out::println);

        //Exercicio 2
        System.out.println("\nExercicio 2:\n");
        var animal1 = new Animal("Berta", "Ovelha");
        var animal2 = new Cachorro("Rex", "Cachorro", "Beagle");

        ArrayList<Animal> listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add(animal1);
        listaDeAnimais.add(animal2);

        for (Animal item : listaDeAnimais){
            System.out.println(item.toString());

            //Exercicio 3
            //verifica se a classe a qual o item pertence é a cachorro
            if (item instanceof Cachorro cachorro){
                System.out.println("\nExercicio 3:\n");
                System.out.println("É um cachorro, foi necessário o casting! Raça: "+cachorro.getRaca());
            }
        }

        //Exercicio 4
        System.out.println("\nExercicio 4:\n");
        var produto1 = new Produto("Azeite", 20.50);
        var produto2 = new Produto("Leite", 10.76);
        var produto3 = new Produto("Kiwi", 200.99);
        var produto4 = new Produto("Morango", 1500.98);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);

        //incrementa a variável somaPrecos para calcular a média
        double somaPrecos = 0;
        for (Produto produto : listaDeProdutos){
            somaPrecos += produto.getPreco();
        }

        //realiza a media dos preços com o tamanho da lista de produtos
        double media = somaPrecos / listaDeProdutos.size();
        System.out.printf("A média de preço dos produtos é de: R$ %.2f%n", media);

        //Exercicio 5
        System.out.println("\nExercicio 5:\n");

        var circulo1 = new Circulo(5.7);
        var circulo2 = new Circulo(9.9);
        var quadrado1 = new Quadrado(5.7);
        var quadrado2 = new Quadrado(75.2);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo1);
        listaDeFormas.add(circulo2);
        listaDeFormas.add(quadrado1);
        listaDeFormas.add(quadrado2);
        for (Forma item : listaDeFormas){
            //verifica a qual classe o item pertence
            if (item instanceof Circulo){
                System.out.println("Area do circulo: "+item.calcularArea());
            } else if (item instanceof Quadrado) {
                System.out.println("Area do quadrado: "+item.calcularArea());
            } else {
                System.out.println("Não há cálculo de área para essa forma.");
            }
        }

        //Exercicio 6
        System.out.println("\nExercicio 6:\n");

        var conta1 = new ContaBancaria(1, 760.54);
        var conta2 = new ContaBancaria(2, 712.213);
        var conta3 = new ContaBancaria(3, 12.4);
        var conta4 = new ContaBancaria(4, 450.54);
        
        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        listaDeContas.add(conta4);

        double maiorSaldo = 0;
        int posicaoMaiorSaldo = 0;
        for (ContaBancaria item : listaDeContas){
            //verifica se o saldo do item é maior que o atribuído na variável maiorSaldo, utilizado como uma flag
            if(item.getSaldo() > maiorSaldo){
                posicaoMaiorSaldo = listaDeContas.indexOf(item);
            }
        }
        System.out.println("A conta que tem mais saldo é a seguinte:\n" + listaDeContas.get(posicaoMaiorSaldo));
    }
}
