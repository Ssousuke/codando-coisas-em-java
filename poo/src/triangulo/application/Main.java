package triangulo.application;

import triangulo.entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();


        System.out.println("Entre com as médidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com as médidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calculaAreaTriangulo();
        double areaY = y.calculaAreaTriangulo();

        System.out.printf("Triangulo X: %.4f%n", areaX);
        System.out.printf("Triangulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A maior área é do: X");
        } else {
            System.out.println("A maior área é do: y");
        }

        sc.close();
    }
}
