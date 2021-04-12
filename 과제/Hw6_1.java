import java.util.Scanner;
class Hw6_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String sentence;
		String word;
		System.out.print("문장: ");
		sentence = s.nextLine();
		System.out.print("검색할 단어: ");
		word = s.next();
		
		int order=1;
		int count=0;
		
		for(int i=0; i<sentence.length()-word.length(); i++){
			if(sentence.charAt(i)==' '&&sentence.charAt(i+1)!=' '){
				order++;
			}
			if(word.equalsIgnoreCase(sentence.substring(i, i+word.length()))){
				count++;
				System.out.printf("%d번째, ", order);
			}
		}
		if(count!=0){
			System.out.printf("\b\b 어절에서 %s가 검색되어, ", word);
		}
		System.out.printf("총 %d회 검색되었습니다.\n", count);
	}
}