package Ex7_6;

import java.util.Scanner;

class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    public void addMove(int row, int col) {
        if (board[row-1][col-1] == ' ') {
            board[row-1][col-1] = currentPlayer;
            currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
        }
    }

    public void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean hasWinner() {
        return checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin();
    }

    public char getWinner() {
        if (checkRowsForWin()) {
            return board[0][0];
        } else if (checkColumnsForWin()) {
            return board[0][0];
        } else if (checkDiagonalsForWin()) {
            return board[1][1];
        } else {
            return ' ';
        }
    }

    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalsForWin() {
    	if (board[1][1] == ' ') {
            return false;
        }
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }
        return false;
    }


    public void restartGame() {
        initializeBoard();
        currentPlayer = 'X';
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

 
    
}
public class Ex7_6 {
	
	public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        while (!game.hasWinner()) {
            System.out.println("Current player: " + game.getCurrentPlayer());
            System.out.print("Enter row 1~3: ");
            int row = scanner.nextInt();
            System.out.print("Enter column 1~3: ");
            int col = scanner.nextInt();
            game.addMove(row, col);
            game.displayBoard();
        }

        char winner = game.getWinner();
        if (winner == ' ') {
            System.out.println("It's a tie!");
        } else {
            System.out.println("Winner: " + winner);
        }

        System.out.println("Do you want to play again? (y/n)");
        String answer = scanner.next();
        if (answer.equals("y")) {
            game.restartGame();
        } else {
            System.out.println("Thanks for playing!");
        }
    }
	
}

