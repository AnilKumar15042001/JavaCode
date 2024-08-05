package array_ArrayList;

import java.util.Scanner;

public class TicTacToe {

	
	char[][] board;
	Scanner s=new Scanner(System.in);
	char currentPlayer='X';
	
	public TicTacToe()
	{
		board=new char[3][3];
		initializeBoard();
		printBoard();
	}
	
	public void initializeBoard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]='-';
			}
		}
	}
	
	public void printBoard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	boolean makeMove(int row, int col)
	{
		if(row>=0 && row<3 && col>=0 && col<3 && board[row][col]=='-')
		{
			board[row][col]=currentPlayer;
			return true;
		}
		return false;
	}
	
	void validMove(int row, int col)
	{
		if(row>=0 && row<3 && col>=0 && col<3)
		{
			
		}
	}
	
	boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
	
	void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
	public static void main(String[] args) {
		
		TicTacToe obj=new TicTacToe();
	}
	
}
