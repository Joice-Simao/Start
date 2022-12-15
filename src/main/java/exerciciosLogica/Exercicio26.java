/*
    26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número
            que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 5 : ");
        int numero = scanner.nextInt();

        if(numero == 1){
            System.out.println("Um");

        }else if(numero == 2) {
            System.out.println("Dois");

        }else if(numero == 3) {
            System.out.println("Três");

        }else if(numero == 4) {
            System.out.println("Quatro");

        }else if(numero == 5) {
            System.out.println("Cinco");

        }else
            System.out.println("Número inválido");
    }
}