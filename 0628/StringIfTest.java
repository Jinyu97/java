import java.util.Scanner;
// 사용자는 합격 또는 불합격을 입력한다.
// 합격=>1출력, 불합격=>0출력
// if문으로!
class StringIfTest{
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		System.out.print("합격 or 불합격: ");
		String str = s.next();
		
		//str.equals("합격") // str의 내용과 "합격"이 일치하는지 비교
		
		if (str.equals("합격")) System.out.println("1"); // == : 같은지 비교!!
		else if (str.equals("불합격")) System.out.println("0");
		else System.out.println("[입력오류] 합격/불합격만 입력하세요.");
		
	}
}