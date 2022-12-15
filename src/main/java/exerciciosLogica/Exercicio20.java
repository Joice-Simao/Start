/*
    20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char continuar;
        double desconto = 0, valorVenda;
        int totalVeiculos = 0, veiculoAte2000 = 0;

        do {
            System.out.println("Informe valor do carro : ");
            int valorVeiculo = scanner.nextInt();

            System.out.println("Informe ano do carro : ");
            int anoVeiculo = scanner.nextInt();

            totalVeiculos++;

            if(anoVeiculo <= 2000){
                desconto = valorVeiculo * 0.12;
                veiculoAte2000++;

            }else
                desconto = valorVeiculo * 0.07;

            valorVenda = valorVeiculo - desconto;
            System.out.println("Valor do desconto : R$ "+desconto);
            System.out.println("Valor venda veículo : R$ "+valorVenda);
            System.out.println("Continuar S - Sim / N - Não ");
            continuar = scanner.next().charAt(0);

        }while(continuar == 's' || continuar =='S');

        System.out.println("Total de carros : "+totalVeiculos);
        System.out.println("Total de carros com ano até 2000 : "+veiculoAte2000);
    }
}