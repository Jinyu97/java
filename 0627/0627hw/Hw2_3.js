import java.util.Scanner;
class Hw2_3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int quo;
		quo = a/10000;
		a = a%10000;
		if (quo>1) System.out.print(quo+"만 ");
		else if (quo==1) System.out.print("만 ");
		
		quo = a/1000;
		a = a%1000;
		if (quo>1) System.out.print(quo+"천 ");
		else if (quo==1) System.out.print("천 ");
		
		quo = a/100;
		a = a%100;
		if (quo>1) System.out.print(quo+"백 ");
		else if (quo == 1) System.out.print("백 ");
		
		quo = a/10;
		a = a%10;
		if (quo>1) System.out.print(quo+"십 ");
		else if (quo==1) System.out.print("십 ");
		
		if (a>=1) System.out.print(quo);
		
		System.out.println("입니다.");
	}
}