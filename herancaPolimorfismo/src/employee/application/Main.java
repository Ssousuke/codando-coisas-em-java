package employee.application;

import employee.entities.Employee;
import employee.entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o número de funcionários: ");
        int n = sc.nextInt();

        List<Employee> listEmployee = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do funcionário n#" + (i + 1));

            System.out.println("O funcionário é terceirizado? ");
            char opt = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Nome: ");
            String name = sc.nextLine();

            System.out.println("Horas: ");
            int hours = sc.nextInt();

            System.out.println("Valor por hora: ");
            double valuePerHour = sc.nextDouble();

            if (opt == 'y') {
                System.out.println("Taxa adicional");
                double additionalCharge = sc.nextDouble();
                Employee employee = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
                listEmployee.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                listEmployee.add(employee);
            }

            System.out.println();
            System.out.println("Pagamento: ");
            for (Employee employee : listEmployee) {
                System.out.println("Nome: " + employee.getName() + ", Pagamento: " + employee.payment());
            }
        }
        sc.close();
    }
}
