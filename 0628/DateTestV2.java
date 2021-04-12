// 오늘은 수요일이다. x일 후는 무슨 요일(문자)인지 출력하시오.
// 단, x(정수)는 사용자로부터 입력받는다.

import java.util.Scanner;
class DateTestV2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("며칠 후? ");
		
		int x = s.nextInt();
		int intDay = (x+2)%7;
		String day = "수";
		
		
		if(intDay == 0){
			day = "월";
		}else if (intDay == 1){
			day = "화";
		}else if (intDay == 2){
			day = "수";
		}else if (intDay == 3){
			day = "목";
		}else if (intDay == 4){
			day = "금";
		}else if (intDay == 5){
			day = "토";
		}else {
			day = "일"; // 마지막은 else로 해줘야 day가 초기화된다고 인식
		}
		
		
		/*
		switch (intDay){
			case 0 : day="월";
					break;
			case 1 : day="화";
					break;
			case 2 : day="수";
					break;
			case 3 : day="목";
					break;
			case 4 : day="금";
					break;
			case 5 : day="토";
					break;
			default : day="일"; // day 초기화시키기 위해 default로 
		}	
		*/
		System.out.printf("%d일 후는 %s요일입니다.\n", x, day);
	}
}
		