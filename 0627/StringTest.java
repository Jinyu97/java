import java.util.Scanner;
// 사용자는 합격 또는 불합격을 입력한다.
// 합격=>1출력, 불합격=>0출력
class StringTest{
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		System.out.print("합격 or 불합격 ");
		String d = s.next();
		
		switch(d){
			case "합격" :
				System.out.println("1");
				break;
			case "불합격" : 
				System.out.println("0");
				break;
			default : System.out.println("[입력오류] 합격/불합격만 입력하세요.");
		}
		
		/* str의 내용이 합격인지 아닌지 비교하는 것이 아니라, 주소를 비교하기 때문
		if (d=="합격") System.out.println("1"); // == : 같은지 비교!!
		else System.out.println("0");
		*/
		
	}
}