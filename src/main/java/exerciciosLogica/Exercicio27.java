/*
    27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
    algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
    calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
    –14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
    clientes;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio27 {
    public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);
       double desconto = 0, valorVeiculo;

       do {
           System.out.println("Valor do veículo : R$ ");
           valorVeiculo = scanner.nextDouble();

           System.out.println("Combustível A - Alcool / D - Diesel / G - Gasolina : ");
           char tipoCombustivel = scanner.next().charAt(0);

           if (tipoCombustivel == 'a' || tipoCombustivel == 'A') {
               desconto = valorVeiculo * 0.25;

           } else if (tipoCombustivel == 'd' || tipoCombustivel == 'D') {
               desconto = valorVeiculo * 0.14;

           } else if (tipoCombustivel == 'g' || tipoCombustivel == 'G') {
               desconto = valorVeiculo * 0.21;
           }
           double valorVenda = valorVeiculo - desconto;
           System.out.println("Total desconto : R$ " + desconto);
           System.out.println("Valor venda : R$ " +valorVenda);
           System.out.println("------------------------------------");

       }while(valorVeiculo != 0);
    }
}