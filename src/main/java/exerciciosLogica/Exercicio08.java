/*
    8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em
    dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
    disponíveis com ousuário;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da cotação : ");
        double valorCotacao = scanner.nextDouble();

        System.out.print("Informe a quantidade de dólares : U$ ");
        double qtdDolares = scanner.nextDouble();

        double real = valorCotacao * qtdDolares;

        System.out.print("Valor em real (R$) : R$ "+real);
    }
}