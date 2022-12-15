/*
    9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
    mês.Considere fixo o juro da poupança em 0,07% a. m;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe valor depositado : R$ ");
        double valorDepositado = scanner.nextDouble();

        double valorRendimento = ((valorDepositado * 0.07) / 100) + valorDepositado;

        System.out.print("Valor com rendimento : R$ "+valorRendimento);
    }
}