//���Ͽ� ����

import java.io.*;

//abc.txt ���Ͽ� Hello, World! ����ϱ�

class PrintWriterTest{ //���� ���
	public static void main(String [] args){ 
	
		//���� ���� �ȿ� abc.txt�� ������(������ �� ���� ���)
		//���Ͽ� ��� ��Ʈ��(������ �̵��ϴ� ���)�� ����
		//PrintWriter=��� ��Ʈ���� abc ��ü�� ����
		//���Ͽ� ����
		//�����(System.out)�� ����
		//��Ʈ�� �ݱ�: �� ������ �ٸ� �͵��� �� ���Ͽ� ������ �� ����
		
		try{
		File abc = new File("abc.txt"); 
		PrintWriter pw = new PrintWriter(abc, "abcs"); //�� �����ڸ� �� ���� �� ���� ���ܰ� �߻��� �� �����Ƿ�
		pw.println("Hello, World!");
		System.out.println("���� ��� �Ϸ�");
		pw.close();
		}catch(FileNotFoundException e){
			return;
		}catch(UnsupportedEncodingException ue){
			return;
		} //�� ���� ��� ������ ��
	
	}
}