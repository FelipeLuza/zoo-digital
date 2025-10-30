package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Corredor;

public class Cavalo extends Mamifero implements Corredor {

    public Cavalo(String nome, int idade) {
        super(nome, idade, "Cavalo");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está relinchando: hiiiiin in in!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo feno.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está galopando pelo campo.");
    }
}
