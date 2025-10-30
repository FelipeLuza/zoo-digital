package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Nadador;

public class Dourado extends Peixe implements Nadador {

    public Dourado(String nome, int idade) {
        super(nome, idade, "Dourado");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz glup glup.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo algas.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando contra a correnteza.");
    }
}
