import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        boolean isUpper = false , isLower = false , isNum = false , isSpecial = false ;
        // String specialChar = "!@£$%&*";

        System.out.print("Enter 4 digit password: ");

        Scanner y = new Scanner(System.in);
        String input1 = y.nextLine();
        System.out.println("Input before type conversion: "+ input1);

        char[] input = input1.toCharArray();

        System.out.print("Input after type conversion: ");
        for(int i = 0; i<input.length;i++){
            System.err.print(input[i]+ " ");
        }


        if(input[0] >= 'A' && input[0] <='Z' || input[1] >= 'A' && input[1] <='Z' || input[2] >= 'A' && input[2] <='Z' || input[3] >= 'A' && input[3] <='Z'){
            isUpper = true;
        }

        if(input[0] >= 'a' && input[0] <='z' || input[1] >= 'a' && input[1] <='z' || input[2] >= 'a' && input[2] <='z' || input[3] >= 'a' && input[3] <='z'){
            isLower = true;
        }
        if(input[0] >= '0' && input[0] <='9' || input[1] >= '0' && input[1] <='9' || input[2] >= '0' && input[2] <='9' || input[3] >= '0' && input[3] <='9'){
            isNum = true;
        }
        if(input[0] == '@' || input[1] =='@' || input[2] == '@' || input[3] =='@'){
            isSpecial = true;
        }

        if(isUpper == true && isLower == true && isNum == true && isSpecial == true){
            System.out.println("password is validate");
        } else {
            System.out.println("Invalid password");
        }
    }
}