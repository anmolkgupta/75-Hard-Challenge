package Day5;

public class ThrowException {
    static void validate(int age) {
        if(age < 18)
        throw new ArithmeticException("not valid");
        else 
            System.out.println("Welcome to Java Programming");
    }
    public static void main(String[] args) {
        validate(19);
        System.out.println("Resume the code...");
    }
}
