import java.util.Scanner;

// ��������ڿ��� ������ �� : +, /
class OperatorTest{
	public static void main(String [] args){ // args : ���ڿ� ���� �� ������ �� �ִ� �迭
		
		int a; // ���� 1�� ���� ����
		int [] arr = {3, 2, 3, 5, 5}; // ���� 5�� ������ �� �ִ� �迭
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(5+3+": 5�� 3�� ��"); // ��� ���� -> 8
		System.out.println("5�� 3�� ��: "+5+3); // ���� ���� -> 53
		System.out.println("5�� 3�� ��: "+(5+3)); // ��� ���� -> 8
		
		//System.out.println(0/0); // ����������
		//System.out.println(70/0); // ����������
		System.out.println(90/0.0); // +inf
		System.out.println(0/0.0); // NaN : Not a Number
		System.out.println(-49/0.0); // -inf
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		// "3" => 3 ����ȯ ����?
		
		
	}
}