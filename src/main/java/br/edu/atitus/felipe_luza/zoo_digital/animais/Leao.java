package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Predador;

public class Leao extends Mamifero implements Corredor, Predador {

    public Leao(String nome, int idade) {
        super(nome, idade, "Leao"); 
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carne fresca.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo pela savana.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando uma gazela!");
    }
}
