import java.util.Scanner;

class Hw4_4{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("¿­ ¼ö : ");
		int n = s.nextInt();
		int cnt=0;
		int a,b;
		a = 8%n==0?0:1;
		b = 8/n+a;
		
		for(int i=1; i<=b; i++){
			for(int j=1; j<=9; j++){
				for(int k=n*i-(n-2); k<=n*i+1; k++){
					if(k>9) break;
					System.out.printf("%d*%d=%2d  ", k, j, k*j);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}
}