import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array");
        Scanner Y = new Scanner(System.in);
        int size = Y.nextInt();
        int array[] = new int[size];

        Scanner op = new Scanner(System.in);
        System.out.println("Enter the value in an array");

        int sum = 0;

        for(int i = 0; i<size; i++){
            array[i] = op.nextInt();
            sum+=array[i];
        }

        System.out.println(sum);

        System.out.println("Enter a number to get it's multiplication");
        Scanner n = new Scanner(System.in);

        int x = n.nextInt();
        System.out.println("multiplication of "+x);
    
        for(int i=1;i<11;i++){
            System.out.println(x+" x "+i+"= "+(x*i));
        }
    }
}