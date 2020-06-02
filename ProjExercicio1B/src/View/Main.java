package View;

import Model.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // stdin
        Scanner stdin = new Scanner(System.in);

        // Variáveis locais
        String nome;                        // Nome do Aluno
        double[] notas = new double[3];     // Array de Notas
        int[] pesos = new int[3];           // Array de Pesos

        double nota;                        // Temporária pra armazenar a nota digitada
        int peso;                           // Temporária pra armazenar o peso digitada

        // Entrada
        System.out.print("Digite o nome do Aluno: ");
        nome = stdin.nextLine();

        // Leitura das notas
        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Digite a nota " + (i+1) + ": ");
                nota = stdin.nextDouble();
            }
            while (nota < 0.0);
            notas[i] = nota;
        }

        // Leitura dos pesos
        for (int i = 0; i < pesos.length; i++) {
            do {
                System.out.print("Digite o peso da nota " + (i+1) + ": ");
                peso = stdin.nextInt();
            }
            while (peso < 0.0);
            pesos[i] = peso;
        }

        // Criação do objeto principal
        Aluno a1 = new Aluno(nome,"QI",notas,pesos);

        // Saída
        System.out.println(a1);
        System.out.println("Média final (ponderada): " + String.format("%.2f",a1.calcularMediaPonderada()));
    }
}
