package vetores.questao02.application;

import vetores.questao02.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Produto[] produtos = new Produto[n];

        for (int i = 0; i < produtos.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();

            produtos[i] = new Produto(nome, preco);
        }

        double soma = 0;
        for (int i = 0; i < produtos.length; i++) {
            soma += produtos[i].getPreco();
        }

        double media = soma / n;
        System.out.println(media);

        sc.close();
    }
}
