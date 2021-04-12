import java.util.Scanner;

// 산술연산자에서 주의할 점 : +, /
class OperatorTest{
	public static void main(String [] args){ // args : 문자열 여러 개 저장할 수 있는 배열
		
		int a; // 정수 1개 저장 가능
		int [] arr = {3, 2, 3, 5, 5}; // 정수 5개 저장할 수 있는 배열
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(5+3+": 5와 3의 합"); // 계산 먼저 -> 8
		System.out.println("5와 3의 합: "+5+3); // 연결 먼저 -> 53
		System.out.println("5와 3의 합: "+(5+3)); // 계산 먼저 -> 8
		
		//System.out.println(0/0); // 비정상종료
		//System.out.println(70/0); // 비정상종료
		System.out.println(90/0.0); // +inf
		System.out.println(0/0.0); // NaN : Not a Number
		System.out.println(-49/0.0); // -inf
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		// "3" => 3 형변환 가능?
		
		
	}
}