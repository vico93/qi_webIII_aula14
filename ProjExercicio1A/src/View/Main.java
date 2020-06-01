package View;

import Model.Vendedor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // stdin
        Scanner stdin = new Scanner(System.in);

        // Variáveis temporárias
        String nome;                                    // Nome do Vendedor
        String classificacaoFinal;                      // Classificação do Vendedor
        double[] valorVendasMensais = new double[3];    // Empaquei nessa parte de inicializar o array e o IDEA me sugeriu isso pra inicializar

        // Leitura do usuário
        System.out.print("Digite o nome do Vendedor: ");
        nome = stdin.nextLine();

        for (int i = 0; i < valorVendasMensais.length; i++) {
            System.out.print("Digite o valor total de vendas do mês " + (i+1) + ": ");
            valorVendasMensais[i] = stdin.nextDouble();
        }

        // Cria objeto principal
        Vendedor v1 = new Vendedor(nome, valorVendasMensais);

        // Switch pra classificar o vendedor: eu confesso, poderia ter retornado uma String, MAS prefiro internamente usar numéricos e tratar a informação no Main
        switch (v1.classificarVendedor()) {
            case 1:
                classificacaoFinal = "Vendedor Desmotivado";
                break;
            case 2:
                classificacaoFinal = "Vendedor Bom";
                break;
            case 3:
                classificacaoFinal = "Ótimo Vendedor";
                break;
            case 4:
                classificacaoFinal = "Excelente Vendedor – Receber prêmio";
                break;
            default:
                classificacaoFinal = "Péssimo Vendedor";
        }

        // Saída
        System.out.println(v1);
        System.out.println("O vendedor " + v1.getNome() + ", vendeu " + String.format("R$ %.2f", v1.calcularMediaVendas()) + " e sua categoria é " + classificacaoFinal + ".");
    }
}
