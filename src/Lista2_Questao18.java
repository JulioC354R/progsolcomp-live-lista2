/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao18 
 * Descrição: 18. Faça um programa que determine o fatorial de um número.
 * Para este problema, tem-se como entrada o valor do número do qual se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O fatorial de um número N (N!) 
 * é definido conforme a seguir (utilize for):   N! = 1 * 2 * 3 * 4 * ... * (N-1) * N 
 * Data: 13/05/2023
 * 
 */

 import java.util.Scanner;

 public class Lista2_Questao18 {
     public static void main(String[] args) {
         System.out.println("insira o número do qual se deseja calcular o fatorial");
         Scanner teclado = new Scanner(System.in);
         int numeroDigitado = teclado.nextInt();
         teclado.close();
         int calcular = numeroDigitado;
         for (int i = 1; i < numeroDigitado ; i++){
             calcular = calcular* i;
         }
         System.out.println("O fatorial de " + numeroDigitado +  " é igual a " + calcular);
     }
 }
 