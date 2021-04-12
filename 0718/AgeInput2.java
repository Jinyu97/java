// Runtime 예외는 try-catch가 아니더라도 코드에서 적절히 예외가 발생하는 경우를 처리할 수 있음

import java.util.Scanner;
import java.util.InputMismatchException; 
class AgeInput2{
	public static void main(String [] args){
		int age, itg;
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("나이를 숫자로 입력해주세요: ");
		age = s.nextInt();
		System.out.format("당신의 나이는 %d세입니다.\n", age);
		
		System.out.print("정수: ");
		itg = s.nextInt();
		
		if(itg==0) System.out.println("0으로는 나눌 수 없습니다.");
		else System.out.format("나이/정수 = %d\n", age/itg);
		
		
	}
}
