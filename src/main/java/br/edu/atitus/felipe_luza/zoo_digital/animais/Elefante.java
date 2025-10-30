package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Corredor;

public class Elefante extends Mamifero implements Corredor {

    public Elefante(String nome, int idade) {
        super(nome, idade, "Elefante");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está barritando!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo folhas e frutas.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está trotando lentamente.");
    }
}
