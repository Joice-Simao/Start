/*
    22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
de venda de cada produto, a média de preço de custo e do preço de venda;

 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio22 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int i,totalProdutos = 0;
        double precoVenda = 0, precoCusto, totalPreco = 0, mediaPreco = 0, totalCusto = 0, mediaCusto = 0;

        for(i = 1; i <= 5; i++) {
            System.out.print("Preço de custo : R$ ");
            precoCusto = scanner.nextDouble();

            System.out.print("Preço de venda : R$ ");
            precoVenda = scanner.nextDouble();

            totalProdutos++;

            totalCusto = totalCusto + precoCusto;
            mediaCusto = totalCusto / totalProdutos;

            totalPreco = totalPreco + precoVenda;
            mediaPreco = totalPreco / totalProdutos;

            if(precoCusto < precoVenda) {
                System.out.println("Lucro");

            }else if (precoCusto > precoVenda) {
                System.out.println("Prejuízo");

            }else
                System.out.println("Empate");

        }
        System.out.println("Média de custo : R$ "+mediaCusto);
        System.out.println("Média de preço : R$ "+mediaPreco);
    }
}