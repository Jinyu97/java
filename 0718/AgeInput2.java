// Runtime ���ܴ� try-catch�� �ƴϴ��� �ڵ忡�� ������ ���ܰ� �߻��ϴ� ��츦 ó���� �� ����

import java.util.Scanner;
import java.util.InputMismatchException; 
class AgeInput2{
	public static void main(String [] args){
		int age, itg;
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("���̸� ���ڷ� �Է����ּ���: ");
		age = s.nextInt();
		System.out.format("����� ���̴� %d���Դϴ�.\n", age);
		
		System.out.print("����: ");
		itg = s.nextInt();
		
		if(itg==0) System.out.println("0���δ� ���� �� �����ϴ�.");
		else System.out.format("����/���� = %d\n", age/itg);
		
		
	}
}
