/*
    13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite número : ");
        int numero = scanner.nextInt();

        if (numero > 10) {
            System.out.println("Número digitado é maior que 10 !");
        }
    }
}