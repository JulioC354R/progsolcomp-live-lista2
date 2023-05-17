/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao20 
 * Descrição: 21. Escreva um programa que, dado um número positivo digitado pelo o usuário mostre a tabuada de todos os números de 1 até o
 * número digitado. (utilize for)
 * Data: 17/05/2023
 */

import java.util.Scanner;

public class Lista2_Questao21 {
    public static void main(String[] args) {
        System.out.println("Insira um número positivo");
        Scanner teclado = new Scanner(System.in);
        int numeroInserido = teclado.nextInt();
        numeroInserido = testarNumeroPositivo(teclado, numeroInserido);

        CalcularEImprimirTabuada(numeroInserido);



    }

    private static void CalcularEImprimirTabuada(int numeroInserido) {
        for (int i = 0; i <= numeroInserido; i++){
            int resultado = i * numeroInserido;
            System.out.println(i + " X " + numeroInserido + " = " + resultado);
        }
    }

    private static int testarNumeroPositivo(Scanner teclado, int numeroInserido) {
        while(numeroInserido <= 0){
            System.out.println("Por favor insira um número positivo");
            numeroInserido = teclado.nextInt();
        }
        return numeroInserido;
    }

}
