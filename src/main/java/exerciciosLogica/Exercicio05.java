/*
    5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
        No final informar o nome do aluno e a sua média (aritmética);
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe nome do aluno : ");
        String nome = scanner.next();

        System.out.println("Informe nota 1 : ");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe nota 2 : ");
        double nota2= scanner.nextDouble();

        System.out.println("Informe nota 3 : ");
        double nota3= scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.print(nome+" sua média é "+media);

    }
}