import java.util.Scanner;
class Hw6_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("����: ");
		String sentence = s.nextLine();
		System.out.print("�˻��� �ܾ�: ");
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
				System.out.printf("%d��°, ", order);
			}
		}
		if(cnt!=0) System.out.printf("\b\b �������� \"%s\"��(��) �˻��Ǿ�, ", word);
		System.out.printf("�� %dȸ �˻��Ǿ����ϴ�.\n", cnt);

	
	}
}