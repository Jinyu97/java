// ������ �������̴�. x�� �Ĵ� ���� �������� ����Ͻÿ�.
// ��, x�� ����ڷκ��� �Է¹޴´�.
// ������ ���ڷ� ǥ���� ��(������: 0, ȭ����: 1, ������: 2, �����: 3, ..., �Ͽ���: 6)

import java.util.Scanner;

class DateTestV1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int x;
		System.out.print("��ĥ ��?");
		x = s.nextInt();
		System.out.printf("%d�� �Ĵ� %d�����Դϴ�.\n", x, (2+x)%7);
		
	}
}