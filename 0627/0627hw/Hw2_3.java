import java.util.Scanner;
class Hw2_3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int quo;
		quo = a/10000;
		a = a%10000;
		if (quo>1) System.out.print(quo+"�� ");
		else if (quo==1) System.out.print("�� ");
		
		quo = a/1000;
		a = a%1000;
		if (quo>1) System.out.print(quo+"õ ");
		else if (quo==1) System.out.print("õ ");
		
		quo = a/100;
		a = a%100;
		if (quo>1) System.out.print(quo+"�� ");
		else if (quo == 1) System.out.print("�� ");
		
		quo = a/10;
		a = a%10;
		if (quo>1) System.out.print(quo+"�� ");
		else if (quo==1) System.out.print("�� ");
		
		if (a>=1) System.out.print(a);
		
		System.out.println("�Դϴ�.");
	}
}