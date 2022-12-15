// 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio01 {

    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite primeiro número : ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite segundo número : ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 + numero2;

        System.out.print(+numero1+" + "+numero2+" = "+resultado);
    }
}