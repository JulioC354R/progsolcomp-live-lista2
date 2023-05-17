/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao3 
 * Descrição: 3. Elabore um programa que lê dois valores A e B e os escreve com 
a mensagem: “São múltiplos” ou “Não são múltiplos”.
 * Data: 08/05/2023
 */

import java.util.Scanner;

public class Lista2_Questao3 {
    public static void main(String[] args) {

        System.out.println("Calculadora de Multiplos v1");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int A = input.nextInt();

        System.out.println("Insira o segundo número:");
        int B = input.nextInt();
        input.close();

        areMultiples(A, B);
    }

    private static void areMultiples(int A, int B) {
        if (A>B && A % B==0){
            System.out.println("São múltiplos");
            System.out.println( A + " é multiplo de " + B);
        } else if (B>A && B % A==0){
            System.out.println("São múltiplos");
            System.out.println( B + " é multiplo de " + A);
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}
