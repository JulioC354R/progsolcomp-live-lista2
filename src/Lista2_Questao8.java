/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao8 
 * Descrição: 8. Crie um programa que lê um número entre 1 e 12, correspondendo a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro. 
 * Ao final, o programa deve imprimir uma mensagem identificando, com base no número digitado, o nome do mês e a estação.
 * Exemplo para o mês 1: "Mês: Janeiro – Estação: Verão"
 * Data: 11/05/2023
 */

import java.util.Scanner;

public class Lista2_Questao8 {
    public static void main(String[] args) {
        System.out.println("Insira o número do mês:");
        Scanner input = new Scanner(System.in);
        int numeroDigitado = input.nextInt();
        input.close();

        // processamento e saida

        ImprimirMesEEstacao(numeroDigitado);

        }

    

    private static void ImprimirMesEEstacao(int numeroDigitado) {
        switch (numeroDigitado) {
            case 1:
                System.out.println("Mês:       Janeiro");
                System.out.println("Estação:   Verão");
                break;

            case 2:
                System.out.println("Mês:       Fevereiro");
                System.out.println("Estação:   Verão");
                break;
            
            case 3:
                System.out.println("Mês:       Março");
                System.out.println("Estação:   Verão");
                break;

            case 4:
                System.out.println("Mês:       Abril");
                System.out.println("Estação:   Outono");
                break;

            case 5:
                System.out.println("Mês:       Maio");
                System.out.println("Estação:   Outono");
                break;

            case 6:
                System.out.println("Mês:       Junho");
                System.out.println("Estação:   Outono");
                break;
            
            case 7:
                System.out.println("Mês:       Julho");
                System.out.println("Estação:   Inverno");

            case 8:
                System.out.println("Mês:       Agosto");
                System.out.println("Estação:   Inverno");

            case 9:
                System.out.println("Mês:       Setembro");
                System.out.println("Estação:   Inverno");

            case 10:
                System.out.println("Mês:       Outubro");
                System.out.println("Estação:   Verão");

            case 11:
                System.out.println("Mês:       Novembro");
                System.out.println("Estação:   Verão");

            case 12:
                System.out.println("Mês:       Dezembro");
                System.out.println("Estação:   Verão");
        
            default:
            System.out.println("Erro na digitação! Insira um valor entre 1 e 12!");
                break;
        }
    }
}
