/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao5 
 * Descrição: 5 Faça um programa que leia o nome, o sobrenome, a idade, em 
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja 
visualizar dados completos?”. Se o caractere digitado pelo 
usuário for ‘S’ o programa deve imprimir na tela Nome, 
Sobrenome, idade e naturalidade. Se o caractere digitado pelo 
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se 
o caractere não for nenhuma das outras opções acima o programa 
deve imprimir “Digitação errada. Tente Novamente”.
 * Data: 08/05/2023
 */

import java.util.Scanner;

public class Lista2_Questao5 {
    public static void main(String[] args) {

        int repeat = 0;

        do{
        
            Scanner input = new Scanner(System.in);
            System.out.println("Qual o seu nome?");
            String name = input.nextLine();

            System.out.println("Qual o seu sobrenome?");
            String lastName = input.nextLine();

            System.out.println("Qual a sua naturalidade? (cidade de nascimento)");
            String placeOfBirth = input.nextLine();

            System.out.println("Qual a sua idade?");
            int age = input.nextInt();

            System.out.println("Deseja visualizar dados completos?");
        System.out.println("Digite 's' para SIM ou 'n' para NAO");
        char answer = input.next().charAt(0);

        if (answer == 's'){
            System.out.println("Nome:         " + name);
            System.out.println("Sobrenome:    " + lastName);
            System.out.println("Idade:        " + age);
            System.out.println("Naturalidade: " + placeOfBirth);
            repeat = 0;

        } else if (answer == 'n'){
            System.out.println("Nome:         " + name);
            System.out.println("Idade:        " + age);
            repeat = 0;

        } else{ 
            System.out.println("Digitação errada. Tente Novamente");
            System.out.println();
            repeat =1;
        }
        input.close();
        } while (repeat==1);
        
    }
    
}
