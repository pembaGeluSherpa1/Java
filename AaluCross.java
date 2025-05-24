import java.util.Scanner;

public class AaluCross {
    static char[][] cross = {
        {'2','3','4'},
        {'5','4','6'},
        {'7','8','9'}
    };
    static int num;

    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        while(num==1||num==2||num==0){
        System.out.println("1, Check the 2d Array");
        System.out.println("2, Change the 2d Array");
        System.out.println("3, Exit");

        System.out.println("Enter a Number for the above Operation:");
        num = x.nextInt();


        switch (num) {
            case 1:{
                printBoard();
                break;
            }
            case 2:{
                changeBoard();
                break;
            }
            case 3:{
                break;
            }
            default:{
                System.out.println("Wrong Option!.......");
            }
        }
    }
    }

    static void changeBoard(){
        System.out.println("Enter a 2d matrix number to change its [m][n]: ");
        int m = x.nextInt();
        int n = x.nextInt();
        System.out.println("Change the value of [" +m+ "][" +n+ "]");
        // cross[m][n] = x.next().chars(); 
        printBoard();
    }

    static void printBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("|"+cross[j][i]+"|");
            }
            System.out.println("");
        }
    }

}