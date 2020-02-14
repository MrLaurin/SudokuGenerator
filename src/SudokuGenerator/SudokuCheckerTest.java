package SudokuGenerator;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class SudokuCheckerTest {

    @Test
    public void checkLines_test01(){

        SudokuChecker sudokuChecker = new SudokuChecker();
        int[][] board = new int[3][3];
        board[0][0] = 1;
        board[1][0] = 2;
        board[2][0] = 2;
        assertEquals(false,
                sudokuChecker.hasDuplicatesInLines(board,0,0));
    }

    @Test
    public void checkLines_test02(){
        SudokuChecker sudokuChecker = new SudokuChecker();
        int[][] board = new int[3][3];
        board[0][0] = 1;
        board[1][0] = 2;       //   123
        board[2][0] = 3;       //   001
        board[2][1] = 1;       //   002
        board[2][2] = 2;

        assertEquals(false,sudokuChecker.hasDuplicatesInLines(board,2,0));
    }

    @Test
    public void checkLines_test03(){
        SudokuChecker sudokuChecker = new SudokuChecker();
        int[][] board = new int[9][9];
        board[0][0] = 5;       //   012345678
        board[1][0] = 3;       //   534678912
        board[2][0] = 4;       //   672195348
        board[3][0] = 6;       //   198342567
        board[4][0] = 7;       //   859761423
        board[5][0] = 8;       //   426853791
        board[6][0] = 9;       //   713924856
        board[7][0] = 1;       //   961537284
        board[8][0] = 2;       //   287419635
        board[0][1] = 6;       //   345286179
        board[1][1] = 7;
        board[2][1] = 2;
        board[3][1] = 1;
        board[4][1] = 9;
        board[5][1] = 5;
        board[6][1] = 3;
        board[7][1] = 4;
        board[8][1] = 8;
        board[0][2] = 1;
        board[1][2] = 9;
        board[2][2] = 8;
        board[3][2] = 3;
        board[4][2] = 4;
        board[5][2] = 2;
        board[6][2] = 5;
        board[7][2] = 6;
        board[8][2] = 7;
        board[0][3] = 8;
        board[1][3] = 5;
        board[2][3] = 9;
        board[3][3] = 7;
        board[4][3] = 6;
        board[5][3] = 1;
        board[6][3] = 4;
        board[7][3] = 2;
        board[8][3] = 3;
        board[0][4] = 4;
        board[1][4] = 2;
        board[2][4] = 6;
        board[3][4] = 8;
        board[4][4] = 5;
        board[5][4] = 3;
        board[6][4] = 7;
        board[7][4] = 9;
        board[8][4] = 1;
        board[0][5] = 7;
        board[1][5] = 1;
        board[2][5] = 3;
        board[3][5] = 9;
        board[4][5] = 2;
        board[5][5] = 4;
        board[6][5] = 8;
        board[7][5] = 5;
        board[8][5] = 6;
        board[0][6] = 9;
        board[1][6] = 6;
        board[2][6] = 1;
        board[3][6] = 5;
        board[4][6] = 3;
        board[5][6] = 7;
        board[6][6] = 2;
        board[7][6] = 8;
        board[8][6] = 4;
        board[0][7] = 2;
        board[1][7] = 8;
        board[2][7] = 7;
        board[3][7] = 4;
        board[4][7] = 1;
        board[5][7] = 9;
        board[6][7] = 6;
        board[7][7] = 3;
        board[8][7] = 5;
        board[0][8] = 3;
        board[1][8] = 4;
        board[2][8] = 5;
        board[3][8] = 2;
        board[4][8] = 8;
        board[5][8] = 6;
        board[6][8] = 1;
        board[7][8] = 7;
        board[8][8] = 9;
        assertEquals(true,sudokuChecker.hasDuplicatesInLines(board,0,0));
    }


}