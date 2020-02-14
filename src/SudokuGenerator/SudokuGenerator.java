package SudokuGenerator;

import java.util.Random;


public class SudokuGenerator {
    private SudokuChecker sudokuChecker;
    private Random r = new Random();

    public SudokuGenerator(){
        sudokuChecker = new SudokuChecker();
    }


    public int[][] generateSudoku(){    //Generiert das Feld, indem es jeweils eine Box zufällig erstellt und dannach überprüft, ob das Feld richtig ist
        int[][] board = new int[9][9];                      //Generates a field full of 9s because 9s and later replaces the 9s with Sudoku numbers


        fillBoardRek(board, 0, 0);

       return board;
    }


    private boolean fillBoardRek(int[][] board, int x, int y){
        if(x >= 9){
            x = 0;
            y++;
        }else if(y >= 9){   //If is at end of field
            return true;
        }

        for(int i = 1 ; i < 10 ; i ++) {
            board[x][y] = i;
            if (sudokuChecker.hasDuplicatesInLines(board, x, y) == false) {
                fillBoardRek(board, x+1, y);
                break;
            }
        }
        return false;
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
