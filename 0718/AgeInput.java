import java.util.Scanner;
import java.util.InputMismatchException; // util��Ű�� �ȿ� �����Ƿ� ���� �������� import �ؾ���
class AgeInput{
	public static void main(String [] args){
		int age, itg;
		
		
		try{
			Scanner s = new Scanner(System.in);
		
			System.out.print("����: ");
			age = s.nextInt();
			System.out.print("����: ");
			itg = s.nextInt();
			
			System.out.format("����� ���̴� %d���Դϴ�.\n", age);
			System.out.format("����/���� = %d\n", age/itg);
		}catch(InputMismatchException ime){
			System.err.println("���̴� ������ �Է��ϼ���.");
		}catch(ArithmeticException ae){
			System.err.println("���� ���� 0 �ƴ� ������ �Է��ϼ���.");
		}finally{
			System.out.println("�� ���� ���?"); //try���� �����ϸ� ������ �����
		}
		
		
		/*
		catch(Exception e){ //InputMismatchException�� �߻��ص� ������ ArithmeticException�� �߻��ص� ����
		//� ���ܰ� �߻��ؼ� �������� �𸣱� ������ ���� ó���� � ������ �ؾ� �� �� �ۼ��ϱ� �����: ����
			return;
		}
		*/
		
		System.out.println("�� ���� ���??"); //�� ��� ���ܸ� �� ��ұ� ������ �����
		
		
	}
}
