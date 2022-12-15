/*
    4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
        por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
        efetuadas, informar o seu nome, o salário fixo e salário no final do mês;

 */

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do vendedor :");
        String nomeVendedor = scanner.next();

        System.out.print("Salário fixo :");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Total de vendas no mês :");
        double totalVendas = scanner.nextDouble();

        double salarioFinal = (totalVendas * 0.15) + salarioFixo;

        System.out.println("Nome : "+nomeVendedor);
        System.out.println("Salário fixo : R$"+salarioFixo);
        System.out.println("Salário final : R$"+salarioFinal);

    }
}