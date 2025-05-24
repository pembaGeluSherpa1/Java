package Anonymous;

import java.util.Scanner;

public class Main {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a choice");
        System.out.println("1, click");
        System.out.println("2, exit");
        String y = x.nextLine();

        switch (y) {
            case "click":
                Clicable c = new Clicable() {
                    @Override
                    public void unClickable() {
                        System.out.println("unclicable button");
                    }
                };
                c.unClickable();
                break;

            case "exit":
                Clicable c1 = new Clicable() {
                    @Override
                    public void unClickable() {
                        System.out.println("Exit button");
                    }
                };
                c1.unClickable();
                break;
                
            case "fun":
                Clicable c2 = new Clicable() {
                    @Override
                    public void unClickable() {
                        System.out.println("fun button");
                    }
                };
                c2.unClickable();
                break;

            default:
                System.out.println("invalid choice");
                break;
        }

    }
}
