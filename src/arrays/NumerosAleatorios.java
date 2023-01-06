package arrays;

import java.util.Random;

/*
Exercícios:
Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //classe random apresenta a quantidade de itens escolhida de forma aleatória
        int[] numerosAleatorios = new int [20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        
        }

        System.out.print("Números Aleatórios: \n");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.print("Sucessores dos Números Aleatórios: \n");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1) + " ");
            
        }

        System.out.print("Antecessores dos Números Aleatórios: \n");
        for (int numero : numerosAleatorios) {
            System.out.println((numero-1) + " ");
            
        }
    }
}
