/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao6 
 * Descrição: 6 Faça um programa para imprimir o conceito de um aluno. O 
conceito é calculado em função da nota do aluno que varia de 0 
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo
 * Data: 08/05/2023
 */

import java.util.Scanner;

public class Lista2_Questao6 {
    public static void main(String[] args) {

        System.out.println("Insira a nota conceito do aluno:");
        Scanner input = new Scanner(System.in);
        int notaConceito = input.nextInt();
        input.close();

        if (notaConceito >= 0 && notaConceito <= 49){
            System.out.println("Nota conceito: INSUFICIENTE");
        } else if (notaConceito > 49 && notaConceito <= 64){
            System.out.println("Nota conceito: REGULAR");
        }else if (notaConceito > 64 && notaConceito <= 84){
            System.out.println("Nota conceito: BOM");
        }else if (notaConceito > 84 && notaConceito <= 100){
            System.out.println("Nota conceito: ÓTIMO");
        } else {
        System.out.println("INSIRA UM VALOR ENTRE 0 E 100");
        }

        

    }
}
