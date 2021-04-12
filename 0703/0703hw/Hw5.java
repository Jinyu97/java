import java.util.Scanner;
class Hw5{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String type;
		int line, hor, ver, rep;
		System.out.print("도형의 타입 : ");
		type = s.nextLine();
		
		if(type.equals("피라미드")){
			System.out.print("라인 수 : ");
			line = s.nextInt();
			while((line<1)||(line>10)){
				System.out.println("양의 정수 중 10 이하를 입력하세요.");
				System.out.print("라인 수 : ");
				line = s.nextInt();	
			}
			for(int i=1; i<=line; i++){
				for(int blank=0; blank<line-i; blank++){
					System.out.print(" ");
				}
				for(int j=i-1; j>=0; j--){
					System.out.printf("%d", j);
				}
				for(int j=1; j<=i-1; j++){
					if(i==1) continue;
					System.out.printf("%d", j);
				}
				System.out.println();
			}
		}
		else if(type.equals("사각형")){
			System.out.print("가로 : ");
			hor = s.nextInt();
			System.out.print("세로 : ");
			ver = s.nextInt();
			System.out.print("반복 : ");
			rep = s.nextInt();
			
			for(int i=1; i<=ver; i++){
				for(int j=1; j<=rep; j++){
					for(int k=1; k<=hor; k++){
						System.out.print("*");
					}
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		
		else if(type.equals("다이아몬드")){
			System.out.print("라인 수 : ");
			line = s.nextInt();
			while((line<1)||(line%2==0)){
				System.out.println("양의 정수 중 홀수를 입력하세요.");
				System.out.print("라인 수 : ");
				line = s.nextInt();	
			}
			for(int i=1; i<=line/2+1; i++){
				for(int blank=1; blank<=line/2+1-i; blank++){
					System.out.print(" ");
				}
				for(int j=1; j<=2*i-1; j++){
					System.out.printf("*");
				}
				System.out.println();
			}
			
			for(int i=1; i<=line/2; i++){
				for(int blank=1; blank<=i; blank++){
					System.out.print(" ");
				}
				for(int j=1; j<=-2*i+line; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
	}
}