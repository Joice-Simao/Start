/*
    35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
    luz segue a tabela abaixo:
    Tipo de Cliente Valor do KW/h
    a. (Residência) 0,60;
    b. (Comércio) 0,48;
    c. (Indústria) 1,29.
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio35 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double horas=0, valorConta=0;
        int cliente;

        System.out.println("Informe quantidade de horas consumidas");
        horas = scanner.nextDouble();

        System.out.println("Informe tipo de cliente: 1-Residência / 2-Comércio / 3-Indústria");
        cliente = scanner.nextInt();

        if (cliente == 1){
            valorConta = horas * 0.60;

        }else if (cliente == 2) {
            valorConta = horas * 0.48;

        }else if (cliente == 3)
                valorConta = horas * 1.29;

            System.out.print("Valor da conta R$ "+valorConta);
    }
}