package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Voador;
import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Predador;

public class Aguia extends Ave implements Voador, Predador {

    public Aguia(String nome, int idade) {
        super(nome, idade, "Águia");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está gritando alto nos céus!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está devorando um peixe.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está planando com as asas abertas.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando um coelho lá embaixo!");
    }
}
