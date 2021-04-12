// 정수 a, b 입력받아 a/b 결과 출력하는 함수 만들기
// throws로 다른 사람에게 부탁하여 예외 처리(떠넘기기)
import java.util.Scanner;
class ArithmeticExceptionTest2{
	public static void main(String [] args){
		//메인에서도 throws ArithmeticException으로 떠넘기면 아무도 예외 처리 안 함: 비정상종료->a=10, b=0 입력 시 이 문장 실행될까? 두 문장 다 나오지 않음
		// 그러므로 메인에서 예외를 처리할 것
		try{
			divide();
		}catch(ArithmeticException ae){
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		System.out.println("이 문장 실행될까??"); //실행됨. divide()함수 안의 문장은 실행되지 않음
		
	}
	
	static void divide() throws ArithmeticException{ //main이 예외를 받게 됨
		int a, b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("a: ");
		a = s.nextInt();
		System.out.print("b: ");
		b = s.nextInt();
		
		System.out.println("a/b: "+(a/b));
		//예외 발생 시 예외를 main으로 던지므로 아래 문장은 실행되지 않음
		
		System.out.println("이 문장 실행될까?"); 
	}
	
}