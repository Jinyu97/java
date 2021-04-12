import java.util.Scanner;
class Test3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double input;
		
		System.out.print("-1000 초과 1000 미만 실수 하나를 입력하세요. : ");
		input = s.nextDouble();
		
		int intpart = (int)input;
		int abs;
		
		System.out.printf("입력한 실수의 정수 부분: %d\n", intpart);
		
		if (intpart>>31==0) abs = intpart;
		else abs = -1*intpart;
		
		
		int quo, rem;

		quo = abs/100;
		rem = abs%100;
		if (quo>1) System.out.printf("%d백 ", quo);
		else if (quo == 1) System.out.printf("백 ");
		
		
		
		
		quo = rem/10;
		rem = rem%10;
		if (quo>1) System.out.printf("%d십 ", quo);
		else if (quo == 1) System.out.printf("십 ");
		
		if (rem>0) System.out.printf("%d", rem);
		
		
		
	}
}