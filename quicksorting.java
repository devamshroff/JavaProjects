import java.util.*;
import java.io.*;
import java.util.Scanner;
public class quicksorting{
public static void main(String[] args){
	int win = 0;
	int n = 1000000;
	double[] x = new double[5];
	for(int j = 0; j<n; j++){
	for(int i =0; i<5;i++){
	x[i] = Math.random();
	}
	//printout(x);
	quicksort(x, 0, x.length-1);
	//printout(x);
double med = x[2];
if(med>.2 && med<.3){
	win++;
}

}
double prob = (double)win/n;
System.out.println(prob);
}
	/*double[] arr=new double[6];
	try{
			Scanner input = new Scanner(new File("testsort.txt"));
			
			for(int i=0;i<arr.length;i++){
		    	double x = input.nextDouble();
		    	arr[i]=x;
		    	System.out.println("number="+arr[i]);
			}
			input.close();
		}
		catch(Exception e){
			System.out.println("Error");
			System.exit(0);
		}
	//Scanner input = new Scanner( System.in );
	//System.out.println(" How many numbers");
	//int n = input.nextInt();
	//double[] arr = new double[n];
	//for(int i =0; i<n; i++){
		//arr[i] = (Math.random()*100);
//	}
	//printout(arr);
	long start = System.nanoTime();
	quicksort(arr, 0, arr.length-1);
	long end = System.nanoTime();
	System.out.println((end-start)*Math.pow(10,-9) + " Seconds");
	printout(arr);
	}*/
	
	public static double[] quicksort(double[] arr, int a, int b){
		
	//int temp;
	int pivot = b;
	int i=a-1;
	//System.out.println("i = " + i + "j = " + j + "pivot = " + pivot);
	if(b<=a){
			//printout(arr);
		return arr;
	//System.out.println();
	//return arr;
	//break;
	}
	else{
	for(int j=a; j<b;j++){
		if(arr[j]<arr[pivot]){
			i++;
			switcher(arr, j,i);
		}
	}
	switcher(arr,i+1, pivot);
	quicksort(arr, a, i);
	quicksort(arr, i+2, b);
	//return arr;
	return arr;
}
}
public static void switcher(double[] arr, int i, int j){
	double temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
public static void printout(double arr[]){
	for(int i = 0; i<arr.length; i++){
		System.out.print(arr[i]);
		System.out.println();
	}
	System.out.println();

}
}
/*public static double median(double arr[]){
	int i = 0;
	int j = arr.length-1;
	while(i!=j){
		i++;
		j--;
	}
}
}
*/