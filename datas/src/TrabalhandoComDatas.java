import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrabalhandoComDatas {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        Date x = sdf1.parse("22/11/2021");
        Date y = sdf2.parse("22/11/2021 03:04:44");

        Date agora = new Date();

        System.out.println(x);
        System.out.println(y);
        System.out.println(agora);
    }
}
