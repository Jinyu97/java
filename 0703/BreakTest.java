// ���� �Է¹޾� ���� ������ ��� ���ϱ�
// 5�� ����� ��� ��꿡�� ����
// ���� �Է¹����� ����

import java.util.Scanner;
class BreakTest{
	public static void main(String [] args){
		int userInput;
		int sum=0, cnt=0;
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("���� �Է��ϼ��� : ");
			userInput = s.nextInt();
			if(userInput<0) break;
			if(userInput%5==0) continue;
			sum += userInput;
			cnt++;
		}
		
		if(cnt==0) System.out.println("����� ����� �� �����ϴ�.");
		else System.out.printf("�Է��Ͻ� ������ ����� %.1f�Դϴ�.\n", (double)sum/cnt);
		
	}
}