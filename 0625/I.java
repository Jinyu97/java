import java.util.Scanner;

class I{
	public static void main(String [] args){
		Scanner myScanner = new Scanner(System.in); //Ű����κ��� ���� �о���� ��ĳ�� ����
		//System.in = ǥ�� �Է�: Ű����
		
		/*
		String name; //����ڰ� �Է��� �̸��� ������ ����(�޸� ����)
		

		System.out.print("�̸�: "); //���� ����
		name = myScanner.nextLine(); //Ŀ�ǵ���ο��� �� ���� �о��
		
		//����ڿ��� Ű, ���� �Է¹ް� �״�� ����ϱ�
		double height; // Ű�� ������ ����(�޸� ����) Ȯ��
		int age; //���̸� ������ ���� Ȯ��
		
		System.out.print("Ű: ");
		height = myScanner.nextDouble(); //�Ǽ� �ϳ� �о��
		System.out.print("����: ");
		age = myScanner.nextInt(); //���� �ϳ� �о��
		
		
		System.out.printf("����� �̸��� %s, Ű�� %f, ���̴� %d�Դϴ�.\n", name, height, age);
 		*/
		
		
		
		//��ȭ��ȣ(String Ÿ��), �г�, ����
		String phone;
		int grade;
		double score;
		System.out.print("��ȭ��ȣ: ");
		phone = myScanner.nextLine();
		System.out.print("�г�: ");
		grade = myScanner.nextInt();
		System.out.print("����: ");
		score = myScanner.nextDouble();
		System.out.printf("����� ��ȭ��ȣ�� %s, �г��� %d, ������ %f�Դϴ�.\n", phone, grade, score);
		
		/*
		System.out.printf("���� ���ڰ��к� ���� ��ȿ���Դϴ�."); //printf: ���� ����
		System.out.println("���� ���ڰ��к� ���� ��ȿ���Դϴ�."); //println: ����
		System.out.format("���� ���ڰ��к� ���� ��ȿ���Դϴ�."); //printf�� ����(���� ����)
		System.out.println(3875242+4541344); //���� ���� �� ��
		System.out.printf("%d\n", 3875242+4541344); //printf���� f�� format(����)�� �����ϰڴٴ� �ǹ�
		//3875242+4541344
		//System.out = ǥ�� ���:�����
		//�̸�(���ڿ�), Ű(�Ǽ�), ����(����)�� ���� �����Ͽ� ���
		System.out.printf("�̸�: %s, Ű: %f, ����: %d\n", "������", 180.5, 152); */
	}
} //���ϸ�.java