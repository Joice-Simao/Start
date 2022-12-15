/*
    15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio15 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe número : ");
        int numero = scanner.nextInt();

        if(numero >= 100 && numero <= 200){
            System.out.print(numero+" está no intervalo entre 100 e 200");
        }
    }
}
