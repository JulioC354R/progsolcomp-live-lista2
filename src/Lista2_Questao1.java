/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao1 
 * Descrição: 1. Faça um programa que leia dois números A e B e imprima o maior deles.
 * Data: 08/05/2023
 */

import java.util.Scanner;

public class Lista2_Questao1 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int A = teclado.nextInt();

        System.out.println("Insira o segundo número:");
        int B = teclado.nextInt();
        teclado.close();

        CacularMaiornumero(A, B);
    }

    private static void CacularMaiornumero(int A, int B) {
        if (A>B){
            System.out.println("O maior número é: " + A);
        } else if (B>A){
            System.out.println("O maior número é: "+ B);
        } else if (A==B){
            System.out.println("Os dois valores são iguais.");
        }
    }
}
