/*
     7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
        conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
 */

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio07 {
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

   System.out.print("Informe temperatura em Celsius");
    double temperaturaCelsius = scanner.nextDouble();

    double temperaturaFahrenheit = ((9 * temperaturaCelsius) + 160) / 5 ;

    System.out.print("Temperatura em Fahrenheit : "+temperaturaFahrenheit);

  }
}