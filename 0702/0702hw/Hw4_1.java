import java.util.Scanner;
class Hw4_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("1보다 큰 수 하나를 입력하세요. : ");
		int a = s.nextInt();
		int sum=0;
		
		for(int i=1; i<=a; i++){
			if(i%2==1){
				sum += Math.pow(i,2);
				if(i==1) System.out.print("1²");
				else System.out.printf("+%d²",i);
			}
			else{
				sum -= Math.pow(i,2);
				System.out.printf("-%d²",i);
			}
		}
		System.out.printf("=%d",sum);
	}
}