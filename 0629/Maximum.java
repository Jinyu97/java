// �� ���׿����� *?*:*

import java.util.Scanner;
class Maximum{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���. : ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		int max = a>b?a:b;
		
		System.out.printf("�ִ�: %d", max);
		
		
		/* �� ���ǹ�(if, switch��)�� ���� �ʱ�ȭ�� ��� �ݵ�� else �Ǵ� default�� ������ ��
		int sign;
		if(a==0) sign=0;
		else if (a<0) sign=-1;
		else sign=1; // else->�ʱ�ȭ
		System.out.println(sign);
		*/
		
		/*
		int sign=0; // �ʱ�ȭ=���� ������ ó�� �����ϴ� ��
		if(a>0) sign=1;
		else if(a<0) sign=-1; // ������ sign�� �ʱ�ȭ�����Ƿ� else if�� ������ ��
		System.out.println(sign);
		*/
		
		/* �ʱ�ȭ ���Ϸ���
		if(a>0) System.out.println(1);
		else if(a<0) System.out.println(-1);
		else if(a==0) System.out.println(0);
		*/
		
		
	}
}