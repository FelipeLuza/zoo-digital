package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Predador;

public class Cobra extends Reptil implements Predador {

    public Cobra(String nome, int idade) {
        super(nome, idade, "Cobra");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " sibila: ssssss!");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando pequenos roedores!");
    }
}
