package com.company;
import SudokuGenerator.SudokuChecker;
import SudokuGenerator.SudokuGenerator;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        SudokuGenerator sGen = new SudokuGenerator();
        SudokuChecker sCheck = new SudokuChecker();
        int[][] board = sGen.generateSudoku();



        sGen.printField(board);
    }
}