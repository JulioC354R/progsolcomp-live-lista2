/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao17 
 * Descrição: 17. Faça um programa que imprima os múltiplos negativos de 7, superiores a -1000. (utilize do / while)
 * Data: 13/05/2023
 */


public class Lista2_Questao17 {
    public static void main(String[] args) {
        int i = -1000;
        do {

            if(i % 7 == 0){
                System.out.println(i);
            }
            
            i++;
        
        } while ( i < 0);
    }
}
