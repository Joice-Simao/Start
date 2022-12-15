/*
    23. Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80,
            menor que 25 ou igual a 40;

 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite número : ");
        int numero = scanner.nextInt();

        if(numero == 40){
            System.out.print("O número digitado é igual 40.");

        }else if (numero < 25){
            System.out.print("O número digitado é menor que 25.");

        }else if (numero > 80){
            System.out.print("O número digitado é maior que 80.");

        }
    }
}