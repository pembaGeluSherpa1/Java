package StackEg;
import java.util.Stack;

public class StackEg {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.push(12);
        num.push(21);
        num.push(31);
        num.push(41);
        System.out.println(num.peek());
        num.pop();
        System.out.println(num.peek());
        System.out.println(num.search(31));
    }

    // @Override
    // void push(int num){
    //     System.out.println("Hello world"+num);
    // }
}
