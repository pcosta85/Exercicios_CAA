# Tema
Implementação de um programa em JAVA utilizando Lista Duplamente Ligada, aplicando os conceitos de:
- Pilha (Stack)
- Fila (Queue)

O programa permite representar alunos através dos seguintes dados:
- ID
- Nome
- Telefone
- Nota

---
# Objetivo do Exercício
O principal objetivo do exercício é aplicar os conceitos de:
- Estruturas de Dados
- Lista Duplamente Ligada
- Pilha
- Fila

O sistema foi desenvolvido em JAVA e permite manipular dinamicamente os dados dos alunos.

---
# Estrutura do Programa
O programa foi dividido em quatro classes:
|Classe	    |Função                      |
|-----------|----------------------------|
|Aluno	    |Representa cada aluno       |
|Pilha	    |Implementa a estrutura Pilha|
|Fila	    |Implementa a estrutura Fila |
|Principal	|Contém o menu principal     |
---

# Classe Aluno
A classe Aluno representa os dados de cada estudante.

```java
public class Aluno {
    int id;
    String nome;
    String telefone;
    double nota;

    Aluno anterior;
    Aluno proximo;
}
```

Cada objeto Aluno funciona como um nó da Lista Duplamente Ligada.

## Atributos
|Atributo	|Função                   |
|-----------|-------------------------|
|id	        |Identificador do aluno   |
|nome	    |Nome do aluno            |
|telefone	|Telefone do aluno        |
|nota	    |Nota obtida              |
|anterior	|Aponta para o nó anterior|
|proximo	|Aponta para o próximo nó |
---

# Lista Duplamente Ligada
A Lista Duplamente Ligada permite navegação em dois sentidos.

## Representação
```
null <- [Aluno] <-> [Aluno] <-> [Aluno] -> null
```

### Cada nó possui:
- referência para o próximo nó
- referência para o nó anterior

---
# Estrutura Pilha
A Pilha segue a regra:
```
LIFO → Last In First Out
```

O último elemento inserido é o primeiro a ser removido.

---
# Operações da Pilha
### Push
O método push() insere um novo aluno no topo da pilha.

### Código
```java
public void push(int id, String nome, String telefone, double nota)
```
- Cria um novo nó
- Liga o novo nó ao topo atual
- Atualiza o topo da pilha

### Info
Mostra todos os alunos da pilha.

### Código
```java
public void info()
```

Percorre os elementos da pilha do topo até ao início.

### Pop
Remove o elemento do topo da pilha.

### Código
```java
public void pop()
```

- Remove o último elemento inserido
- Atualiza o topo da pilha

### Limpar
Remove todos os elementos da pilha.

### Código
```java
public void limpar()
```

O topo passa a apontar para null.

---
# Estrutura Fila
A Fila segue a regra:
```
FIFO > First In First Out
```

O primeiro elemento inserido é o primeiro a ser removido.

---
# Operações da Fila
### Inserir
Insere um aluno no final da fila.

### Código
```java
public void inserir(int id, String nome, String telefone, double nota)
```
- Cria um novo nó
- Adiciona no final da fila

### Info
Mostra todos os alunos da fila.

### Código
```java
public void info()
```

Percorre a fila do início até ao fim.

### Remover
Remove o primeiro elemento da fila.

### Código
```java
public void remover()
```
- Remove o primeiro elemento inserido
- Atualiza o início da fila

### Retirar
Executa a mesma função do método remover.

### Código
```java
public void retirar()
```

---
# Classe Principal
A classe Principal contém o menu interativo do sistema.

### Código
```java
Scanner sc = new Scanner(System.in);
```

O Scanner é utilizado para:
- ler dados do teclado
- permitir interação com o utilizador

---
# Menu do Sistema
### Código
```
1 - Pilha: push
2 - Pilha: info
3 - Pilha: pop
4 - Pilha: limpar
5 - Fila: inserir
6 - Fila: info
7 - Fila: remover
8 - Fila: retirar
0 - Sair
```

---
# Estruturas de Dados Utilizadas
|Estrutura	                |Função                             |
|---------------------------|-----------------------------------|
|Lista Duplamente Ligada	|Base do programa                   |
|Pilha	                    |Inserção/remoção no topo           |
|Fila	                    |Inserção no fim e remoção no início|
---

# Vantagens da Lista Duplamente Ligada
- Navegação em dois sentidos
- Inserção dinâmica
- Remoção eficiente
- Estrutura flexível

---
# Desvantagens
- Maior consumo de memória
- Implementação mais complexa

---
# Execução do Programa
### Compilar
```java
javac Aluno.java Pilha.java Fila.java Principal.java
```

### Executar
```java
java Principal
```

