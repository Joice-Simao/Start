/*
    32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
    Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
    Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
    outros dois lados.
    a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
    b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
    c. Triângulo equilátero é também isóscele;
    d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int valor1=0, valor2=0, valor3=0;

        System.out.println("Informe primeiro valor ");
        valor1 = scanner.nextInt();

        System.out.println("Informe segundo valor ");
        valor2 = scanner.nextInt();

        System.out.println("Informe terceiro valor ");
        valor3 = scanner.nextInt();

        if (valor1 < (valor2+valor3) || valor2 < (valor1+valor3) || valor3 < (valor1+valor2)){

            if (valor1 == valor2 && valor1 == valor3){
                System.out.println("Triângulo Equilátero e Isóscele");

            } else if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3){
                System.out.println("Triângulo Isóscele");

            } else if (valor1 != valor2 && valor2 != valor3 && valor1 != valor3){
                System.out.println("Triângulo Escaleno");
            }
        }

    }
}