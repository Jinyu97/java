// 자동차 면허 시험: 1종(70점 이상 합격)? 2종(60점 이상 합격)?

import java.util.Scanner;
class Driver{
	public static void main(String [] arg){
		Scanner s = new Scanner(System.in);
		int type; 
		int score;
		System.out.print("몇 종? ex) 1 : ");
		type = s.nextInt();
		
		if((type!=1)&&(type!=2)) {
			System.out.println("차종은 1 또는 2를 입력하세요."); 
			return;
		}
		
		System.out.print("몇 점? ex) 75 : ");
		score = s.nextInt();
		
		String hap = ((type==1)&&(score>=70))||((type==2)&&(score>=60))? "합격":"불합격";
		System.out.println(hap);
		
		/*
		if (type==1){
			if (score>=70) System.out.println("합격!");
			else System.out.println("불합격!");
		}
		else if (type==2){
			if(score>=60) System.out.println("합격!");
			else System.out.println("불합격!");
		}
		else System.out.println("다시 입력하세요.");
		*/
	}
}