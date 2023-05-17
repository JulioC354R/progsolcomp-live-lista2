/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao2 
 * Descrição: 2. Construa um programa que receba como entrada três valores A, B 
 * e C e os imprima em ordem crescente.
 * Data: 08/05/2023
 */

import java.util.Scanner;

public class Lista2_Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int A = input.nextInt();

        System.out.println("Insira o segundo número:");
        int B = input.nextInt();

        System.out.println("Insira o terceiro número:");
        int C = input.nextInt();
        input.close();

        System.out.println("Aqui estão os números em ordem crescente.");
        if(A>=B && A>=C && B>=C){
            System.out.println(C);
            System.out.println(B);
            System.out.println(A);
        } else if(A>=B && A>=C && C>=B){
            System.out.println(B);
            System.out.println(C);
            System.out.println(A);
        }else if(B>=A && B>=C && A>=C){
            System.out.println(C);
            System.out.println(A);
            System.out.println(B);
        }else if(B>=A && B>=C && C>=A){
            System.out.println(A);
            System.out.println(C);
            System.out.println(B);
        }else if(C>=A && C>=B && B>=A){
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        }else if(C>=A && C>B && A>=B){
            System.out.println(B);
            System.out.println(A);
            System.out.println(C);
        }

        

    }
}
