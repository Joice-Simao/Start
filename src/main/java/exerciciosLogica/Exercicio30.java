/*
    30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio30 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0, numero2 = 0, numero3 = 0, menor = 0, maior = 0, meio = 0;

        System.out.println("Informe primeiro valor : ");
        numero1 = scanner.nextInt();

        System.out.println("Informe segundo valor : ");
        numero2 = scanner.nextInt();

        System.out.println("Informe terceiro valor : ");
        numero3 = scanner.nextInt();

        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3)
            System.out.println("Valores não podem ser iguais");
        else

        //menor
        if (numero1 < numero2 && numero1 < numero3) {
            menor = numero1;

        } else if (numero2 < numero1 && numero2 < numero3) {
            menor = numero2;

        } else if (numero3 < numero1 && numero3 < numero2) {
            menor = numero3;
        }
        //meio
        if (numero1 > numero2 && numero1 < numero3 || numero1 < numero2 && numero1 > numero3) {
            meio = numero1;

        } else if (numero2 > numero1 && numero2 < numero3 || numero2 < numero1 && numero2 > numero3) {
            meio = numero2;

        } else if (numero3 > numero1 && numero3 < numero2 || numero3 < numero1 && numero3 > numero2) {
            meio = numero3;
        }
        //maior
        if (numero1 > numero2 && numero1 > numero3) {
          maior = numero1;

        } else if (numero2 > numero1 && numero2 > numero3) {
          maior = numero2;

        } else if (numero3 > numero1 && numero3 > numero2) {
          maior = numero3;
        }

        System.out.println(menor+" - "+meio+ " - "+maior);

        }
    }