import java.util.Scanner;
class ForTestV3{
	public static void main(String [] args){
		// 1. 구구단 출력
		Scanner s = new Scanner(System.in);
		
		int dan;
		System.out.printf("출력할 단 : ");
		dan = s.nextInt();
		
		System.out.printf("----%d단----\n", dan);
		for(int j=1; j<=9; j++){
				System.out.printf("%d X %d = %2d\n", dan, j, dan*j);	
			}
		System.out.println();

		/* 1-1. 몇 컬럼씩?
		System.out.printf("몇 컬럼씩? : ");
		int col = s.nextInt();
		
		for(int j=1; j<=9; j++){
			for(int i=1; i<=col; i++){
				System.out.printf("----%d단----\t", dan);
			System.out.printf("%d X %d = %2d\n", dan, j, dan*j);	
		}
		System.out.println();
		*/
		
				
		// 2. 1~10까지의 합 구하기
		int sum = 0;
		System.out.print("1부터 10까지의 합 : ");
		for (int i=1; i<=10; i++){
			sum += i;
		}
		System.out.println(sum+"\n");
		
		// 3. n! 구하기(int 타입)
		int i; // for문 밖에서 i 쓰기 위해 선언
		int n, fac, prefac;
		System.out.print("n= ");
		n = s.nextInt();
		fac = 1;
		prefac = 1;
		for(i=1; i<=n; i++){
			fac *= i; // fac = 1*2*3*...*i, prefac = 1*2*3*...*i-1
			if(prefac == fac/i)
				prefac = fac;
			else break;
		}
		
		if(prefac == fac) System.out.printf("%d! = %d\n\n", n, fac); 
		// break 안 걸리고 무사히 나온 경우. overflow 발생 안 한 경우
		else System.out.println(i+"! 구하는 과정에서 오버플로우 발생\n");
		// break 걸려서 반복문 종료된 경우: overflow 발생한 경우
		
		
		// 3-1. m! 구하기(long 타입)
		long k; // for문 밖에서 i 쓰기 위해 선언
		long m, fac2, prefac2;
		System.out.print("m= ");
		m = s.nextLong();
		fac2 = 1;
		prefac2 = 1;
		for(k=1; k<=m; k++){
			fac2 *= k; // fac2 = 1*2*3*...*k, prefac2 = 1*2*3*...*k-1
			if(prefac2 == fac2/k)
				prefac2 = fac2;
			else break;
		}
		
		if(prefac2 == fac2) System.out.printf("%d! = %d\n\n", m, fac2);
		else System.out.println(k+"! 구하는 과정에서 오버플로우 발생\n");
		
		
		// 4. 약수 출력하기
		for(i=1; i<=10; i++){
			System.out.printf("%2d의 약수는 ", i);
			for(int j=1; j<=i; j++){
				if(i%j==0) System.out.printf("%d ", j);
			}
			System.out.println();	
		}
		System.out.println();
		
		
		// 4-1. x의 약수 출력하기
		System.out.print("x = ");
		int x = s.nextInt();
		System.out.printf("%2d의 약수는 ", x);
		for(int j=1; j<=x; j++){
			if(x%j==0) System.out.printf("%d ", j);
		}
		System.out.println();


		
	
	}
	
}