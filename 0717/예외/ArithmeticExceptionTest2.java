// ���� a, b �Է¹޾� a/b ��� ����ϴ� �Լ� �����
// throws�� �ٸ� ������� ��Ź�Ͽ� ���� ó��(���ѱ��)
import java.util.Scanner;
class ArithmeticExceptionTest2{
	public static void main(String [] args){
		//���ο����� throws ArithmeticException���� ���ѱ�� �ƹ��� ���� ó�� �� ��: ����������->a=10, b=0 �Է� �� �� ���� ����ɱ�? �� ���� �� ������ ����
		// �׷��Ƿ� ���ο��� ���ܸ� ó���� ��
		try{
			divide();
		}catch(ArithmeticException ae){
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}
		System.out.println("�� ���� ����ɱ�??"); //�����. divide()�Լ� ���� ������ ������� ����
		
	}
	
	static void divide() throws ArithmeticException{ //main�� ���ܸ� �ް� ��
		int a, b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("a: ");
		a = s.nextInt();
		System.out.print("b: ");
		b = s.nextInt();
		
		System.out.println("a/b: "+(a/b));
		//���� �߻� �� ���ܸ� main���� �����Ƿ� �Ʒ� ������ ������� ����
		
		System.out.println("�� ���� ����ɱ�?"); 
	}
	
}