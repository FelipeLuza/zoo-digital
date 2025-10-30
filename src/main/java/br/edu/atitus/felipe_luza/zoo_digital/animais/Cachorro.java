package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Predador;

public class Cachorro extends Mamifero implements Corredor, Predador {

    public Cachorro(String nome, int idade) {
        super(nome, idade, "Cachorro");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Au au!");
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo atrás da bola!");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando a meia que roubou!");
    }
}
