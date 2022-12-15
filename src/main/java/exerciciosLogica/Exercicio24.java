/*
    24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        for (i = 0; i < 5; i++){
            System.out.print("Digite número : ");
            int numero = scanner.nextInt();

            if(numero > 0){
                System.out.println("\u001b[35mNúmero positivo.\u001b[m");

            }else if (numero < 0){
                System.out.println("\u001b[35mNúmero negativo.\u001b[m");

            }else
                System.out.println("\u001b[35mZero\u001b[0m");

        }
    }
}