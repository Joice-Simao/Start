/*
    2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração,
        multiplicação e a divisão dos dois números lidos;
*/
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe primeiro número : ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe segundo número : ");
        int numero2 = scanner.nextInt();

        int resultadoSoma = numero1 + numero2;
        int resultadoSubtracao = numero1 - numero2;
        int resultadoMultiplicacao = numero1 * numero2;
        int resultadoDivisao = numero1 / numero2;

        System.out.println("Soma : "+numero1+" + "+numero2+" = "+resultadoSoma);
        System.out.println("Subtracao : "+numero1+" - "+numero2+" = "+resultadoSubtracao);
        System.out.println("Multiplicacao : "+numero1+" * "+numero2+" = "+resultadoMultiplicacao);
        System.out.println("Divisao : "+numero1+" / "+numero2+" = "+resultadoDivisao);
    }
}