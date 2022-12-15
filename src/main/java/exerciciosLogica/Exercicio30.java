/*
    30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio30 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0, numero2 = 0, numero3 = 0;

        System.out.println("Informe primeiro valor : ");
        numero1 = scanner.nextInt();

        System.out.println("Informe segundo valor : ");
        numero2 = scanner.nextInt();

        System.out.println("Informe terceiro valor : ");
        numero3 = scanner.nextInt();

        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3)
            System.out.println("Valores não podem ser iguais");


    }

}