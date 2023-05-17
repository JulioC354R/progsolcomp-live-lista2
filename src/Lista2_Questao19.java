/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao19 
 * Descrição: 19. Um determinado gás duplica seu volume a cada segundo. Dada um volume inicial, em centímetros cúbicos, 
 * digitado pelo usuário faça um programa que determine o tempo necessário para que esse volume se torne maior que 1000 centímetros cúbicos. (utilize while)
 * Data: 13/05/2023
 */

import java.util.Scanner;

public class Lista2_Questao19 {
    public static void main(String[] args) {
        System.out.println("insira o volume inicial do gás em centimetros cúbicos");
        Scanner teclado = new Scanner(System.in);
        int volumeInicial = teclado.nextInt();
        teclado.close();

        //processamento
        int tempo = 0;
        while (1000 >= volumeInicial) {
            volumeInicial = volumeInicial* 2;
            tempo = tempo + 1;
        }

        System.out.println(tempo + "s para que esse volume se torne maior que 1000 centímetros cúbicos");
    }
    
}
