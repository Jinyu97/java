import java.util.Scanner;

class HW6_3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String word1, word2;
		String lowerWord1, lowerWord2;
		
		System.out.print("단어1: ");
		word1 = s.nextLine();
		System.out.print("단어2: ");
		word2 = s.nextLine();
		
		lowerWord1 = word1.toLowerCase();
		lowerWord2 = word2.toLowerCase();
		
		if(lowerWord1.compareTo(lowerWord2)<0){
			System.out.println(word1+", "+word2);
		}
		else{
			System.out.println(word2+", "+word1);
		}
	}
}