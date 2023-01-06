package arrays;

import java.util.Random;

/*
Exercício:
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).
*/

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] M = new int [4][4]; // primeiro [] representa linha, segundo [] coluna

        for(int i = 0; i < M.length; i++) { //para: variável i = 0, até i menor que o tamanho da matriz, acrescentamos 1 ao valor de i a cada loop.
            for (int j = 0; j < M[i].length; j++) { //para: variável j = 0, até i menor que o tamanho da linha, acrescentamos 1 ao valor de i a cada loop
                M[i][j] = random.nextInt(9); //criação da matriz aleatória com números inteiros até 9
            }
        }

        System.out.println("Matriz: ");

        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
                
            }
            System.out.println();
        }
    }
}
