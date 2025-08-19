package Final;

public class Main extends FinalMethod {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("An unexpected error occurred");
        } catch (RuntimeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public void FinalYo() {
        System.out.println("Hello world");
    }
}