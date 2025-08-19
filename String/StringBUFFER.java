package String;

public class StringBUFFER {
    public static void main(String[] args) {
        StringBuffer p = new StringBuffer("apple");
        p.append(" is sweet\n");
        // p.append(true);
        // p.append(12);
        System.out.println("Append: "+p);
        p.ensureCapacity(1);
        System.out.println(p.capacity());
        System.out.println(p.indexOf("is"));
    }
}
