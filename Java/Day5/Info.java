package Day5;

// create interface in java

public interface Info {
    static final String language = "Java";
    public void display();
}

class Simple implements Info {
    public static void main(String[] args) {
        Simple obj = new Simple();
        obj.display();
    }
    // defining method declared in interface

    public void display() {
        System.out.println(language + " is awesome");
    }
}