package Day5;

// static block working

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method is executed after static method.");
    }

    static {
        System.out.println("Static block is executed before main method.");
    }
}

// class StaticBlock {
// public static void main(String args[]) {
// System.out.println("You are using Windows operating system.");
// }

// static {
// String os = System.getenv("OS");
// if (os.equals("Windows") != true) {
// System.exit(1);
// }
// }
// }
