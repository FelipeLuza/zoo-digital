package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Predador;

public class Jacare extends Reptil implements Nadador, Predador {

    public Jacare(String nome, int idade) {
        super(nome, idade, "Jacaré");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está roncando forte!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está mastigando sua presa.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando silenciosamente no rio.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando um peixe desavisado!");
    }
}
