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
                if(fillBoardRek(board, x+1, y) == true){
                    break;
                }
            }
        }
        return false;
    }

    public void printField(int[][] board){
        String output;
        for(int y = 0 ; y < board.length ; y ++){
            output = "";
            for(int x = 0; x < board[y].length ; x ++){
                if(x % 3 == 0 && x <= 9){
                    output += "|";
                }
                output += " " + board[x][y] + " ";
                if(x == 8){
                    output += "|";
                }

            }
            if(y % 3 == 0 && y <= 9) {
                System.out.println("+---------+---------+---------+");
            }
            System.out.println(output);

        }
        System.out.println("+---------+---------+---------+");
    }

}
