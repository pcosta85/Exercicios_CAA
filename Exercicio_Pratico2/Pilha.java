package Exercicio_Pratico2;

public class Pilha {
    private Aluno topo;

    public void push(int id, String nome, String telefone, double nota) {
        Aluno novo = new Aluno(id, nome, telefone, nota);

        if (topo != null) {
            novo.anterior = topo;
            topo.proximo = novo;
        }

        topo = novo;
        System.out.println("Aluno inserido na pilha.");
    }

    public void info() {
        if (topo == null) {
            System.out.println("Pilha vazia.");
            return;
        }

        Aluno atual = topo;

        while (atual != null) {
            System.out.println(atual);
            atual = atual.anterior;
        }
    }

    public void pop() {
        if (topo == null) {
            System.out.println("Pilha vazia.");
            return;
        }

        System.out.println("Removido: " + topo);

        topo = topo.anterior;

        if (topo != null) {
            topo.proximo = null;
        }
    }

    public void limpar() {
        topo = null;
        System.out.println("Pilha limpa.");
    }
}