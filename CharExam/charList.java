package CharExam;

public class charList {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.toUpperCase(ch));
        char name = 'A';
        System.out.println(Character.isUpperCase(name));
        System.out.println(Character.toLowerCase(name));
        System.out.println(Character.isLetter(name));
        System.out.println(Character.isWhitespace(name));
        char num = '2';
        System.out.println(Character.isDigit(num));
    }
}
