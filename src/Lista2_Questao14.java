/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao14 
 * Descrição: 14. Faça um programa que preencha com zeros todas as posições de um vetor de tamanho 50
 * Data: 13/05/2023
 */

 public class Lista2_Questao14 {
    public static void main(String[] args) {
        int vetor[] = new int [50];
        int i = 0;

        while (i<50) {
            vetor[i] = 0;
            System.out.println("vetor " + i + " valor [" + vetor[i] +"]");
            i++;
        }

        
    }
}