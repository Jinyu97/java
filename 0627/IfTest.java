// ���ǹ� - if
// ������ �Է¹޾�, 90�� �̻��̸� ���б�!, �ƴ϶�� �հ�! ���
// 90�� �̻��̸� ���б�!, 30�� �̻� 90�� �̸� �հ�!, 30�� �̸� ���հ�! ���
// : if, else if, else
import java.util.Scanner;

class IfTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int score;
		System.out.print("����: ");
		score = s.nextInt();
		if (score>=90) System.out.println("���б�!");
		else if(score>=30) System.out.println("�հ�!");
		else System.out.println("���հ�!"); // else �ڿ��� ������ ������ �� ��.
	}
}