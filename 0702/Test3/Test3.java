import java.util.Scanner;
class Test3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double input;
		
		System.out.print("-1000 �ʰ� 1000 �̸� �Ǽ� �ϳ��� �Է��ϼ���. : ");
		input = s.nextDouble();
		
		int intpart = (int)input;
		int abs;
		
		System.out.printf("�Է��� �Ǽ��� ���� �κ�: %d\n", intpart);
		
		if (intpart>>31==0) abs = intpart;
		else abs = -1*intpart;
		
		
		int quo, rem;

		quo = abs/100;
		rem = abs%100;
		if (quo>1) System.out.printf("%d�� ", quo);
		else if (quo == 1) System.out.printf("�� ");
		
		
		
		
		quo = rem/10;
		rem = rem%10;
		if (quo>1) System.out.printf("%d�� ", quo);
		else if (quo == 1) System.out.printf("�� ");
		
		if (rem>0) System.out.printf("%d", rem);
		
		
		
	}
}