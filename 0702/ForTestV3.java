import java.util.Scanner;
class ForTestV3{
	public static void main(String [] args){
		// 1. ������ ���
		Scanner s = new Scanner(System.in);
		
		int dan;
		System.out.printf("����� �� : ");
		dan = s.nextInt();
		
		System.out.printf("----%d��----\n", dan);
		for(int j=1; j<=9; j++){
				System.out.printf("%d X %d = %2d\n", dan, j, dan*j);	
			}
		System.out.println();

		/* 1-1. �� �÷���?
		System.out.printf("�� �÷���? : ");
		int col = s.nextInt();
		
		for(int j=1; j<=9; j++){
			for(int i=1; i<=col; i++){
				System.out.printf("----%d��----\t", dan);
			System.out.printf("%d X %d = %2d\n", dan, j, dan*j);	
		}
		System.out.println();
		*/
		
				
		// 2. 1~10������ �� ���ϱ�
		int sum = 0;
		System.out.print("1���� 10������ �� : ");
		for (int i=1; i<=10; i++){
			sum += i;
		}
		System.out.println(sum+"\n");
		
		// 3. n! ���ϱ�(int Ÿ��)
		int i; // for�� �ۿ��� i ���� ���� ����
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
		// break �� �ɸ��� ������ ���� ���. overflow �߻� �� �� ���
		else System.out.println(i+"! ���ϴ� �������� �����÷ο� �߻�\n");
		// break �ɷ��� �ݺ��� ����� ���: overflow �߻��� ���
		
		
		// 3-1. m! ���ϱ�(long Ÿ��)
		long k; // for�� �ۿ��� i ���� ���� ����
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
		else System.out.println(k+"! ���ϴ� �������� �����÷ο� �߻�\n");
		
		
		// 4. ��� ����ϱ�
		for(i=1; i<=10; i++){
			System.out.printf("%2d�� ����� ", i);
			for(int j=1; j<=i; j++){
				if(i%j==0) System.out.printf("%d ", j);
			}
			System.out.println();	
		}
		System.out.println();
		
		
		// 4-1. x�� ��� ����ϱ�
		System.out.print("x = ");
		int x = s.nextInt();
		System.out.printf("%2d�� ����� ", x);
		for(int j=1; j<=x; j++){
			if(x%j==0) System.out.printf("%d ", j);
		}
		System.out.println();


		
	
	}
	
}