// ���� a, b �Է¹޾� a/b ��� ����ϴ� �Լ� �����
// try-catch�� ���ܸ� ���� ó����

import java.util.Scanner;
class ArithmeticExceptionTest{
	public static void main(String [] args){
		divide();
		System.out.println("�� ���� ����ɱ�??");
		
	}
	
	static void divide(){
		int a, b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("a: ");
		a = s.nextInt();
		System.out.print("b: ");
		b = s.nextInt();
		
		try{ //���� ���� ó��
			System.out.println("a/b: "+(a/b));
		}catch(ArithmeticException ae){
			System.err.println("0���� ���� �� �����ϴ�.");
		}
		
		System.out.println("�� ���� ����ɱ�?"); //���� ��Ƽ� ó�������Ƿ� �޼ҵ� ������ ����Ǳ� ������ �� ���嵵 �����
		//���� ó�� �� ���������Ḧ ���� �� �ִ�.
	}
	
}