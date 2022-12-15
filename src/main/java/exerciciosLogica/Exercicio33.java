/*
    33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
    calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
    a. Professor Nível 1 R$12,00 por hora/aula;
    b. Professor Nível 2 R$17,00 por hora/aula;
    c. Professor Nível 3 R$25,00 por hora/aula
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio33 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double horas = 0, salario = 0;
        int nivel;

        System.out.println("Informe horas trabalhadas");
        horas = scanner.nextFloat();

        System.out.println("Nivel do professor");
        nivel = scanner.nextInt();

        if (nivel == 1) {
            salario = horas * 12.00;

        } else if (nivel == 2) {
            salario = horas * 17.00;

        } else if (nivel == 3) {
            salario = horas * 25.00;
        }
        System.out.println("Salário: R$ "+salario);
    }
}
