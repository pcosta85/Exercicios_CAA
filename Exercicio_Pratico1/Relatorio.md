# Tema
Implementação de uma Lista Simplesmente Ligada em JAVA para gestão de alunos.

---
# Objetivo do Exercício

O exercício tem como principal objetivo aplicar os conceitos de:

- Conceção e Análise de Algoritmos (CAA)
- Estrutura de Dados
- Lista Simplesmente Ligada
- Manipulação dinâmica de memória
- Pesquisa e remoção de dados

O programa desenvolvido permite representar uma turma de alunos utilizando uma Lista Simplesmente Ligada, onde cada nó da lista representa um aluno.

---
# Estrutura do Programa
O programa é composto por três classes principais:

|Classe	     |Função                                     |
|------------|-------------------------------------------|
|Aluno	     |Representa cada aluno                      |
|ListaLigada |Implementa a lista simplesmente ligada     |
|Principal	 |Contém o menu e interação com o utilizador |

---
# Classe Aluno
A classe Aluno representa os dados de cada estudante.

## Atributos
```java
int id;
String nome;
String telefone;
double nota;
Aluno proximo;
```

|Atributo	|Função                      |
|-----------|----------------------------|
|id	        |Identificador do aluno      |
|nome	    |Nome do aluno               |
|telefone	|Número de telefone          |
|nota	    |Nota obtida                 |
|proximo	|Referência para o próximo nó|


### O atributo:
```java
Aluno proximo;
```

É o elemento que permite criar a ligação entre os nós da lista.

---
# Lista Simplesmente Ligada

A lista simplesmente ligada funciona através de nós conectados entre si.

### Representação

[Aluno] -> [Aluno] -> [Aluno] -> null

---
# Funcionalidades Implementadas

## Inserir Aluno

O método inserir() permite adicionar novos alunos à lista.
```java
lista.inserir(id, nome, telefone, nota);
```

Antes da inserção, o sistema verifica se já existe:

- mesmo ID
- mesmo nome
- mesmo telefone
  
Evita assim dados repetidos.

## Listar Todos os Alunos

O método listar() percorre toda a lista e mostra os dados dos alunos.

```java
while (atual != null)
```

O percurso termina quando o ponteiro encontra null.

## Pesquisar Alunos

O sistema permite pesquisar por:
- ID
- Nome
- Telefone
  
Exemplo:
```java
pesquisarPorId(int id)
```

O método percorre a lista até encontrar o aluno.

## Mostrar Alunos por Nota

O método:
```java
mostrarPorNota(double nota)
```

mostra todos os alunos que possuem determinada nota.

## Remover Alunos

O sistema permite remover alunos por:
- ID
- Nome
- Telefone

A remoção é feita ajustando o ponteiro:
```java
atual.proximo = atual.proximo.proximo;
```

---
# Controlo de Dados Repetidos

Foi implementado o método:
```java
existe()
```

Este método verifica se já existe um aluno com:
- mesmo ID
- mesmo nome
- mesmo telefone

Caso exista, a inserção é bloqueada.

---
# Estrutura de Dados Utilizada

### Lista Simplesmente Ligada

A estrutura utilizada foi uma Lista Simplesmente Ligada, onde:
- cada elemento possui dados
- cada elemento aponta para o próximo nó
  
---
# Linguagem Utilizada

O programa foi desenvolvido em:
```
JAVA
```

# Execução do Programa

```
1 - Inserir aluno
2 - Listar alunos
3 - Pesquisar por ID
4 - Pesquisar por Nome
5 - Pesquisar por Telefone
6 - Mostrar por Nota
7 - Remover por ID
8 - Remover por Nome
9 - Remover por Telefone
0 - Sair
```