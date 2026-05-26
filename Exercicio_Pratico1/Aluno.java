package Exercicio_Pratico1;

public class Aluno {

    int id;
    String nome;
    String telefone;
    double nota;

    Aluno proximo;

    public Aluno(int id, String nome, String telefone, double nota) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.nota = nota;
        this.proximo = null;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               " | Nome: " + nome +
               " | Telefone: " + telefone +
               " | Nota: " + nota;
    }
}