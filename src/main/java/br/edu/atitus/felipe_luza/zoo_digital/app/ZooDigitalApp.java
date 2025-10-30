package br.edu.atitus.felipe_luza.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.felipe_luza.zoo_digital.animais.*;
import br.edu.atitus.felipe_luza.zoo_digital.comportamentos.*;

public class ZooDigitalApp {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;
        do {
            System.out.println("\n=== ZOO DIGITAL MAVEN - FELIPE LUZA ===");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Todos os Animais");
            System.out.println("3 - Listar Corredores");
            System.out.println("4 - Listar Nadadores");
            System.out.println("5 - Listar Voadores");
            System.out.println("6 - Listar Predadores");
            System.out.println("7 - Emitir Som de Todos os Animais");
            System.out.println("8 - Exibir Total de Animais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa buffer

            switch (opcao) {
                case 1 -> cadastrarAnimal();
                case 2 -> listarTodos();
                case 3 -> listarPorComportamento(Corredor.class);
                case 4 -> listarPorComportamento(Nadador.class);
                case 5 -> listarPorComportamento(Voador.class);
                case 6 -> listarPorComportamento(Predador.class);
                case 7 -> emitirSomDeTodos();
                case 8 -> System.out.println("Total de animais cadastrados: " + Animal.getTotalAnimais());
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private static void cadastrarAnimal() {
        System.out.println("\n=== Cadastro de Animal ===");
        System.out.println("""
                Tipos disponíveis:
                1 - Cachorro
                2 - Elefante
                3 - Leão
                4 - Águia
                5 - Papagaio
                6 - Pinguim
                7 - Peixe Espada
                8 - Dourado
                9 - Tubarão
                10 - Cobra
                11 - Lagarto
                12 - Jacaré
                13 - Boi
                14 - Cavalo
                """);
        System.out.print("Escolha o tipo: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        Animal animal = switch (tipo) {
            case 1 -> new Cachorro(nome, idade);
            case 2 -> new Elefante(nome, idade);
            case 3 -> new Leao(nome, idade);
            case 4 -> new Aguia(nome, idade);
            case 5 -> new Papagaio(nome, idade);
            case 6 -> new Pinguim(nome, idade);
            case 7 -> new PeixeEspada(nome, idade);
            case 8 -> new Dourado(nome, idade);
            case 9 -> new Tubarao(nome, idade);
            case 10 -> new Cobra(nome, idade);
            case 11 -> new Lagarto(nome, idade);
            case 12 -> new Jacare(nome, idade);
            case 13 -> new Boi(nome, idade);
            case 14 -> new Cavalo(nome, idade);
            default -> null;
        };

        if (animal != null) {
            animais.add(animal);
            System.out.println("✅ " + animal.getEspecie() + " cadastrado com sucesso!");
        } else {
            System.out.println("❌ Tipo inválido. Cadastro cancelado.");
        }
    }

    private static void listarTodos() {
        System.out.println("\n=== Lista de Todos os Animais ===");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        animais.forEach(a ->
            System.out.println(a.getEspecie() + " - Nome: " + a.getNome() + ", Idade: " + a.getIdade())
        );
    }

    private static void listarPorComportamento(Class<?> tipo) {
        System.out.println("\n=== Lista de " + tipo.getSimpleName() + "s ===");
        boolean encontrou = false;

        for (Animal a : animais) {
            if (tipo.isInstance(a)) {
                System.out.println(a.getEspecie() + " - " + a.getNome());
                if (tipo == Corredor.class) ((Corredor) a).correr();
                if (tipo == Nadador.class) ((Nadador) a).nadar();
                if (tipo == Voador.class) ((Voador) a).voar();
                if (tipo == Predador.class) ((Predador) a).cacar();
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum animal com esse comportamento encontrado.");
        }
    }

    private static void emitirSomDeTodos() {
        System.out.println("\n=== Sons dos Animais ===");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        animais.forEach(Animal::emitirSom);
    }
}
