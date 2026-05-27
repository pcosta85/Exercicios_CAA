package Exercicio_Pratico2;

public class Aluno {
    int id;
    String nome;
    String telefone;
    double nota;

    Aluno anterior;
    Aluno proximo;

    public Aluno(int id, String nome, String telefone, double nota) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.nota = nota;
    }

    public String toString() {
        return "ID: " + id +
               " | Nome: " + nome +
               " | Telefone: " + telefone +
               " | Nota: " + nota;
    }
}