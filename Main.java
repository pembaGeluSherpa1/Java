public class Main {

    public static void main(String[] args) {
        System.out.println(concatenate("Hello ", "World!"));

        System.out.println("The sum of 4 number is: " + addFourNumber(2, 4, 5, 5));

        System.out.println("The greatest number is: " + greatestNumber(4, 4));

        System.out.println("The smallest number is: " + smallestNumer(4, 4));

        System.out.println(EvenOrOdd(10));

        System.out.println("Area of rectangle is: " + areaOfRectangle(5, 5));
    }

    // Addition of 4 numbers
    static int addFourNumber(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Greatest number among 2
    static int greatestNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Smallest number among 2
    static int smallestNumer(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    // Even or off number check
    static String EvenOrOdd(int x) {
        if (x % 2 == 0) {
            return x + " is an even number";
        } else {
            return x + " is an odd number";
        }
    }

    // Area of rectangle
    static int areaOfRectangle(int l, int b) {
        return l * b;
    }

    // concatenate the two string
    static String concatenate(String a, String b) {
        return a + b;
    }
}