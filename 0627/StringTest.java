import java.util.Scanner;
// ����ڴ� �հ� �Ǵ� ���հ��� �Է��Ѵ�.
// �հ�=>1���, ���հ�=>0���
class StringTest{
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		System.out.print("�հ� or ���հ� ");
		String d = s.next();
		
		switch(d){
			case "�հ�" :
				System.out.println("1");
				break;
			case "���հ�" : 
				System.out.println("0");
				break;
			default : System.out.println("[�Է¿���] �հ�/���հݸ� �Է��ϼ���.");
		}
		
		/* str�� ������ �հ����� �ƴ��� ���ϴ� ���� �ƴ϶�, �ּҸ� ���ϱ� ����
		if (d=="�հ�") System.out.println("1"); // == : ������ ��!!
		else System.out.println("0");
		*/
		
	}
}