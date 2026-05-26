package Exercicio_Pratico1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaLigada lista = new ListaLigada();

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Pesquisar por ID");
            System.out.println("4 - Pesquisar por Nome");
            System.out.println("5 - Pesquisar por Telefone");
            System.out.println("6 - Mostrar por Nota");
            System.out.println("7 - Remover por ID");
            System.out.println("8 - Remover por Nome");
            System.out.println("9 - Remover por Telefone");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();

                    lista.inserir(id, nome, telefone, nota);

                    break;

                case 2:

                    lista.listar();

                    break;

                case 3:

                    System.out.print("ID: ");
                    lista.pesquisarPorId(sc.nextInt());

                    break;

                case 4:

                    System.out.print("Nome: ");
                    lista.pesquisarPorNome(sc.nextLine());

                    break;

                case 5:

                    System.out.print("Telefone: ");
                    lista.pesquisarPorTelefone(sc.nextLine());

                    break;

                case 6:

                    System.out.print("Nota: ");
                    lista.mostrarPorNota(sc.nextDouble());

                    break;

                case 7:

                    System.out.print("ID: ");
                    lista.removerPorId(sc.nextInt());

                    break;

                case 8:

                    System.out.print("Nome: ");
                    lista.removerPorNome(sc.nextLine());

                    break;

                case 9:

                    System.out.print("Telefone: ");
                    lista.removerPorTelefone(sc.nextLine());

                    break;

                case 0:

                    System.out.println("Programa terminado.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}