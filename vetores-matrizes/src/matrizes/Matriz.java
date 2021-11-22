package matrizes;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        // Adicionando itens a matriz bidimensional
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimindo diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // Contando números negativos
        int numerosNegativos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < 0) {
                    numerosNegativos++;
                }
            }
        }
        System.out.println("Quantidade de números negativos: " + numerosNegativos);

        sc.close();
    }
}
