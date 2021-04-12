import java.util.Scanner;
import java.util.InputMismatchException; // util패키지 안에 있으므로 예외 잡으려면 import 해야함
class AgeInput{
	public static void main(String [] args){
		int age, itg;
		
		
		try{
			Scanner s = new Scanner(System.in);
		
			System.out.print("나이: ");
			age = s.nextInt();
			System.out.print("정수: ");
			itg = s.nextInt();
			
			System.out.format("당신의 나이는 %d세입니다.\n", age);
			System.out.format("나이/정수 = %d\n", age/itg);
		}catch(InputMismatchException ime){
			System.err.println("나이는 정수로 입력하세요.");
		}catch(ArithmeticException ae){
			System.err.println("나눌 수는 0 아닌 값으로 입력하세요.");
		}finally{
			System.out.println("이 문장 출력?"); //try문에 진입하면 무조건 실행됨
		}
		
		
		/*
		catch(Exception e){ //InputMismatchException이 발생해도 잡히고 ArithmeticException이 발생해도 잡힘
		//어떤 예외가 발생해서 잡혔는지 모르기 때문에 예외 처리를 어떤 식으로 해야 할 지 작성하기 어려움: 비추
			return;
		}
		*/
		
		System.out.println("이 문장 출력??"); //이 경우 예외를 다 잡았기 때문에 실행됨
		
		
	}
}
