package polymorphism;
public class Main {
    static int a;
    static int b;
    static int c;
    static int d;
    static int sum;
    public static void main(String[] args) {
        System.out.println("Addition of 1: "+ add(12));
        System.out.println("Addition of 2: "+ add(11,12));
        System.out.println("Addition of 3: "+ add(2,3,4));
        System.out.println("Addition of 4: "+ add(3,4,5,6));
    }

    static int add(int a){
        return sum=a;
    }

    static int add(int a, int b){
        return sum=a+b;
    }
    static int add(int a,int b, int c){
        return sum=a+b+c;
    }
    static int add(int a, int b, int c, int d){
        return sum=a+b+c+d;
    }
}
