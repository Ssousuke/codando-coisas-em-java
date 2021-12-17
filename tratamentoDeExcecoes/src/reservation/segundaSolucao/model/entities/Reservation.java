package reservation.segundaSolucao.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkIn;
    }

    public Date getCheckout() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.SECONDS);
    }

    public String updateDates(Date newCheckin, Date newCheckout) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            return "Erro na reserva: As data de reserva devem ser futuras!";
        }
        if (!checkOut.after(checkIn)) {
            return "Erro na reserva: Data de Check-Out deve ser posterior a data de Check-In";
        }
        this.checkIn = newCheckin;
        this.checkOut = newCheckout;
        return null;
    }

    @Override
    public String toString() {
        return "Reservation: " +
                "Quarto " + roomNumber +
                ", Checkin " + sdf.format(checkIn) +
                ", Checkout " + sdf.format(checkOut) +
                ", Duration " + duration();
    }
}
