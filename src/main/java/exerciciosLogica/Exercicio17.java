/*
    17. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive)
        e 150 (inclusive);

 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i,contador = 0;

        for(i = 1;i <= 80 ;i++){
            System.out.print("Digite número : ");
            int numero = scanner.nextInt();

            if(numero >= 10 && numero <= 150){
                contador++;
            }
        }
        System.out.println("Total : "+contador);
    }
}