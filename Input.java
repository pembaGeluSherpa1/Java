// static float addition;
// static float subtraction;
// static float multiplication;
// static float division;
// static float power;
// static float squareRoot;
// static float logarithm;
// static float sine;
// static float cosine;
// static float tangent;
// static float factorial;
// static float modulus;
// static float absoluteValue;
// static float exponentiation;
// static float reciprocal;
// static float percentage;
// static float floorFunction;
// static float ceilFunction;
// static float roundFunction;
// static float cubeRoot;

import java.util.Scanner;
public class Input {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        int input = 1;
        while(input!=0){

        System.out.println("Enter a number for the operation : ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Factorial");
        int n = x.nextInt();
        
        if(n<5 && n>0){
            twoNumber(n);
        }else if(n==5){
            singleNumber(n);
        }else{
            System.out.println("Entered Wrong Option");
        }
        
        System.out.println("Wants to continue press any number or press 0: ");
        input = x.nextInt();
    }
    }

    static void singleNumber(int n){
        System.out.println("Enter a number");
            int input3 = x.nextInt();
            if(n==5){
                factorial(input3);
            }
    }

    static void twoNumber(int a){
        System.out.println("Enter two numbers");
        float input1 = x.nextFloat();
        float input2 = x.nextFloat();

        if(a==1){
            add(input1,input2);
        }else if(a==2){
            substract(input1,input2);
        }else if(a==3){
            multiply(input1,input2);
        }else if(a==4){
            divide(input1,input2);
        }
    }

    static void add(float a, float b){
        System.out.println("Sum: "+(a+b));
    }

    static void substract(float a, float b){
        System.out.println("Difference: "+(a-b));
    }

    static void multiply(float a, float b){
        System.out.println("Multiplication: "+(a*b));
    }

    static void divide(float a, float b){
        System.out.println("Division: "+(float)a/(float)b);
    }

    static void factorial(float a){
        int fact =1;
        for(int i=1;i<=a;i++){
            fact *= i;
        }
        System.out.println("Factorial of a number "+a+": "+ fact);
    }

}
