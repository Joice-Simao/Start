/*
    19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
            mulher. No final informe total de homens e de mulheres;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int i = 0, contadorMulher = 0, contadorHomem = 0;

        for(i = 1; i <= 56; i++) {

            System.out.println(i+" - Nome : ");
            String nome = scanner.next();

            System.out.print(i+" - Gênero M - Mulher / H - Homem : ");
            char genero = scanner.next().charAt(0);

            if (genero == 'm' || genero == 'M'){
                contadorMulher++;
            }else if (genero == 'h' || genero == 'H'){
                contadorHomem++;
            }else
                System.out.print("Opção inválida");

        }
        System.out.println("Total homens : "+contadorHomem);
        System.out.println("Total mulheres : "+contadorMulher);
    }
}