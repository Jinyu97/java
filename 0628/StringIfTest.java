import java.util.Scanner;
// ����ڴ� �հ� �Ǵ� ���հ��� �Է��Ѵ�.
// �հ�=>1���, ���հ�=>0���
// if������!
class StringIfTest{
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		System.out.print("�հ� or ���հ�: ");
		String str = s.next();
		
		//str.equals("�հ�") // str�� ����� "�հ�"�� ��ġ�ϴ��� ��
		
		if (str.equals("�հ�")) System.out.println("1"); // == : ������ ��!!
		else if (str.equals("���հ�")) System.out.println("0");
		else System.out.println("[�Է¿���] �հ�/���հݸ� �Է��ϼ���.");
		
	}
}