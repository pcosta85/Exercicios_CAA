package Exercicio_Pratico1;

import java.util.function.Predicate;

public class ListaLigada {

    private Aluno inicio;

    public void inserir(int id, String nome, String telefone, double nota) {
        if (existe(id, nome, telefone)) {
            System.out.println("Erro: aluno já existe.");
            return;
        }

        Aluno novo = new Aluno(id, nome, telefone, nota);

        if (inicio == null) {
            inicio = novo;
        } else {
            Aluno atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }

        System.out.println("Aluno inserido com sucesso.");
    }

    public boolean existe(int id, String nome, String telefone) {
        return procurar(a ->
                a.id == id ||
                a.nome.equalsIgnoreCase(nome) ||
                a.telefone.equalsIgnoreCase(telefone)
        ) != null;
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        for (Aluno atual = inicio; atual != null; atual = atual.proximo) {
            System.out.println(atual);
        }
    }

    private Aluno procurar(Predicate<Aluno> criterio) {
        for (Aluno atual = inicio; atual != null; atual = atual.proximo) {
            if (criterio.test(atual)) {
                return atual;
            }
        }
        return null;
    }

    private void pesquisar(Predicate<Aluno> criterio) {
        Aluno aluno = procurar(criterio);

        if (aluno != null) {
            System.out.println(aluno);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void pesquisarPorId(int id) {
        pesquisar(a -> a.id == id);
    }

    public void pesquisarPorNome(String nome) {
        pesquisar(a -> a.nome.equalsIgnoreCase(nome));
    }

    public void pesquisarPorTelefone(String telefone) {
        pesquisar(a -> a.telefone.equalsIgnoreCase(telefone));
    }

    public void mostrarPorNota(double nota) {
        boolean encontrado = false;

        for (Aluno atual = inicio; atual != null; atual = atual.proximo) {
            if (atual.nota == nota) {
                System.out.println(atual);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum aluno encontrado.");
        }
    }

    private void remover(Predicate<Aluno> criterio) {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        if (criterio.test(inicio)) {
            inicio = inicio.proximo;
            System.out.println("Aluno removido.");
            return;
        }

        for (Aluno atual = inicio; atual.proximo != null; atual = atual.proximo) {
            if (criterio.test(atual.proximo)) {
                atual.proximo = atual.proximo.proximo;
                System.out.println("Aluno removido.");
                return;
            }
        }

        System.out.println("Aluno não encontrado.");
    }

    public void removerPorId(int id) {
        remover(a -> a.id == id);
    }

    public void removerPorNome(String nome) {
        remover(a -> a.nome.equalsIgnoreCase(nome));
    }

    public void removerPorTelefone(String telefone) {
        remover(a -> a.telefone.equalsIgnoreCase(telefone));
    }
}