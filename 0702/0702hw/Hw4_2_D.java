import java.util.Scanner;
class Hw4_2_D{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("라인 수를 입력하세요.(10 미만 홀수만) : ");
		int line = s.nextInt();
		
		for(int i=1; i<=line/2+1; i++){
			for(int blank=1; blank<=line/2-i+1; blank++){
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=line/2; i++){
			for(int blank=1; blank<=i; blank++){
				System.out.print(" ");
			}
			for(int j=1; j<=line-i*2; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
		