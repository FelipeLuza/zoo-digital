package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Corredor;

public class Boi extends Mamifero implements Corredor {

    public Boi(String nome, int idade) {
        super(nome, idade, "Boi");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está mugindo: Muuuuu!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo capim.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo pelo pasto.");
    }
}
