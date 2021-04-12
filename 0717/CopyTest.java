// ���� ���� ���α׷�
// FileTest.java�� �����ϴ� ���α׷� �ۼ��ϱ�
// ���纻 ���ϸ��� copy.java
// FileTest.java: println()---> HELLO�� �ٲ㼭 copy.java�� ����

import java.io.*;
import java.util.Scanner;

class CopyTest{
	public static void main(String [] args){
		File copy = new File("copy.java");
		File original = new File("FileTest.java");
		
		if(!(original.exists())){
			System.out.println("���� ������ �������� �ʾ� ���� ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		if(copy.exists()){
			System.out.println("���纻 ������ �̹� �����Ͽ� ���� ���α׷��� �����մϴ�.");
			System.exit(1);
		}
		
		//System.out.println("ABc ABCD ABCDE".replaceAll("ABC", "Z"));
		
		try{
			Scanner s = new Scanner(original);
			PrintWriter pw = new PrintWriter(copy);
		
			//replaceAll("���ܾ�", "�Ŵܾ�")
			while(s.hasNext()){
				pw.println((s.nextLine()).replaceAll("println","HELLO"));
			}
			
			s.close();
			pw.close();
			
			System.out.println("���� ���� �Ϸ�! ������ Ȯ���ϼ���.");
			

		}catch(Exception e){ //Exception: ��� ������ �θ�Ŭ����
			e.printStackTrace(); //���ܰ� �߻��� ����� stack�� �����ؼ� ����ش޶�� ��û�ϱ�
			
		}
		
	}
	
}