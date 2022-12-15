/*
    12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
mesmo;

 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Custo de fábrica : ");
        double custoFabrica = scanner.nextDouble();

        double distribuidor = (28 * custoFabrica) / 100;
        double impostos = (45 * custoFabrica) / 100;
        double custoConsumidor = custoFabrica + impostos + distribuidor;

        System.out.println("Custo consumidor : R$ "+custoConsumidor);

    }
}