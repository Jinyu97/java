// ������ �������̴�. x�� �Ĵ� ���� ����(����)���� ����Ͻÿ�.
// ��, x(����)�� ����ڷκ��� �Է¹޴´�.

import java.util.Scanner;
class DateTestV2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("��ĥ ��? ");
		
		int x = s.nextInt();
		int intDay = (x+2)%7;
		String day = "��";
		
		
		if(intDay == 0){
			day = "��";
		}else if (intDay == 1){
			day = "ȭ";
		}else if (intDay == 2){
			day = "��";
		}else if (intDay == 3){
			day = "��";
		}else if (intDay == 4){
			day = "��";
		}else if (intDay == 5){
			day = "��";
		}else {
			day = "��"; // �������� else�� ����� day�� �ʱ�ȭ�ȴٰ� �ν�
		}
		
		
		/*
		switch (intDay){
			case 0 : day="��";
					break;
			case 1 : day="ȭ";
					break;
			case 2 : day="��";
					break;
			case 3 : day="��";
					break;
			case 4 : day="��";
					break;
			case 5 : day="��";
					break;
			default : day="��"; // day �ʱ�ȭ��Ű�� ���� default�� 
		}	
		*/
		System.out.printf("%d�� �Ĵ� %s�����Դϴ�.\n", x, day);
	}
}
		