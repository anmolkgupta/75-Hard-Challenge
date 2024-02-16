package Day6;

import java.sql.Date;

/**
 * StringToSQLDate
 */
public class StringToSQLDate {
    public static void main(String[] args) {
        String str = "2015-03-31";
        Date date = Date.valueOf(str);
        System.out.println(date);
    }
}