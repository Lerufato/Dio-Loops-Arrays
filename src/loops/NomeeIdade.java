package loops;
/*
Exercício:
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class NomeeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) { //Estrutura de repetição
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break; // comando para finalizar a repetição

            System.out.println("Idade: ");
            idade = scan.nextInt();

            System.out.println("Nome: " + nome + " - idade: " + idade); //impressão do nome e idade
        }

        System.out.println("Continua aqui..."); // quando a estrutura de repetição é finalizada, o código continua a execução
        
        scan.close();
    }

}
