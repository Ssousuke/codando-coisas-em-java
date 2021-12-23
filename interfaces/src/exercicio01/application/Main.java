package exercicio01.application;

import exercicio01.model.entities.CarRental;
import exercicio01.model.entities.Vehicle;
import exercicio01.model.services.BrazilTaxService;
import exercicio01.model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Entre com os dados");
        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();

        System.out.println("Saida: (dd/MM/yyyy)");
        Date start = sdf.parse(sc.nextLine());

        System.out.println("Retorno: (dd/MM/yyyy)");
        Date finish = sdf.parse(sc.nextLine());

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Preço por hora:");
        double pricePerHour = sc.nextDouble();

        System.out.println("Preço por dia:");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(carRental);
        System.out.println("Pagamento Básico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Taxa: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Pagamento Total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        sc.close();
    }
}
