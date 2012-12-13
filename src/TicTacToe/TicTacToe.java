package TicTacToe;

public class TicTacToe {
	protected static final int X = 1, O = -1, EMPTY = 0;
	protected int[][] board = new int[3][3];
	protected int player;
	
	//Build constructor to clear board before simulate Tic-Tac-Toe
	public TicTacToe() {
		player = X;
		clearBoard();
	}
	public void clearBoard() {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				board[i][j] = EMPTY;
			}
		}
	}
	
	//Simulate putMark action
	public void putMark(int m, int n) throws IllegalArgumentException{
		if (m < 0 || m > 3 || n < 0 ||  n> 3) {
			throw new IllegalArgumentException("Invaild board position!");
		}
		if (board[m][n] != EMPTY) {
			throw new IllegalArgumentException("Board position occupied!");
		}
		board[m][n] = player;
		player = -player;
	}
	
	public boolean isWin(int mark) {
		return board[0][0]+board[0][1]+board[0][2]==mark*3 //row1
			|| board[1][0]+board[1][1]+board[1][2]==mark*3 //row2
			|| board[2][0]+board[2][1]+board[2][2]==mark*3 //row3
			|| board[0][0]+board[1][0]+board[2][0]==mark*3 //column1
			|| board[0][1]+board[1][1]+board[2][1]==mark*3 //column2
			|| board[0][2]+board[1][2]+board[2][2]==mark*3 //column3
			|| board[0][0]+board[1][1]+board[2][2]==mark*3 //diagnal1
			|| board[0][2]+board[1][1]+board[2][0]==mark*3; //diagnal2
	}
	
	public int Winner () {
		if(isWin(X)) {
			return X;
		} else if (isWin(O)) {
			return O;
		} else {
			return EMPTY;
		}
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				switch(board[i][j]) {
				case X:
					s += "X";
					break;
				case O:
					s += "O";
					break;
				case EMPTY:
					s += " ";
					break;
				}
				if (j < 2)
					s += " | ";
			}
			if (i < 2)
				s += "\n---------\n";
		}
		return s;
	}
	
	//Start to simulate the game
	public static void main(String args[]) {
		TicTacToe game = new TicTacToe();
		/*game.putMark(0, 0);		//X moves
		game.putMark(1, 0);		//O
		game.putMark(1, 1);		//X
		game.putMark(2, 1);		//O
		game.putMark(2, 2);		//X
		*/
		game.putMark(1,1); 		game.putMark(0,2); 
		game.putMark(2,2); 		game.putMark(0,0); 
		game.putMark(0,1); 		game.putMark(2,1); 
		game.putMark(1,2); 		game.putMark(1,0); 
		game.putMark(2,0);
		System.out.println(game.toString());
		if (game.Winner() == X) {
			System.out.println("X wins!");
		} else if (game.Winner() == O) {
			System.out.println("O wins!");
		} else {
			System.out.println("Tie.");
		}
	}
	
}
