import java.util.Scanner;
class Hw4_2_P{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("라인 수를 입력하세요. : ");
		int line = s.nextInt();
		
		for(int i=1; i<=line; i++){
			for(int blank=0; blank<line-i; blank++){
				System.out.print(" ");
			}
			for(int j=i-1; j>=0; j--){
				System.out.printf("%d",j);
			}
			for(int j=1; j<=i-1; j++){
				System.out.printf("%d", j);
			}
			System.out.println();
		}
	}
}
				