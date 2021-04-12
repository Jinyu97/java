import java.util.Scanner;
class Hw6_3{
	public static void main(String [] args){
		String word1, word2;
		Scanner s = new Scanner(System.in);
		System.out.print("단어1: ");
		word1 = s.next();
		System.out.print("단어2: ");
		word2 = s.next();
		
		String word_1 = word1.toUpperCase();
		String word_2 = word2.toUpperCase();
		
		if(word_1.compareTo(word_2)>0) System.out.printf("%s, %s\n", word2, word1);
		else System.out.printf("%s, %s\n", word1, word2);
		
	}
}