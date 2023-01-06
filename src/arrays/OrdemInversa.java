package arrays;

/*
Exercício:
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {-5, -6, 15, 50, 8, 4}; //inicializando um vetor unidimensional com 5 elementos.
        //O primeiro elemento do array é posição zero, portanto o array tem 6 elementos e 5 posições.
        
        System.out.println("Vetor: ");
        int count = 0; 
        while(count < (vetor.length)){ //enquanto o contador tiver o valor maior ou igual 0. 
            //Pode ser representado como while(count <= (vetor.length-1))
            System.out.print(vetor[count] + " ");
            count++; //aumenta o valor do contador a cada loop
        }
        System.out.println("\nVetor Inverso: ");// /n é usado para pular uma linha
        //loop for
        for(int i = (vetor.length - 1); i >= 0; i --) {//(condição inicial; até quando deve repetir; subtrai 1 em cada loop)
            System.out.print(vetor[i] + " ");
        }
    }
}

