// 정수 입력받아 받은 점수의 평균 구하기
// 5의 배수는 평균 계산에서 제외
// 음수 입력받으면 종료

import java.util.Scanner;
class BreakTest{
	public static void main(String [] args){
		int userInput;
		int sum=0, cnt=0;
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("수를 입력하세요 : ");
			userInput = s.nextInt();
			if(userInput<0) break;
			if(userInput%5==0) continue;
			sum += userInput;
			cnt++;
		}
		
		if(cnt==0) System.out.println("평균을 계산할 수 없습니다.");
		else System.out.printf("입력하신 수들의 평균은 %.1f입니다.\n", (double)sum/cnt);
		
	}
}