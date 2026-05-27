package Exercicio_Pratico2;

public class Fila {
    private Aluno inicio;
    private Aluno fim;

    public void inserir(int id, String nome, String telefone, double nota) {
        Aluno novo = new Aluno(id, nome, telefone, nota);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }

        System.out.println("Aluno inserido na fila.");
    }

    public void info() {
        if (inicio == null) {
            System.out.println("Fila vazia.");
            return;
        }

        Aluno atual = inicio;

        while (atual != null) {
            System.out.println(atual);
            atual = atual.proximo;
        }
    }

    public void remover() {
        if (inicio == null) {
            System.out.println("Fila vazia.");
            return;
        }

        System.out.println("Removido: " + inicio);

        inicio = inicio.proximo;

        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null;
        }
    }

    public void retirar() {
        remover();
    }
}