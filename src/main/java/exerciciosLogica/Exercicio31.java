/*
        31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o
    resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser
    impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
 */

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        double a=0, b=0,resultadoCalculo=0;
        char c;

        System.out.println("Informe valor de A: ");
        a = scanner.nextDouble();

        System.out.println("Informe valor de B: ");
        b = scanner.nextDouble();

        System.out.println("Informe caracter de C: ");
        c = scanner.next().charAt(0);

        if(c == '+' || c == '-'|| c == '*' || c == '/' ) {
            if (c == '+'){
                resultadoCalculo = a + b;

            }else if (c == '-'){
                resultadoCalculo = a - b;

            }else if (c == '*'){
            resultadoCalculo = a * b;

            }else if (c == '/') {
                resultadoCalculo = a - b;

                if (b == 0) {
                    System.out.println("Não é possível dividir por zero.");
                }
            }

            System.out.println("Resultado: "+resultadoCalculo);
        }else
            System.out.println("Operador não definido");

    }
}