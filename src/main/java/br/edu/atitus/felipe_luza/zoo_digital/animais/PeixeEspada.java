package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Predador;

public class PeixeEspada extends Peixe implements Nadador, Predador {

    public PeixeEspada(String nome, int idade) {
        super(nome, idade, "Peixe Espada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo sons suaves de bolhas.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está devorando peixes menores.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando velozmente cortando as ondas!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando sardinhas!");
    }
}
