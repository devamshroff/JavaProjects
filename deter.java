import java.util.Scanner;
public class deter{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("number of rows and columns");
	int n = input.nextInt();
	//int p = 1;
	double[][] x = new double[n][n];
	System.out.println("enter matrix");
	double k = 1.5;
	for(int i = 0; i<n; i++){
		 for(int j = 0; j<n; j++){
			System.out.println(i + "th row " + j + "th column");
			x[i][j] = Math.pow(k+((double).5*(i)),j);
			//x[i][j] = input.nextDouble();
			
			//((int)(Math.random()*10)+1);
			//p++;
		}
	}
	printout(x);
	System.out.println(determinant(x));
}
public static double determinant(double x[][]){
		double det = 0;
		if(x.length == 1){
			det = x[0][0];
			return det;
		}
		else if(x.length == 2){
			det = (x[0][0]*x[1][1])-(x[0][1]*x[1][0]);
			
			return det;
		}
		else{
			for(int col=0; col<x.length; col++){
			det += (Math.pow(-1,col)*(x[0][col])*determinant(submatrix(x, 0, col)));
			}
		return det;
		}
	}
public static double[][] submatrix(double x[][], int row, int col){
	int i = 0;
	int r = 0;
	int c = 0;
		double[][] sub = new double[x.length-1][x.length-1];
		while(i<x.length){
			if(i == col){
				i++;
			}else{
				for(int j = 1; j<x.length; j++){
					sub[r][c] = x[j][i];
					r++;
				}
				c++;
				i++;
				r=0;
			}
		}
	//	printout(sub);
		return sub;
		
	}
	public static void printout(double[][] x){
		for(int i =0; i<x.length; i++){
			for(int j = 0; j<x.length; j++){
				System.out.print(x[i][j]);
				System.out.print(" ");
			}
			System.out.println();
			System.out.println();
			}
	System.out.println();	
	}
}
		