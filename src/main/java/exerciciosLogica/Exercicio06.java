/*
    6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que
        a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor
        da variável A.Apresentar os valores trocados;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe valor da variável A : ");
    int variavelA = scanner.nextInt();

    System.out.print("Informe valor da variável B : ");
    int variavelB = scanner.nextInt();

    int aux = variavelA;
    variavelA = variavelB;
    variavelB = aux;

        System.out.println("Variável A : "+variavelA);
        System.out.println("Variável B: "+variavelB);

    }
}