# Atividade_TS

Tarefa individual da matéria de UI/UX e Testes de Software - Caixa Branca

# ETAPA 1

### Erros identificados

Um dos erros que eu notei foi a falta do tratamento de erro, no catch, onde poderia aparecer uma mensagem de erro, além do metodoi
newInstance() que esta depreciado, e a forma como a instrução sql está sendo realizada, sendo que poderia ser usada de uma forma melhor
e mais utilidada que seria passando ? nos lugares das informações a serem verificadas e adicionar elas depois da instrução

# ETAPA 3

### Grafo de Fluxo

O grafo de fluxo foi criado com base no código numerado. Os nodos e arestas foram mapeados e organizados de acordo com o fluxo lógico do programa.

![Grafo de Fluxo](/src/login/grafo.png)

### Complexidade Ciclomática

A complexidade ciclomática do código é **5**, calculada pela fórmula:

\[ M = E - N + 2 \]

Onde:

- \( E = 25 \): Número de arestas no grafo.
- \( N = 22 \): Número de nodos no grafo.

### Caminhos Básicos

Os caminhos básicos identificados são:

1. `Nodo 2 -> Nodo 3 -> Nodo 4 -> Nodo 5 -> Nodo 6 -> Nodo 8`.
2. `Nodo 9 -> Nodo 10 -> Nodo 11 -> Nodo 12 -> Nodo 13 -> Nodo 14 -> Nodo 15 -> Nodo 16 -> Nodo 17 -> Nodo 18 -> Nodo 19 (false) -> Nodo 22`.
3. `Nodo 9 -> Nodo 10 -> Nodo 11 -> Nodo 12 -> Nodo 13 -> Nodo 14 -> Nodo 15 -> Nodo 16 -> Nodo 17 -> Nodo 18 -> Nodo 19 (true) -> Nodo 20 -> Nodo 22`.
4. `Nodo 16 -> Nodo 21 -> Nodo 22`.
5. Exceção nos Nodos `4`, `6`, ou `18`, levando ao `Nodo 22`.

# ETAPA 4
