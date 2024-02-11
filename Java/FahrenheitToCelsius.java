import java.util.*;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float t;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        t = in.nextInt();

        t = ((t - 32) * 5) / 9;

        System.out.println("Temperatue in Celsius = " + t);
        in.close();
    }
}
