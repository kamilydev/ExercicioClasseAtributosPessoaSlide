package org.pessoa;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de pessoas que o usuário deseja criar
        System.out.print("Quantas pessoas você deseja criar? ");
        int numeroDePessoas = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha deixada pelo nextInt

        // Cria uma lista para armazenar os objetos Pessoa
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        // Coleta os dados de cada pessoa e cria os objetos
        for (int i = 0; i < numeroDePessoas; i++) {
            System.out.println("Dados da pessoa " + (i + 1) + ":");

            // Solicita o nome do usuário
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            // Solicita a idade do usuário
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha deixada pelo nextInt

            // Cria um objeto da classe Pessoa e adiciona à lista
            Pessoa pessoa = criarPessoa(nome, idade);
            listaDePessoas.add(pessoa);
        }

        // Exibe as informações de todas as pessoas criadas
        System.out.println("\nInformações das pessoas criadas:");
        for (Pessoa pessoa : listaDePessoas) {
            pessoa.exibirInformacoes();
        }

        // Fecha o scanner
        scanner.close();
    }

    // Método que cria um objeto da classe Pessoa
    public static Pessoa criarPessoa(String nome, int idade) {
        return new Pessoa(nome, idade);
    }
}