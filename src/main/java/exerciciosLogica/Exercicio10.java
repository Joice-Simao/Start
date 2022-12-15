/*
    10. A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um
        algoritmo que receba um valor de uma compra e mostre o valor das prestações;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da compra : R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Quantidade de parcelas : ");
        double qtdeParcelas= scanner.nextDouble();

        if (qtdeParcelas <= 5){
            double valorParcela = valorCompra / qtdeParcelas;
            System.out.print("Valor das parcelas : R$ "+valorParcela);
        }else
            System.out.print("Parcelamento até 5x");

    }
}