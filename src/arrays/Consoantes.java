package arrays;

import java.util.Scanner;

/*
Exercício:
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            //usar if para ignorar as vogais na contagem de consoantes
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u") )) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while(count < consoantes.length);
        System.out.println("Consoantes: ");

        for (String consoante : consoantes) { //para cada elemento dentro desse meu array de consonates eu quero que imprima o elemento consoante
            if (consoante != null)
            /*o array sempre vai imprimir uma informação em cada posição. 
            No caso da string, teremos "null" nas posições vazias.
            Podemos usar o if para impor que a consoante seja diferente de null para ser impressa.
            Se fosse int, teria 0 no lugar de null, se fosse double seria 0.0*/
                System.out.println(consoante + " ");     
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        
        scan.close();
    } 
}
