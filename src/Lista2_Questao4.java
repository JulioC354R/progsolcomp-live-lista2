/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao4 
 * Descrição: 4. Faça um programa que leia um número inteiro e mostre uma 
 * mensagem indicando se este número é par ou ímpar e se é 
 * positivo ou negativo.
 * Data: 08/05/2023
 */

import javax.swing.JOptionPane;

public class Lista2_Questao4 {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Insira um número inteiro:");
        int num = Integer.parseInt(input);
        
        if (num > 0 && num % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número " + num + " é Par e Positivo", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
        } else if(num < 0 && num % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número " + num + " é Par e Negativo", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
        } else if (num > 0 && num % 2 == 1){
                JOptionPane.showMessageDialog(null, "O número " + num + " é Impar e Positivo", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
        } else if (num < 0 && num % 2 == 1){
                JOptionPane.showMessageDialog(null, "O número " + num + " é Impar e Negativo", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Insira um número Inteiro!", "ERROR", JOptionPane.WARNING_MESSAGE);

        }
    }
}
