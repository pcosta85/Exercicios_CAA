package Exercicio_Pratico2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Pilha: push");
            System.out.println("2 - Pilha: info");
            System.out.println("3 - Pilha: pop");
            System.out.println("4 - Pilha: limpar");
            System.out.println("5 - Fila: inserir");
            System.out.println("6 - Fila: info");
            System.out.println("7 - Fila: remover");
            System.out.println("8 - Fila: retirar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int idP = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nomeP = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefoneP = sc.nextLine();

                    System.out.print("Nota: ");
                    double notaP = sc.nextDouble();

                    pilha.push(idP, nomeP, telefoneP, notaP);
                    break;

                case 2:
                    pilha.info();
                    break;

                case 3:
                    pilha.pop();
                    break;

                case 4:
                    pilha.limpar();
                    break;

                case 5:
                    System.out.print("ID: ");
                    int idF = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nomeF = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefoneF = sc.nextLine();

                    System.out.print("Nota: ");
                    double notaF = sc.nextDouble();

                    fila.inserir(idF, nomeF, telefoneF, notaF);
                    break;

                case 6:
                    fila.info();
                    break;

                case 7:
                    fila.remover();
                    break;

                case 8:
                    fila.retirar();
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