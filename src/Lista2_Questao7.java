/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao7 
 * Descrição: 7. Faça um programa calcula o total de uma hospedagem em um hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15; R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.

 * Data: 08/05/2023
 */

import java.util.Scanner;

public class Lista2_Questao7 {
    public static void main(String[] args) {

        //entrada
        
        System.out.println("Insira a quantidade de dias hospedado:");
        Scanner input = new Scanner(System.in);
        int quantDias = input.nextInt();
        input.close();

        double ValorDiaria = 60;
        double taxaServico = 0;

        //processamento

        if (quantDias > 15){
            taxaServico = 5.5;

        } else if (quantDias == 15){
            taxaServico = 6;

        } else if (quantDias < 15){
            taxaServico = 8;

        }
        
        taxaServico = taxaServico * quantDias;
        ValorDiaria = ValorDiaria * quantDias;
        double total = taxaServico + ValorDiaria;

        //saida

        System.out.printf("Valor a ser pago: R$ %.2f" , total);

    }
}
