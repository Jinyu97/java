// �ڵ��� ���� ����: 1��(70�� �̻� �հ�)? 2��(60�� �̻� �հ�)?

import java.util.Scanner;
class DriverLicense{
	public static void main(String [] arg){
		Scanner s = new Scanner(System.in);
		String type; 
		int score;
		System.out.print("�� ��? ex) 1 : ");
		type = s.next();
		
		if(!(type.equals("1��"))&&!(type.equals("2��"))) {
			System.out.println("1�� �Ǵ� 2���� �Է��ϼ���.");
			return;
		}
		
		System.out.print("�� ��? ex) 75 : ");
		score = s.nextInt();
		
		/* if�� �̿�
		if((type.equals("1��")&&(score>=70))||(type.equals("2��")&&(score>=60))) System.out.println("�հ�");
		else System.out.println("���հ�");
		*/
		
		// switch�� �̿�
		switch(type){
			case "1��" : if (score>=70) System.out.println("�հ�");
						 else System.out.println("���հ�");
						 break;
			case "2��" : if (score>=60) System.out.println("�հ�");
						 else System.out.println("���հ�");
						 break;
			default : System.out.println("1�� �Ǵ� 2���� �Է��ϼ���.");
		}
		
		
	}
}