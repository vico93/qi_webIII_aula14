package Model;

import java.util.Arrays;

public class Vendedor {
    // Atributos
    private String nome;
    private double[] valorVendasMensais;

    // Getter/Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double[] getValorVendasMensais() {
        return valorVendasMensais;
    }
    public void setValorVendasMensais(double[] valorVendasMensais) {
        this.valorVendasMensais = valorVendasMensais;
    }

    // Construtor
    public Vendedor(String nome, double[] valorVendasMensais) {
        this.nome = nome;
        this.valorVendasMensais = valorVendasMensais;
    }

    // Métodos
    public double calcularMediaVendas() {
        double mediaVendas = 0.0;
        for (double i : this.valorVendasMensais) {
            mediaVendas += i;
        }
        return mediaVendas / this.valorVendasMensais.length;
    }

    public int classificarVendedor() {
        int classificacaoVendedor = 0;                       // Variável que vai retornar a classificação final do vendedor: 0-péssimo 1-desmotivado 2-bom 3-ótimo 4-excelente
        double mediaVendas = this.calcularMediaVendas();     // Recebe a média já calculada de vendas que o vendedor fez nos meses

        // Vamos às checagens...
        if (mediaVendas <= 1000) {
            // Só pra ter certeza, rsrsrs
            classificacaoVendedor = 0;
        }
        else if ((mediaVendas > 1000) && (mediaVendas <= 2500)) {
            // Desmotivado
            classificacaoVendedor = 1;
        }
        else if ((mediaVendas > 2500) && (mediaVendas <= 5000)) {
            // Bom
            classificacaoVendedor = 2;
        }
        else if ((mediaVendas > 5000) && (mediaVendas <= 10000)) {
            // Ótimo
            classificacaoVendedor = 3;
        }
        else if (mediaVendas > 10000) {
            // Excelente
            classificacaoVendedor = 4;
        }

        return classificacaoVendedor;
    }


    // toString
    @Override
    public String toString() {
        String returnString = "";           // Variável temporária pra armazenar a string de retorno do array

        returnString = "Vendedor: " + nome; // Coloca o nomezinho do vendedor

        // Loop pra concatenar cada uma das vendas
        for (int i = 0; i < this.valorVendasMensais.length; i++) {
            returnString += "\nMês #" + (i+1) + ": " + this.valorVendasMensais[i];
        }

        // Finalmente o retorno
        return returnString;
    }
}
