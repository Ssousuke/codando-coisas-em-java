package reservation.terceiraSolucao.model.entities;

import reservation.terceiraSolucao.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Erro ao atualizar: Datas de Check-Out deve ser posterior a de Check-In");
        }
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

    public void updateDates(Date newCheckin, Date newCheckout) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Error ao atualizar as datas: Datas devem ser posteriores as datas atuais.");
        }
        this.checkIn = newCheckin;
        this.checkOut = newCheckout;
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
