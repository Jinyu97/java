import java.util.Scanner;
class Hw6_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String sentence;
		String word;
		System.out.print("����: ");
		sentence = s.nextLine();
		System.out.print("�˻��� �ܾ�: ");
		word = s.next();
		
		int order=1;
		int count=0;
		
		for(int i=0; i<sentence.length()-word.length(); i++){
			if(sentence.charAt(i)==' '&&sentence.charAt(i+1)!=' '){
				order++;
			}
			if(word.equalsIgnoreCase(sentence.substring(i, i+word.length()))){
				count++;
				System.out.printf("%d��°, ", order);
			}
		}
		if(count!=0){
			System.out.printf("\b\b �������� %s�� �˻��Ǿ�, ", word);
		}
		System.out.printf("�� %dȸ �˻��Ǿ����ϴ�.\n", count);
	}
}