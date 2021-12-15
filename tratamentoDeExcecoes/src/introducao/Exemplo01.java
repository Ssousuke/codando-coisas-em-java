package introducao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        method1();
        System.out.println("Fim do programa!");
    }

    public static void method1() {
        System.out.println("Méthodo 1 - INICIA -");
        method2();
        System.out.println("Méthodo 1 - FINAL -");
    }

    public static void method2() {
        System.out.println("Méthodo 2 - INICIO -");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição Invalida!");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Input Invalido!");
        }
        System.out.println("Méthodo 2 - FINAL -");
        sc.close();
    }
}
