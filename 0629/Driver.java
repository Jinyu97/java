// �ڵ��� ���� ����: 1��(70�� �̻� �հ�)? 2��(60�� �̻� �հ�)?

import java.util.Scanner;
class Driver{
	public static void main(String [] arg){
		Scanner s = new Scanner(System.in);
		int type; 
		int score;
		System.out.print("�� ��? ex) 1 : ");
		type = s.nextInt();
		
		if((type!=1)&&(type!=2)) {
			System.out.println("������ 1 �Ǵ� 2�� �Է��ϼ���."); 
			return;
		}
		
		System.out.print("�� ��? ex) 75 : ");
		score = s.nextInt();
		
		String hap = ((type==1)&&(score>=70))||((type==2)&&(score>=60))? "�հ�":"���հ�";
		System.out.println(hap);
		
		/*
		if (type==1){
			if (score>=70) System.out.println("�հ�!");
			else System.out.println("���հ�!");
		}
		else if (type==2){
			if(score>=60) System.out.println("�հ�!");
			else System.out.println("���հ�!");
		}
		else System.out.println("�ٽ� �Է��ϼ���.");
		*/
	}
}