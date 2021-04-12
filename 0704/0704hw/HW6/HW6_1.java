import java.util.Scanner;

class HW6_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String sentence, word;
		int cnt=0, order=1, lenOfWord, lenOfSentence;
		
		System.out.print("문장: ");
		sentence = s.nextLine();
		System.out.print("검색할 단어: ");
		word = s.nextLine();
		
		lenOfWord = word.length();
		lenOfSentence = sentence.length();
		
		for(int i=0; i<lenOfSentence-lenOfWord+1; i++){
			if(sentence.charAt(i)==' '&&sentence.charAt(i+1)!=' '){
				order++;
			}
			if(word.equalsIgnoreCase(sentence.substring(i, i+lenOfWord))){
				cnt++;
				System.out.printf("%d번째, ", order);
			}
		}
		if(cnt!=0) System.out.printf("\b\b 어절에서 \"%s\"가(이) 검색되어, ", word);
		System.out.printf("총 %d회 검색되었습니다. \n", cnt);
	}
}