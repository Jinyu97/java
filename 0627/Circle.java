import java.util.Scanner;
// �� ���ȭ��Ű��: final, �ĺ��ڴ� ��� �빮�ڷ�
// �� Math Ŭ������ �޼ҵ�, �ʵ�

class Circle{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double r;
		//final double PI = 3.14; // final = ���ȭ��Ŵ: �ڵ� �ϴܿ��� pi�� ���� �Ұ�
		// ����� �ĺ��ڸ� ��� �빮�ڷ�
		
		System.out.print("���� ������ : ");
		r = s.nextDouble();
		
		// Math => java.lang.Math: java.lang ��Ű���� ���� Ŭ������ import ���� ��� ����
		System.out.printf("���� �ѷ� : %.3f\n���� ���� : %.3f\n", r*2*Math.PI, Math.PI*Math.pow(r,2));
		
		System.out.printf("������ 5 : %f\ncos(0) : %f\nsin(0) : %f\n", Math.sqrt(5), Math.cos(0), Math.sin(0));
		
		System.out.printf("0 �̻� 10 �̸� ���� �� : %f", 10*Math.random());
		// random(): 0 �̻� 1 �̸� ���� �� ����

	}
}