package MyPackage;

public class TTT
{

    private char[][] board; //3 x 3 board layout
    private char currentPlayerMark; //holds 'x' or 'o'

    public TTT(){}

    //set/reset the board back to all empty values
    public void initializeBoard()
    {
        //Loop through rows
        for(int i = 0; i < 3; i++)
        {
            //Loop through columns
            for(int j = 0; j < 3; j++)
            {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard()
    {

        System.out.println("-------------");

        for(int i = 0; i < 3; i++)
        {
            System.out.println("| ");
            for(int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j] + " | ");
            }

            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean isBoardFull(){}

    public boolean checkForWin()
    {
        return checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin() ;
    }

    private boolean checkRowsForWin()
    {
        for(int i = 0; i < 3; i++)
        {
            if(checkRowsForWin((board[i][0], board[i][2], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumnsForWin()
    {
        for(int i = 0; i < 3; i++)
        {
            if(checkColumnsForWin((board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalsForWin()
    {
        return(checkRowCol(board[0][0], board[1][1], board[2][2]) == true || checkRowCol(board[0][2], board[1][1], board[2][0]) == true);
    }

    private boolean checkRowCol(char c1, char c2, char c3)
    {
        return(c1 != '-' && c1 == c2 && c2 == c3);
    }



}
