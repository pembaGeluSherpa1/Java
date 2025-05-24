import java.util.Scanner;
public class TicTacToe {
    static Scanner s = new Scanner(System.in);
    static char ComputerChoice = ' ';
    static char board[][] = {
        {'_', '_', '_'},
        {'_', '_', '_'},
        {'_', '_', '_'}
    };

    public static void main(String[] args) {
        System.out.println("Enter the choice (X or O):");
        char choice = s.next().charAt(0);

        if (choice == 'X' || choice == 'x') {
            ComputerChoice = 'O';
        } else if (choice == 'O' || choice == 'o') {
            ComputerChoice = 'X';
        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("You have entered: " + choice + ", the computer will enter: " + ComputerChoice);
        printBoard();
        
        while (true) {
            coordinate(choice);
            if (checkWinner(choice)) {
                System.out.println("You win!");
                break;
            }
            calculateComputerMove();
            printBoard();
            if (checkWinner(ComputerChoice)) {
                System.out.println("Computer wins!");
                break;
            }
        }
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void coordinate(char choice) {
        while (true) {
            System.out.println("Enter the coordinate (row and column 0-2):");
            int x = s.nextInt();
            int y = s.nextInt();

            if (x >= 0 && x < 3 && y >= 0 && y < 3 && board[x][y] == '_') {
                board[x][y] = choice;
                printBoard();
                return;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    static void calculateComputerMove() {
        System.out.println("Computer move:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_') {
                    board[i][j] = ComputerChoice;
                    return;
                }
            }
        }
    }

    static boolean checkWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }
}