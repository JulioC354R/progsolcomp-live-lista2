/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao16 
 * Descrição: 16. Faça um programa que solicite ao usuário que digite um
 * número até que ele digite um número menor que 0 (utilize while)
 * Data: 13/05/2023
 */


import javax.swing.JOptionPane;

public class Lista2_Questao16 {

    public static void main(String[] args) {
        
        
        String input = JOptionPane.showInputDialog(null, "Insira um número menor que 0:");
        int numeroDigitado = Integer.parseInt(input);

        while (numeroDigitado >= 0){        
            JOptionPane.showMessageDialog(null, "O número precisa ser maior que 0!", "ERRO" , JOptionPane.ERROR_MESSAGE );
            input = JOptionPane.showInputDialog(null, "Insira um número menor que 0:");
            numeroDigitado = Integer.parseInt(input);
        }

        JOptionPane.showMessageDialog(null, numeroDigitado + " É UM NÚMERO MENOR QUE 0", "PARABÉNS" , JOptionPane.INFORMATION_MESSAGE);
    } 
}
