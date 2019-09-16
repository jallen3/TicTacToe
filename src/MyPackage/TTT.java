package MyPackage;

public class TTT {

    private char[][] board; //3 x 3 board layout
    private char currentPlayerMark; //holds 'x' or 'o'

    public TTT(){}

    //set/reset the board back to all empty values
    public void initializeBoard(){
        //Loop through rows
        for(int i = 0; i < 3; i++){
            //Loop through columns
            for(int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }
    }

    public void printBoard(){

        System.out.println("-------------");

        for(int i = 0; i < 3; i++){
            System.out.println("| ");
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " | ");
            }

            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean isBoardFull(){}

    public boolean checkForWin(){}

    private boolean checkRowsforWin(){}

    private boolean checkColumnsForWin(){}

    private boolean checkDiagnolsForWin(){}

    private boolean checkRowCol(char c1, char c2, char c3){}



}
