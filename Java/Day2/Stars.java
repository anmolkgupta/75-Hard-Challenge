package Day2;
public class Stars {
    public static void main(String[] args) {
        int rows, numbersOfStars;

        for (rows = 1; rows <= 10; rows++) {
            for (numbersOfStars = 1; numbersOfStars <= rows; numbersOfStars++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
