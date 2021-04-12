import java.util.Scanner;
// ⓐ 상수화시키기: final, 식별자는 모두 대문자로
// ⓑ Math 클래스의 메소드, 필드

class Circle{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double r;
		//final double PI = 3.14; // final = 상수화시킴: 코드 하단에서 pi값 변경 불가
		// 상수는 식별자를 모두 대문자로
		
		System.out.print("원의 반지름 : ");
		r = s.nextDouble();
		
		// Math => java.lang.Math: java.lang 패키지에 속한 클래스는 import 없이 사용 가능
		System.out.printf("원의 둘레 : %.3f\n원의 넓이 : %.3f\n", r*2*Math.PI, Math.PI*Math.pow(r,2));
		
		System.out.printf("제곱근 5 : %f\ncos(0) : %f\nsin(0) : %f\n", Math.sqrt(5), Math.cos(0), Math.sin(0));
		
		System.out.printf("0 이상 10 미만 랜덤 값 : %f", 10*Math.random());
		// random(): 0 이상 1 미만 랜덤 값 생성

	}
}