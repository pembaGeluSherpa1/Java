package String;

public class Hash {
    public static void main(String[] args) {
        String s = "asd";

        System.out.println(s);
        System.out.println(System.identityHashCode(s));
        s=s+"yo";
        System.out.println(System.identityHashCode(s));
        s=s+"abc";
        System.out.println(s);
        System.out.println(System.identityHashCode(s));
    }
}
