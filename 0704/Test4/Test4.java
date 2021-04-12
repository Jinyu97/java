import java.util.Scanner;
class Test4{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("2 이상 10 미만의 정수 : ");
		int a;
		a = s.nextInt();
		while(a<2||a>=10){
			System.out.println("[입력오류] 2 이상 10 미만의 정수를 입력해주세요.");
			System.out.print("2 이상 10 미만의 정수 : ");
			a = s.nextInt();
		}
		
		for(int i=1; i<=a; i++){
			for(int blank=0; blank<a-i; blank++){
				System.out.print(" ");
			}
			for(int j=0; j<i; j++){
				System.out.print(a);
			}
			System.out.println();
		}
		for(int i=1; i<=a-1; i++){
			for(int j=0; j<a-i; j++){
				System.out.print(a);
				}
				System.out.println();
		}
	}
}