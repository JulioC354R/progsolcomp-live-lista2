/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao12 
 * Descrição: 12. Faça um programa que exiba todos os números pares a
 * partir de 0 até que encontre um múltiplo de 7 (utilize do/while)
 * Data: 11/05/2023
 */


public class Lista2_Questao12 {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i % 2 == 0){

            System.out.println(i);
            }
            i++;
        } while (i % 7 != 0);
        
    }
}
