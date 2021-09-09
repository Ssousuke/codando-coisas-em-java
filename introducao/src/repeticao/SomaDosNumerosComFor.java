package repeticao;

import java.util.Scanner;

public class SomaDosNumerosComFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja digitar: ");
        int quantidade = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < quantidade; i++) {

            System.out.println("Digite um numero para somar: ");
            int x = sc.nextInt();

            soma += x;
        }

        System.out.println(soma);

    }
}
