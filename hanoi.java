public class hanoi{
	
public static void main(String[] args){
	String start = "a";
	String mid = "b";
	String end = "c";
	towers(4, start, mid, end);
}

public static void towers(double n, String start, String mid, String end){
		if(n == 0){
			System.out.println("no steps");
		}
		if(n == 1){
			System.out.println("move from " + start + " to " + end); 
		}
		else{
		 towers(n-1, start, end, mid);
		 towers(1, start, mid, end);
		 towers(n-1, mid, start, end);
		}
	}
}