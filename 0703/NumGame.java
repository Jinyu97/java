import java.util.Scanner;
class NumGame{
	public static void main(String [] args){
		int jungdap = 79;
		Scanner s = new Scanner(System.in);
		int userInput, cnt=1;
		
		do{
			System.out.print("0~100������ ������ �Է��Ͽ� ���� ����������. : ");
			userInput = s.nextInt();
			if(userInput != jungdap){
				cnt++;
				if(jungdap>userInput) System.out.println("������ �� �� ū ���Դϴ�.");
				else System.out.println("������ �� �� ���� ���Դϴ�.");
				}
			
		}while(userInput != jungdap);
		
		System.out.printf("�����մϴ�. %d�� �����Դϴ�. %d������ �����̽��ϴ�.\n", userInput, cnt);
		
		
	}
}