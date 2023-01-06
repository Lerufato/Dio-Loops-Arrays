# Loops e Arrays

Repositório destinado ao estudo de estruturas de repetição e Arrays, com exercícios propostos pela Professora Camila Cavalcante

## Loops

Loops são estruturas de repetição usadas para executar instruções desde que suas condições sejam true

### Tipos

- Loop for: (condição inicial; condição de repetição; incremento/ decremento em cada loop) {código}
    Esse loop continuará a executar um bloco de código até que uma condição seja atendida
- Loop for-each: (tipo da variável : array) {código}
    Usado para escrever os elementos de um array
- Loop while: (condição a ser considerada){código} 
    É comum o uso do "if (condição) break" para parar o loop
- Loop do while: do {faça o código independente do while} while (condição da repetição)
    Ou seja, no caso "do while", necessariamente teremos uma execução de código 

## Arrays

Arrays são objetos que armazenam elementos de um mesmo tipo

### Características

- São representados com o tipo e []. Exemplos:
    - int[] Array de número inteiro;
    - String[] Array de texto;

- No java, um array equivale a uma matriz, e esta pode ser unidimensional ou multidimensional

- O método length retorna o tamanho do array, ou seja, quantos elementos possui

- A quantidade de elementos será diferente da quantidade de posições, pois o primeiro elemento assume a posição 0.  
    Exemplo: 
    int [] vetor = {-5, -6, 15, 50, 8, 4}; 
    onde -5 é o primeiro elemento, mas está na posição 0. 50 é o quarto elemento, na posição 3. 4 é sexto e último elemento, está na posição 5.

