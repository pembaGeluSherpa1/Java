package Math;

public class Maths {
    public static void main(String[] args) {
        int a = -12;
        int b= -23;
        int sum = a+b;

        // 1
        System.out.println(java.lang.Math.abs(sum)); // returns absolute value which is always positive
        float degree = 0.5f;

        // 2
        System.out.println(java.lang.Math.acos(degree)); // returns cosine value [-1 , 1]
        int sqr = 25;

        // 3
        System.out.println(java.lang.Math.sqrt(sqr)); // square root of sqr
        int cubrt = 8;

        // 4
        System.out.println(java.lang.Math.cbrt(cubrt)); // returns the cuberoot of 125"cubrt"
        double floor = 21.09;

        // 5 floor:- returns the closest integer value which is less then or equal of given integer like "12.21" = "12", "12.99" = '12'
        System.out.println(java.lang.Math.floor(floor));

        // ceil:- is the opposite to the floor 12.67 = "13", 12.01 = "13"
        System.out.println(java.lang.Math.ceil(floor));
    }
}