import java.util.Scanner;
class NumGame{
	public static void main(String [] args){
		int jungdap = 79;
		Scanner s = new Scanner(System.in);
		int userInput, cnt=1;
		
		do{
			System.out.print("0~100까지의 정수를 입력하여 답을 맞혀보세요. : ");
			userInput = s.nextInt();
			if(userInput != jungdap){
				cnt++;
				if(jungdap>userInput) System.out.println("정답은 좀 더 큰 수입니다.");
				else System.out.println("정답은 좀 더 작은 수입니다.");
				}
			
		}while(userInput != jungdap);
		
		System.out.printf("축하합니다. %d는 정답입니다. %d번만에 맞히셨습니다.\n", userInput, cnt);
		
		
	}
}