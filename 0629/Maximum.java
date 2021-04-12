// ⓑ 삼항연산자 *?*:*

import java.util.Scanner;
class Maximum{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요. : ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		int max = a>b?a:b;
		
		System.out.printf("최댓값: %d", max);
		
		
		/* ⓐ 조건문(if, switch문)을 통해 초기화할 경우 반드시 else 또는 default로 끝나야 함
		int sign;
		if(a==0) sign=0;
		else if (a<0) sign=-1;
		else sign=1; // else->초기화
		System.out.println(sign);
		*/
		
		/*
		int sign=0; // 초기화=값을 변수에 처음 대입하는 것
		if(a>0) sign=1;
		else if(a<0) sign=-1; // 위에서 sign을 초기화했으므로 else if로 끝나도 됨
		System.out.println(sign);
		*/
		
		/* 초기화 안하려면
		if(a>0) System.out.println(1);
		else if(a<0) System.out.println(-1);
		else if(a==0) System.out.println(0);
		*/
		
		
	}
}