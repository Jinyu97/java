// 자동차 면허 시험: 1종(70점 이상 합격)? 2종(60점 이상 합격)?

import java.util.Scanner;
class DriverLicense{
	public static void main(String [] arg){
		Scanner s = new Scanner(System.in);
		String type; 
		int score;
		System.out.print("몇 종? ex) 1 : ");
		type = s.next();
		
		if(!(type.equals("1종"))&&!(type.equals("2종"))) {
			System.out.println("1종 또는 2종을 입력하세요.");
			return;
		}
		
		System.out.print("몇 점? ex) 75 : ");
		score = s.nextInt();
		
		/* if문 이용
		if((type.equals("1종")&&(score>=70))||(type.equals("2종")&&(score>=60))) System.out.println("합격");
		else System.out.println("불합격");
		*/
		
		// switch문 이용
		switch(type){
			case "1종" : if (score>=70) System.out.println("합격");
						 else System.out.println("불합격");
						 break;
			case "2종" : if (score>=60) System.out.println("합격");
						 else System.out.println("불합격");
						 break;
			default : System.out.println("1종 또는 2종을 입력하세요.");
		}
		
		
	}
}