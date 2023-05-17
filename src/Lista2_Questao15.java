/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao15 
 * Descrição: 15. Faça um programa que preencha com zeros todas as posições de uma matriz com 10 linha e 10 colunas.
 * Data: 13/05/2023
 */

public class Lista2_Questao15 {
    public static void main(String[] args) {
        int vetor [][] = new int [10] [10];
        

        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length; j++){
                vetor[i][j] = 0;
                System.out.println("linha " + i + " coluna " + j + " valor = "+vetor[i][j]);
            }
        }
     
     

    }
}
