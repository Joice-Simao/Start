/*
    21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
            ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;

        for(i = 0; i <= 5; i++){

            System.out.println("Nome : ");
            String nome = scanner.next();

            System.out.println("Sexo 1 - Feminino / 2 - Masculino: ");
            int sexo = scanner.nextInt();

            System.out.println("Idade : ");
            int idade = scanner.nextInt();

            System.out.println("Saúde : 1 - Boa / 2 - Ruim");
            int saude = scanner.nextInt();

            if(sexo == 2 && idade >= 18 && saude == 1){
                System.out.println("Apto para cumprir o serviço militar obrigatório");

            }else
                System.out.println("Dispensado(a)");

        }
    }
}