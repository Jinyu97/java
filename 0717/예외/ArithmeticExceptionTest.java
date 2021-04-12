// 정수 a, b 입력받아 a/b 결과 출력하는 함수 만들기
// try-catch로 예외를 직접 처리함

import java.util.Scanner;
class ArithmeticExceptionTest{
	public static void main(String [] args){
		divide();
		System.out.println("이 문장 실행될까??");
		
	}
	
	static void divide(){
		int a, b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("a: ");
		a = s.nextInt();
		System.out.print("b: ");
		b = s.nextInt();
		
		try{ //예외 직접 처리
			System.out.println("a/b: "+(a/b));
		}catch(ArithmeticException ae){
			System.err.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("이 문장 실행될까?"); //예외 잡아서 처리했으므로 메소드 끝까지 실행되기 때문에 이 문장도 실행됨
		//예외 처리 시 비정상종료를 막을 수 있다.
	}
	
}