import java.util.Scanner;
public class craps{
	public static void main(String[] args){
		Scanner input = new Scanner ( System.in );
		int games = input.nextInt();
		double win = 0;
		int die1;
		int die2;
		int sum;
		int i = 0;
		int die11;
		int die22;
		while(games>0){
			die1 = ((int) (Math.random()*6) + 1);
			die2 = ((int) (Math.random()*6) + 1);
			sum = die1 + die2;
			if(sum == 7 || sum == 11){
			win++;
			games--;
			}
			else if((sum == 2) || (sum == 3) || (sum == 12)){
				games--;
			}else{
				int sum2 = 0;
				while( i < 1){
					die11 = ((int) Math.random()*6 + 1);
					die22 = ((int) Math.random()*6 + 1);
					sum2 = die11 + die22;
					if(sum2 == sum){
						win++;
						games--;
						i++;
					}
					else if(sum2 == 7){
					games--;
					i++;
				}	
			}
		}			
			double probability = ((double)win)/((double)games);
				System.out.println(probability);
	}
}
}