package SudokuGenerator;

import java.util.Random;


public class SudokuGenerator {
    private SudokuChecker sudokuChecker;
    private Random r = new Random();

    public SudokuGenerator(){
        sudokuChecker = new SudokuChecker();
    }


    public int[][] generateField(){    //Generiert das Feld, indem es jeweils eine Box zufällig erstellt und dannach überprüft, ob das Feld richtig ist
        int[][] board = new int[9][9];                      //Generates a field full of 9s because 9s and later replaces the 9s with Sudoku numbers
        for(int i = 0 ; i < board.length ; i ++){
            for(int j = 0 ; j < board[i].length ; j ++){
                board[j][i] = 9;
            }
        }



       return board;
    }

    private int[][] addOneToAll(int[][] board){     //Adds one to every single number on the board
        for(int y = 0 ; y < board[0].length ; y ++){
            for(int x = 0 ; x < board.length ; x ++){
                board[x][y]++;
            }
        }
        return board;
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
