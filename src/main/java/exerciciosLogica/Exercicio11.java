/*
    11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
            preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio11 {
        public static void main (String [] args){
            Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o preço de custo : ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Informe percentual : ");
        double percentual = scanner.nextDouble();

        double valorVenda = ((percentual * precoCusto) / 100) +precoCusto;

        System.out.print("Valor venda : "+valorVenda);

        }
}