package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Voador;

public class Papagaio extends Ave implements Voador {

    public Papagaio(String nome, int idade) {
        super(nome, idade, "Papagaio");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está falando: 'Olá, tudo bem?'");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sementes.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando alegremente pela floresta.");
    }
}