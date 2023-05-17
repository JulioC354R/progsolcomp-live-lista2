/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao13 
 * Descrição: 13. Faça um programa que some os números de 1 a 100 e imprima somente o valor total da soma (utilize while).
 * Data: 13/05/2023
 */

public class Lista2_Questao13 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;

        while (i <= 100) {
            soma = soma + i;
            i++;
            
        }
        System.out.println(soma);


    } 
}
