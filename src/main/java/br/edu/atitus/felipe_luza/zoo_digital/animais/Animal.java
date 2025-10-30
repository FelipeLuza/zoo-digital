package br.edu.atitus.felipe_luza.zoo_digital.animais;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String especie;
    protected static int contador = 0;

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        contador++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    public abstract void emitirSom();

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public static int getTotalAnimais() {
        return contador;
    }
}
