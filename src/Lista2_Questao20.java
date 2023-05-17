/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: Lista2_Questao20 
 * Descrição: 20. Escreva um programa que, dada a carga máxima de um
 * elevador e a quantidade máxima de pessoas digitadas pelo usuário, leia o peso de cada pessoa, também digitada pelo usuário, 
 * que entra no elevador até que a carga máxima seja atingida ou o número máximo de pessoas seja atingido (utilize do /while).
 * Data: 17/05/2023
 */

import java.util.Scanner;

public class Lista2_Questao20 {
    public static void main(String[] args) {
        //declarando valores
        int QtdPessoas = 0;
        int pesoMax;
        int maxPessoas;
        int pesoTotal = 0;
        
        // colocando as perguntas e a entrada dos valores

        System.out.println("Insira a quantidade maxima de pessoas suportadas no elevador:");
        Scanner teclado = new Scanner(System.in);
        maxPessoas = teclado.nextInt();
        System.out.println("Insira o peso maximo suportado pelo elevador:");
        pesoMax = teclado.nextInt();

        //faça o que estiver dentro, enquanto a Qtd de Pessoas for menor que o max Pessoas e o peso total for menor que o peso max.
        
        QtdPessoas = PesoMaxEMaxPessoas(QtdPessoas, pesoMax, maxPessoas, pesoTotal, teclado);
        
        //se a quantidade de pessoas atingir o limite(maximo de pessoas)
        ImprimirResultado(QtdPessoas, maxPessoas);
    }

    private static void ImprimirResultado(int QtdPessoas, int maxPessoas) {
        if (QtdPessoas == maxPessoas){
        //imprimir que o máximo de pessoas foi atingido
        System.out.println("Número máximo de pessoas atingido!");
    } else {
        //senão, imprimir que o peso máximo foi atingido
        System.out.println("Peso máximo atingido!");
    }
    }

    private static int PesoMaxEMaxPessoas(int QtdPessoas, int pesoMax, int maxPessoas, int pesoTotal, Scanner teclado) {
        int pesoUsuario;
        do {
            //perguntando e entrando com os pesos de cada pessoa.
            System.out.println("insira o peso do usuário");
            pesoUsuario = teclado.nextInt();
            
            //a cada peso novo inserido a quantidade de pessoas vai aumentar em 1, o peso total vai ser a soma dos pesos de todos o usuários (pessoas)
            QtdPessoas = QtdPessoas +1;
            pesoTotal = pesoTotal + pesoUsuario;

            
        } while (QtdPessoas < maxPessoas && pesoTotal < pesoMax);
            teclado.close();
        return QtdPessoas;
    }
}