package Model;

import java.util.Arrays;

public class Aluno {
    // Atributos
    private String nome;
    private String escola;
    private double[] notas;
    private int[] pesos;

    // Acessores
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEscola() {
        return escola;
    }
    public void setEscola(String escola) {
        this.escola = escola;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public int[] getPesos() {
        return pesos;
    }
    public void setPesos(int[] pesos) {
        this.pesos = pesos;
    }

    // Construtor
    public Aluno(String nome, String escola, double[] notas, int[] pesos) {
        this.nome = nome;
        this.escola = escola;
        this.notas = notas;
        this.pesos = pesos;
    }

    // Métodos
    public double calcularMediaPonderada() {
        double somaNotasPorPesos = 0.0;   // Armazena a primeira parte do cálculo
        double somaPesos = 0.0;           // Armazena a segunda parte do cálculo

        for (int i = 0; i < this.notas.length; i++) {
            somaNotasPorPesos += this.notas[i] * this.pesos[i];
        }
        for (int j = 0; j < this.pesos.length; j++) {
            somaPesos += this.pesos[j];
        }

        return somaNotasPorPesos / somaPesos; // Média Ponderada (soma de cada multiplicação de nota por peso divivido por soma de pesos)
    }

    // toString
    @Override
    public String toString() {
        // Desisti de fazer sofisticação :(
        return "Aluno: " + nome +
                "\nEscola: " + escola +
                "\nNotas: " + Arrays.toString(notas) +
                "\nPesos: " + Arrays.toString(pesos);
    }
}
