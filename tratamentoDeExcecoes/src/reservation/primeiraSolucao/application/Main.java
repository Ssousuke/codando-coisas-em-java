package reservation.primeiraSolucao.application;

import reservation.primeiraSolucao.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Número do quarto: ");
        int number = sc.nextInt();

        System.out.println("Data do check-In: (dd/MM/yyyy)");
        Date checkIn = sdf.parse(sc.next());


        System.out.println("Data do check-Out: (dd/MM/yyyy)");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: Data de Check-Out deve ser posterior a data de Check-In");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("Entre com as novas datas para reserva: ");
            System.out.println("Data do check-In: (dd/MM/yyyy)");
            checkIn = sdf.parse(sc.next());

            System.out.println("Data do check-Out: (dd/MM/yyyy)");
            checkOut = sdf.parse(sc.next());

            Date now = new Date();
            if (checkIn.before(now) || checkOut.before(now)) {
                System.out.println("As data de reserva devem ser futuras!");
            } else if (!checkOut.after(checkIn)) {
                System.out.println("Erro na reserva: Data de Check-Out deve ser posterior a data de Check-In");

            } else {
                reservation.updateDates(checkIn, checkOut);
                System.out.println(reservation);
            }
        }
        sc.close();
    }
}
