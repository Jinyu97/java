import java.util.Scanner;

class HW6_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String sentence, word;
		int cnt=0, order=1, lenOfWord, lenOfSentence;
		
		System.out.print("����: ");
		sentence = s.nextLine();
		System.out.print("�˻��� �ܾ�: ");
		word = s.nextLine();
		
		lenOfWord = word.length();
		lenOfSentence = sentence.length();
		
		for(int i=0; i<lenOfSentence-lenOfWord+1; i++){
			if(sentence.charAt(i)==' '&&sentence.charAt(i+1)!=' '){
				order++;
			}
			if(word.equalsIgnoreCase(sentence.substring(i, i+lenOfWord))){
				cnt++;
				System.out.printf("%d��°, ", order);
			}
		}
		if(cnt!=0) System.out.printf("\b\b �������� \"%s\"��(��) �˻��Ǿ�, ", word);
		System.out.printf("�� %dȸ �˻��Ǿ����ϴ�. \n", cnt);
	}
}