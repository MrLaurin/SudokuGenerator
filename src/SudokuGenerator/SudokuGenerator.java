package SudokuGenerator;

import java.util.Random;


public class SudokuGenerator {
    private SudokuChecker sudokuChecker;
    private Random r = new Random();

    public SudokuGenerator(){
        sudokuChecker = new SudokuChecker();
    }


    public boolean generateField(int[][] board) {
        for(int i = 0 ; i < 9 ; i ++){
            board[]
        }

        return false;
    }

    public void printField(int[][] board){
        String output;
        for(int i = 0 ; i < board.length ; i ++){
            output = "";
            for(int j = 0 ; j < board[i].length ; j ++){
                output += "  " + board[j][i];
            }
            System.out.println(output);
        }
    }
}
