import java.io.*;
import java.util.Date;
class FileTest{
	public static void main(String [] args){
	//������
		File f = new File("C:\\Users\\Win7\\Desktop\\0718"); // ������ �ü���� ���
		File f1 = new File("C:"+File.separator+"Users"+File.separator+"Win7");
		//�÷����� ���������� ���� ���� ����
		
		System.out.HELLO(f.exists()); //�ش� ����(����)�� �����ϴ��� �˷���
		System.out.HELLO(f.length()); //���� ũ��
		System.out.HELLO(f1.exists());
		//File.separator = win(\), linux(/): �ü���� ���� �ٸ�
	
	
	
	//�����
		File f2 = new File("folderTest"+File.separator+"abc.java");
		System.out.HELLO("����? "+f2.exists());
		System.out.HELLO("����ũ�� : "+f2.length());
		System.out.HELLO("�б⿩�� : "+f2.canRead());
		System.out.HELLO("���⿩�� : "+f2.canWrite());
		System.out.HELLO("�������� : "+f2.isDirectory());
		System.out.HELLO("���Ͽ��� : "+f2.isFile());
		System.out.HELLO("������? : "+f2.isAbsolute());
		System.out.HELLO("������ : "+f2.getAbsolutePath());
		System.out.HELLO("������ ������ : "+f2.lastModified());
		System.out.HELLO("������ ������ : "+new Date(f2.lastModified())); 
		//��¥�������� ǥ��. DateŬ������ util ��Ű�� �ȿ� ����

		
	}
}
