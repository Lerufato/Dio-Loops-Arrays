package loops;

/*
Exercício:
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número: "); //Peça um número
        int tabuada = scan.nextInt(); //Entrada de dados, neste caso de um int.

        System.out.println("Tabuada de " + tabuada + ":");

        //para: variável i = 0, até i menor ou igual a 10, adicionando 1 ao valor de i a cada loop.
        for (int i = 1; i <= 10; i = i + 1) { //for é similar ao while, porém resumido
            //número escolhido pelo usuário "X" o valor de i "=" a multiplicação do número com o i.
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }

        //utilizando while como estrutura de repetição
        System.out.println("Número: ");
        int tabuada2 = scan.nextInt(); //Entrada de dados, neste caso de um int.
        int x = 1;

        System.out.println("Tabuada de " + tabuada2 + ":");

        while (x <= 10){
            System.out.println(tabuada2 + " X " + x + " = " + (tabuada2 * x));
            x = x + 1;
        }
        
}
}