package reservation.segundaSolucao.model.application;

import reservation.segundaSolucao.model.entities.Reservation;

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

            String error = reservation.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println(error);
            } else {
                System.out.println(reservation);
            }
        }
        sc.close();
    }
}
