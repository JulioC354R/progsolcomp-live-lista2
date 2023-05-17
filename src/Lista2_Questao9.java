/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao9 
 * Descrição: 9. Faça um programa que receba o valor da venda, escolha a condição de pagamento no menu e mostre o total da venda final conforme condições a seguir:
Venda a Vista - desconto de 10% 
Venda a Prazo 30 dias - desconto de 5% 
Venda a Prazo 60 dias - mesmo preço 
Venda a Prazo 90 dias - acréscimo de 5% 
Venda com cartão de débito - desconto de 8% 
Venda com cartão de crédito - desconto de 7%
 * Data: 11/05/2023
 */

import java.util.Scanner;

public class Lista2_Questao9 {
    public static void main(String[] args) {
        System.out.println("Insira o valor total da venda: ");
        Scanner input = new Scanner(System.in);
        double ValorVenda = input.nextDouble(); 

        ImpressaoMenu();
        int selecaoMenu = 0;
        Double ValorAjustado = CalcularDesconto(ValorVenda, selecaoMenu);
        input.close();

        System.out.printf("Valor total a pagar:    R$ %.2f \n" , ValorAjustado);

    }

    private static Double CalcularDesconto(double ValorVenda, int selecaoMenu) {
        Scanner input = new Scanner(System.in);
        
        double ValorAjustado = 0;

        do{
            selecaoMenu = input.nextInt();

            switch (selecaoMenu) {
                case 1:
                ValorAjustado = ValorVenda - (ValorVenda * 10/100);
                    break;

                case 2:
                ValorAjustado = ValorVenda - (ValorVenda * 5/100);
                    break;

                case 3:
                ValorAjustado = ValorVenda*1;
                    break;

                case 4:
                ValorAjustado = ValorVenda + (ValorVenda * 5/100);
                    break;

                case 5:
                ValorAjustado = ValorVenda - (ValorVenda * 8/100);
                    break;

                case 6:
                ValorAjustado = ValorVenda - (ValorVenda * 7/100);
                    break;
        
            default:
            System.out.println("Por favor selecione uma das opções do menu abaixo:");
            ImpressaoMenu();
            selecaoMenu = 0;
                break;
        }
        }while (selecaoMenu == 0);
        input.close();
        return ValorAjustado;
    }

    private static void ImpressaoMenu() {
        System.out.println("Escolha a condição de pagamento: (Selecione o número da opção desejada)");
        System.out.println("1 - Venda a Vista               - desconto de 10% ");
        System.out.println("2 - Venda a Prazo 30 dias       - desconto de 5% ");
        System.out.println("3 - Venda a Prazo 60 dias       - mesmo preço ");
        System.out.println("4 - Venda a Prazo 90 dias       - acréscimo de 5% ");
        System.out.println("5 - Venda com cartão de débito  - desconto de 8% ");
        System.out.println("6 - Venda com cartão de crédito - desconto de 7%");
    }
}

