//���Ͽ� ����

import java.io.*;

//abc.txt ���Ͽ� Hello, World! ����ϱ�

class PrintWriterTest{ //���� ���
	public static void main(String [] args) throws FileNotFoundException{ 
	//�Ǵ� Exception�� �ᵵ ��
		
		//���� ��ü�� ����
		File abc = new File("abc.txt"); //���� ���� �ȿ� abc.txt�� ������(������ �� ���� ���)
		
		//���Ͽ� ��� ��Ʈ��(������ �̵��ϴ� ���)�� ����
		PrintWriter pw = new PrintWriter(abc); //PrintWriter=��� ��Ʈ���� abc ��ü�� ����
		
		//���Ͽ� ����
		pw.println("Hello, World!");
		
		System.out.println("���� ��� �Ϸ�"); //�����(System.out)�� ����
		
		//��Ʈ�� �ݱ�: �� ������ �ٸ� �͵��� �� ���Ͽ� ������ �� ����
		pw.close();
		
		
	}
}