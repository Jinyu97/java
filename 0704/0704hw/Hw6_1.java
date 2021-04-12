import java.util.Scanner;
class Hw6_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("문장: ");
		String sentence = s.nextLine();
		System.out.print("검색할 단어: ");
		String word = s.next();
		
		int senlen = sentence.length();
		int worlen = word.length();
		
		int order=1, cnt=0;
		
		for(int i=0; i<senlen-worlen+1; i++){
			if(sentence.charAt(i)==' ' && sentence.charAt(i+1)!=' '){
				order++;
			}
			if(word.equalsIgnoreCase(sentence.substring(i, i+worlen))){
				cnt++;
				System.out.printf("%d번째, ", order);
			}
		}
		if(cnt!=0) System.out.printf("\b\b 어절에서 \"%s\"가(이) 검색되어, ", word);
		System.out.printf("총 %d회 검색되었습니다.\n", cnt);

	
	}
}