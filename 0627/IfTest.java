// 조건문 - if
// 점수를 입력받아, 90점 이상이면 장학금!, 아니라면 합격! 출력
// 90점 이상이면 장학금!, 30점 이상 90점 미만 합격!, 30점 미만 불합격! 출력
// : if, else if, else
import java.util.Scanner;

class IfTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int score;
		System.out.print("점수: ");
		score = s.nextInt();
		if (score>=90) System.out.println("장학금!");
		else if(score>=30) System.out.println("합격!");
		else System.out.println("불합격!"); // else 뒤에는 조건이 붙으면 안 됨.
	}
}