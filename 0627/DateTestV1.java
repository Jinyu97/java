// 오늘은 수요일이다. x일 후는 무슨 요일인지 출력하시오.
// 단, x는 사용자로부터 입력받는다.
// 요일은 숫자로 표시할 것(월요일: 0, 화요일: 1, 수요일: 2, 목요일: 3, ..., 일요일: 6)

import java.util.Scanner;

class DateTestV1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int x;
		System.out.print("며칠 후?");
		x = s.nextInt();
		System.out.printf("%d일 후는 %d요일입니다.\n", x, (2+x)%7);
		
	}
}