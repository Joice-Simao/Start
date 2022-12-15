/*
    25. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes.
            Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais.
            Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe primeiro número : ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe segundo número : ");
        int numero2 = scanner.nextInt();

        if(numero1 > numero2){
            System.out.print(numero1+" é maior.");

        }else if(numero1 < numero2){
            System.out.print(numero2+" é maior.");

        }else
            System.out.print("Números iguais");
    }
}