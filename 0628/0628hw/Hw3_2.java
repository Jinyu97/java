import java.util.Scanner;
class Hw3_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("���� 1���� �Է��ϼ���. : ");
		int a = s.nextInt();
		int msb = a>>31;
		int absol1;
		String absol2;
		if (msb == 0) {
			absol1 = a;
			absol2 = "���";
		}
		else {
			absol1 = -1*a;
			absol2 = "����";
		}
		
		int quo = absol1>>3;
		int rem = absol1&7;
		
	System.out.printf("\"%d�� %s�Դϴ�. �� ���� ������ %d�̰�,\n\t�̸� 8�� ���� ���� %d�̰�,\n\t\t�������� %d�Դϴ�.\"", a, absol2, absol1, quo, rem);
	}
}