// ��ȿ�� ���̰� �Էµ� ������ �ݺ��ؼ� ���� �Է¹ޱ�
// ��ȿ�� ���� : 0�� �̻� 200�� ����
// ��, 0 �̸� 200 �ʰ��� ���̰� �ԷµǸ� ���� �Է� �ݺ��ϱ�

import java.util.Scanner;
class WhileTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int age;
		
		/*
		System.out.print("���� : ");
		age = s.nextInt();
		while((age<0)||(age>200)){
			System.out.println("[�Է� ����] ���̴� 0�� �̻� 200�� ���Ϸ�");
			System.out.print("���� : ");
			age = s.nextInt();
			
		}
		System.out.printf("�Է��� ���̴� %d���Դϴ�.",age);
	*/
		
	/*
		do{
			System.out.print("���� : ");
			age = s.nextInt();
			if((age<0)||(age>200)) System.out.println("[�Է� ����] ���̴� 0�� �̻� 200�� ���Ϸ�");
		}while((age<0)||(age>200));
		System.out.printf("�Է��� ���̴� %d���Դϴ�.",age);
		
		*/
		
		/*
		while(true){
			System.out.print("���� : ");
			age = s.nextInt();
			if((age>=0)&&(age<=200)) break;
			System.out.println("[�Է� ����] ���̴� 0�� �̻� 200�� ���Ϸ�");
		}
		
		System.out.printf("�Է��� ���̴� %d���Դϴ�.",age);
		
		*/
		
		System.out.print("���� : ");
		age = s.nextInt();
		for( ; age<0||age>200; ){
			System.out.println("[�Է� ����] ���̴� 0�� �̻� 200�� ���Ϸ�");
			System.out.print("���� : ");
			age = s.nextInt();
		}
		System.out.printf("�Է��� ���̴� %d���Դϴ�.",age);
		
		
		/*
		1. while(�ݺ�����){
			�ݺ��� ����
			}
			
		2. do{
			�ݺ��� ����
			}while(�ݺ�����);
			
		3. ���ѹݺ�(���ѷ���) ���
			while(true){
				�ݺ�����
				if() break;
			}
			
		4. for(;�ݺ�����;){
			�ݺ�����
			}
			
			*/
		
		
		
	}
}