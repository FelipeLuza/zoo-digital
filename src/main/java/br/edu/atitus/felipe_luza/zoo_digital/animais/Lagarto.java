package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Corredor;

public class Lagarto extends Reptil implements Corredor {

    public Lagarto(String nome, int idade) {
        super(nome, idade, "Lagarto");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando baixinho.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo insetos.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " corre rápido pelas pedras.");
    }
}
