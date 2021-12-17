package reservation.terceiraSolucao.application;

import reservation.terceiraSolucao.model.entities.Reservation;
import reservation.terceiraSolucao.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Número do quarto: ");
            int number = sc.nextInt();

            System.out.println("Data do check-In: (dd/MM/yyyy)");
            Date checkIn = sdf.parse(sc.next());


            System.out.println("Data do check-Out: (dd/MM/yyyy)");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("Entre com as novas datas para reserva: ");
            System.out.println("Data do check-In: (dd/MM/yyyy)");
            checkIn = sdf.parse(sc.next());

            System.out.println("Data do check-Out: (dd/MM/yyyy)");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println(reservation);
        } catch (ParseException | DomainException exception) {
            System.out.println(exception.getMessage());
        } catch (RuntimeException runtimeException) {
            System.out.println("Erro: Tente novamente!");
        }
        sc.close();
    }
}
