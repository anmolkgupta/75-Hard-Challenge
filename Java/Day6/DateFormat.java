package Day6;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * DateFormat
 */
public class DateFormat {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date format change by Anmolkgupta ");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date format with MM/dd/yyyy :"+strDate);

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date format with dd-M-yyyy hh:mm:ss : "+strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("Date format with dd MMMM yyyy hh:mm:ss : "+strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        System.out.println("Date format with dd MMMM yyyy zzzz hh:mm:ss : "+strDate);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("Date format with E, dd MMM yyyy HH:mm:ss z : "+strDate);
    }
}