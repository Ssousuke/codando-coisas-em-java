package basico;

import java.util.Scanner;

public class SomaDosNumerosComWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os numeros para somar e zero (0) para finalizar!");
        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {

            soma += x;

            System.out.println("Digite um número para somar: ");
            x = sc.nextInt();
        }
        System.out.println(soma);

        sc.close();
    }
}
