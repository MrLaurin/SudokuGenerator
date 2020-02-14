package SudokuGenerator;

import static java.lang.Math.ceil;

public class SudokuChecker {


    public boolean hasDuplicatesInLines(int[][] board, int x, int y) {
        //Checkt alle Zahlen entlang der x-Achse
        boolean[] checklist = new boolean[board.length+1];    //Eine Array die immer an der Position einer bestimmten Zahl auf true gesetzt wird
        for(int i = 0 ; i < board.length ; i ++){
            if(board[i][y] == 0){   //Ignores zeros on the board

            }else if(checklist[board[i][y]] == true){
                return true;
            }else{
                checklist[board[i][y]] = true;
            }
        }
        //Checkt alle Zahlen entlang der y-Achse
        checklist = new boolean[board[x].length+1];
        for(int i = 0 ; i < board[x].length ; i ++){
            if(board[x][i] == 0){   //Ignores zeros on the board

            }else if(checklist[board[x][i]] == true){
                return true;
            }else{
                checklist[board[x][i]] = true;
            }
        }
        return false;
    }

    public boolean checkBox(int[][] board, int x, int y) {  //Unnötigste Methode wo gibt
        int[] box = getBox(x, y);
        x = box[0];
        y = box[1];
        boolean[] checklist = new boolean[board.length];    //Eine Array die immer an der Position einer bestimmten Zahl auf true gesetzt wird
        for(int i = y ; i < y+3 ; i ++){
            for(int j = x ; j < x+3 ; j ++){
                if(board[i][j] > 8){ //Alle Zahlen über 8 werden ignoriert, da dies das generieren eines Feldes erleichtert

                }else if(checklist[board[i][j]] == true){
                    return false;
                }else{
                    checklist[board[i][j]] = true;
                }
            }
        }
        return true;
    }

    private int[] getBox(int x, int y){ // Gibt die Koordinaten zurück an denen die Box anfängt
        int[] coords = new int[2];
        coords[0] = (x/3)*3;
        coords[1] = (y/3)*3;
        return coords;
    }

    public boolean isBoardFull(int[][] board){
        for(int y = 0 ; y < 9 ; y ++){
            for(int x = 0 ; x < 9 ; x ++){
                if(board[x][y] < 0 && board[x][y] > 8){
                    return false;
                }
            }
        }
        return true;
    }

}
