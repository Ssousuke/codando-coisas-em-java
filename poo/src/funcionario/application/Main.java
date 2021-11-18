package funcionario.application;

import funcionario.entities.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();

        System.out.println("Sálario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.println("Imposto: ");
        funcionario.tax = sc.nextDouble();

        System.out.println(funcionario.toString());

        System.out.println("Porcentagem de aumento: ");
        double aumentarSalario = sc.nextDouble();
        funcionario.aumentaSalario(aumentarSalario);

        System.out.println(funcionario.toString());
        sc.close();
    }
}
