// Random 클래스 사용해서 난수 생성
// 사용자에게 -10 이상 10 이하 사이에서 하나의 수 추측
// 난수도 -10 이상 10 이하 사이에서 하나 생성
// 사용자가 난수를 맞힌다면 합격! 아니면 불합격! 출력

import java.util.*; // java.util 패키지 안에 있는 클래스를 모두 import
//import java.util.Random;
//import java.util.Scanner;
class RandomNumber{
	public static void main(String [] args){
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.print("-10 이상 10 이하 정수를 하나 입력하세요. : ");
		int usrIn = s.nextInt();
		int ranNum = r.nextInt(21)-10;
		
		System.out.println(ranNum);
		if (usrIn==ranNum) System.out.println("합격!");
		else System.out.println("불합격!");
		
		
		
		
		/*
		System.out.println(r.nextDouble()); // 0 이상 1 미만 난수
		System.out.println(r.nextInt()); // (정수) int 범위 안의 값 중 난수 생성(-2^(32)~2^(32)-1)
		System.out.println(r.nextInt(4)); // 0 이상 4 미만 정수(0, 1, 2, 3 중 하나)
		*/
	
	}
}