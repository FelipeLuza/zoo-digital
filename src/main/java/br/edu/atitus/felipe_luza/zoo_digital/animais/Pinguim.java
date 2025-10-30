package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Predador;

public class Pinguim extends Ave implements Nadador, Predador {

    public Pinguim(String nome, int idade) {
        super(nome, idade, "Pinguim");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Squawk!");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando no gelo!");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando peixes no gelo!");
    }
}
