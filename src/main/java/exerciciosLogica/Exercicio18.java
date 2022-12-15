/*
    18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
        “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i,contadorMenor = 0, contadorMaior = 0;

        for(i = 1; i < 75; i++) {
            System.out.println(i+" - Informe idade : ");
            int idade = scanner.nextInt();

            if (idade < 18) {
                System.out.println("Menor de idade");
            } else
                System.out.println("Maior de idade");
        }
    }
}