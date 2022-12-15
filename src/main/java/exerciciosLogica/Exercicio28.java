/*
    28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
    com os seguintes critérios:
        a. 50% para aqueles que ganham menos do que três salários mínimos;
        b. 20% para aqueles que ganham entre três até dez salários mínimos;
        c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
        d. 10% para os demais funcionários.
    Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
    reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa
    vai aumentar sua folha de pagamento;

 */
package exerciciosLogica;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        double novoSalario, reajuste, totalSalario = 0, totalReajuste = 0;
        for(i = 1; i <= 584; i++) {
            System.out.print("Nome do funcionário : ");
            String nome = scanner.next();

            System.out.print("Salário : R$ ");
            double salarioFuncionario = scanner.nextDouble();

            System.out.print("Valor do salário mínimo: R$ ");
            double salarioMinimo = scanner.nextDouble();

            totalSalario = totalSalario + salarioFuncionario;

            if (salarioFuncionario < salarioMinimo * 3) {
                reajuste = salarioFuncionario * 0.50;
                novoSalario = salarioFuncionario + reajuste;
                totalReajuste = totalReajuste + reajuste;

                System.out.println("Nome do funcionário : " + nome);
                System.out.println("Reajuste : R$ " + reajuste);
                System.out.println("Novo salário: R$ " + novoSalario);

            } else if (salarioFuncionario >= salarioMinimo * 3 && salarioFuncionario <= salarioMinimo * 10) {
                reajuste = salarioFuncionario * 0.20;
                novoSalario = salarioFuncionario + reajuste;
                totalReajuste = totalReajuste + reajuste;

                System.out.println("Nome do funcionário : " + nome);
                System.out.println("Reajuste : R$ " + reajuste);
                System.out.println("Novo salário: R$ " + novoSalario);

            } else if (salarioFuncionario > salarioMinimo * 10 && salarioFuncionario <= salarioMinimo * 20) {
                reajuste = salarioFuncionario * 0.15;
                novoSalario = salarioFuncionario + reajuste;
                totalReajuste = totalReajuste + reajuste;

                System.out.println("Nome do funcionário : " + nome);
                System.out.println("Reajuste : R$ " + reajuste);
                System.out.println("Novo salário: R$ " + novoSalario);

            } else {
                reajuste = salarioFuncionario * 0.10;
                novoSalario = salarioFuncionario + reajuste;
                totalReajuste = totalReajuste + reajuste;

                System.out.println("Nome do funcionário : " + nome);
                System.out.println("Reajuste : R$ " + reajuste);
                System.out.println("Novo salário: R$ " + novoSalario);

            }
            System.out.println("Aumento na folha de pagamento R$ "+totalReajuste);
        }
    }
}