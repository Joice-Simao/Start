/*
    14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe primeiro valor");
        int numero1 = scanner.nextInt();

        System.out.print("Informe segundo valor");
        int numero2 = scanner.nextInt();

        if(numero1 > numero2){
            System.out.print(numero1+" é o maior número.");

        }else if (numero2 > numero1){
            System.out.print(numero2+" é o maior número.");

        }else
            System.out.print("Valores iguais");
    }
}