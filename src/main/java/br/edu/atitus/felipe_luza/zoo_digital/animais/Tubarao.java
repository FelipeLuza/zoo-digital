package br.edu.atitus.felipe_luza.zoo_digital.animais;

import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.Predador;

public class Tubarao extends Peixe implements Nadador, Predador {

    public Tubarao(String nome, int idade) {
        super(nome, idade, "Tubarão");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " permanece em silêncio nas profundezas...");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando rapidamente!");
    }

    @Override
    public void cacar() {
        System.out.println(nome + " está caçando peixes menores!");
    }
}
