// Random Ŭ���� ����ؼ� ���� ����
// ����ڿ��� -10 �̻� 10 ���� ���̿��� �ϳ��� �� ����
// ������ -10 �̻� 10 ���� ���̿��� �ϳ� ����
// ����ڰ� ������ �����ٸ� �հ�! �ƴϸ� ���հ�! ���

import java.util.*; // java.util ��Ű�� �ȿ� �ִ� Ŭ������ ��� import
//import java.util.Random;
//import java.util.Scanner;
class RandomNumber{
	public static void main(String [] args){
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.print("-10 �̻� 10 ���� ������ �ϳ� �Է��ϼ���. : ");
		int usrIn = s.nextInt();
		int ranNum = r.nextInt(21)-10;
		
		System.out.println(ranNum);
		if (usrIn==ranNum) System.out.println("�հ�!");
		else System.out.println("���հ�!");
		
		
		
		
		/*
		System.out.println(r.nextDouble()); // 0 �̻� 1 �̸� ����
		System.out.println(r.nextInt()); // (����) int ���� ���� �� �� ���� ����(-2^(32)~2^(32)-1)
		System.out.println(r.nextInt(4)); // 0 �̻� 4 �̸� ����(0, 1, 2, 3 �� �ϳ�)
		*/
	
	}
}