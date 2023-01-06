package loops;

/*
Exercício:
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class PareImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.println("Quantidade de números: "); //Pedir a quantidade de números
        int quantidadeDeNumeros = scan.nextInt(); //Entrada de dados, neste caso de um int.

        int quantPar = 0, quantImpar = 0; //variáveis para guardar a quantidade dos números pares e ímpares

        int count = 0; //controla o loop
        //loop
        do { //primeiro, independente do que tem no while, faça:
            System.out.println("Número: "); //Peça um número
            int numero = scan.nextInt(); //Entrada de dados, neste caso de um int.

            //Para saber se o número é par, usar a condição "resto da divisão do número por 2 é igual 0",
            if (numero % 2 == 0) quantPar++; //acrescente o valor 1 a variável quantPar.
                //caso contrário, o número digitado é ímpar
            else quantImpar++; //adicione o valor 1 a variável quantImpar.

            count++; //some o valor 1 ao contador até que invalide a condição do loop, sem essa condição, o count será sempre 0. 
        } while (count < quantidadeDeNumeros);
        // Faça o loop caso o valor do contador seja menor que a quantidade de números

        //imprimindo a quantidade de números pares digtados e números ímpares digitados
        System.out.println("Quantidade números pares: " + quantPar);
        System.out.println("Quantidade números ímpares: " + quantImpar);

        scan.close();
    }
    
}
