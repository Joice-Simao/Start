/*
    1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
    altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
    todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
 */
package exerciciosOrientacaoObjetos;

public class Pessoa {

    private String nome;
    private String dataNascimento;
    private double altura;

    public Pessoa(String nome, String dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}