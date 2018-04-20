import java.util.Scanner;
public class bioinfo{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String dna = input.next();
	//NEED TO USE A DIFFERENT METHOD TO READ STRINGS
	String  = toRNA(dna,0);
System.out.println("the rna sequence is: " + rna);
}
public static String toRNA(String dna, int index){
System.out.println(index);
System.out.println("DNA LENGTH" + dna.length());
//String rna;
if(index == dna.length()){
	System.out.println("base case");
	return "";
}
if(dna.charAt(index)==('T')){
	index++;
	return 'A' + toRNA(dna, index);
}
else if(dna.charAt(index)==('C')){
	index++;
	return 'G' +toRNA(dna, index);
}
else if(dna.charAt(index)==('A')){
	index++;
	return 'U' + toRNA(dna, index);
}
else if(dna.charAt(index) == 'G'){
	index++;
	return 'C' + toRNA(dna, index);
}
else if(dna.charAt(index)==(' ')){
	index++;
	System.out.println("blank");
	return ' ' + toRNA(dna, index);
}
else{
	System.out.println("not a valid character");
	return "";
}
/*for(int i = 0; i < rna.length() ; i++){
	if(rna.charAt(i).equals("T")){
		rna.charAt(i) = "A";
	}
}
*/
}
}