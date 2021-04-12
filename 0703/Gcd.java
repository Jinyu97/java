import java.util.Scanner;
class Gcd{
	public static void main(String [] args){
		int x, y, tmp, r;
		Scanner s = new Scanner(System.in);
		System.out.print("정수 1 : ");
		x = s.nextInt();
		System.out.print("정수 2 : ");
		y = s.nextInt();
		
		
		if(x<y){
			tmp = x;
			x=y;
			y=tmp;
		}

		
		while(y!=0){
			r = x%y;
			tmp = x;
			x = y;
			y = r;
		}
		
		System.out.printf("최대공약수는 %d입니다.\n", x);
	}
	
	
}