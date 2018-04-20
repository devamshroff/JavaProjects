public class sudoku{
	public static int[][] sudokusolver(int board[][], int boardupli[][], int row, int col, int number){
		if((row==9)&&(col==0)){
			return board;
		}
		if(col==9){
			row++;
			col=0;
			return sudokusolver(board,boardupli,row,col,number);
		}
		if(boardupli[row][col]!=0){
			if(col==8){
				row++;
				col=0;
			}
			else{
				col++;
			}
			return sudokusolver(board,boardupli,row,col,number);
		}
		if(number==10){
			board[row][col]=0;
			col--;
			if(col==-1){
				row--;
				col=8;
			}
			while(boardupli[row][col]!=0){
				if(col==0||col==1){
					if(col==0){
						if(boardupli[row-1][8]!=0){
							row--;
							col=7;
						}
						else{
							row--;
							col=8;
						}
					}
					if(col==1){
						if(boardupli[row][0]!=0){
							row--;
							col=8;
						}
						else{
							col=0;
						}
					}
				}
				else{
					col--;
				}
			}
			number=board[row][col];
			number++;
			return sudokusolver(board,boardupli,row,col,number);
		}
		else{
			if(islegal(row,col,number,board)){
				board[row][col]=number;
				col++;
				number=1;
			}
			else{
				number++;
			}
			return sudokusolver(board,boardupli,row,col,number);
		}
	}
	public static boolean islegal(int row, int col, int num, int board[][]){
		for(int i=0;i<board.length;i++){//rows
			if(board[i][col]==num){
				return false;
			}
		}
		for(int j=0;j<board.length;j++){//col
			if(board[row][j]==num){
				return false;
			}
		}
		int rowstart=(row/3)*3;
		int rowend=rowstart+2;
		int colstart=(col/3)*3;
		int colend=colstart+2;
		for(int k=rowstart;k<=rowend;k++){// box
			for(int l=colstart;l<=colend;l++){
				if(board[k][l]==num){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args){
		int[][] original = {
			{0,0,2, 0,0,0, 0,8,0},
			{0,9,1, 0,2,0, 0,0,7},
			{8,0,0, 0,4,0, 0,2,9},

			{2,0,0, 0,0,0, 0,4,6},
			{9,0,0, 8,5,3, 0,0,1},
			{1,8,0, 0,0,0, 0,0,5},

			{4,7,0, 0,3,0, 0,0,2},
			{6,0,0, 0,9,0, 7,5,0},
			{0,1,0, 0,0,0, 6,0,0}
		};
		//int[][] empty=new int[9][9];
		int[][] origdup=new int[9][9];
		for(int i=0;i<original.length;i++){
			for(int j=0;j<original.length;j++){
				origdup[i][j]=original[i][j];
				System.out.print("\t"+origdup[i][j]);
			}
			System.out.println();
		}
		int[][] output=new int[9][9];
		output=sudokusolver(original,origdup,0,0,1);
		System.out.println("result:");
		for(int i=0;i<original.length;i++){
			for(int j=0;j<original.length;j++){
				System.out.print("\t"+output[i][j]);
			}
			System.out.println();
		}
	}
}