/*
    3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
        total percorrida pelo automóvel e o total de combustível gasto;
 */

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe distância total percorrida : ");
        double totalDistancia = scanner.nextDouble();

        System.out.print("Informe total de combustível gasto : ");
        double totalCombustivel = scanner.nextDouble();

        double media = totalDistancia / totalCombustivel;

        System.out.printf("Consumo médio :  %.2f ",media);
    }
}