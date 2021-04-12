import java.io.*;
import java.util.Date;
class FileTest{
	public static void main(String [] args){
	//������
		File f = new File("C:\\Users\\Win7\\Desktop\\0718"); // ������ �ü���� ���
		File f1 = new File("C:"+File.separator+"Users"+File.separator+"Win7");
		//�÷����� ���������� ���� ���� ����
		
		System.out.println(f.exists()); //�ش� ����(����)�� �����ϴ��� �˷���
		System.out.println(f.length()); //���� ũ��
		System.out.println(f1.exists());
		//File.separator = win(\), linux(/): �ü���� ���� �ٸ�
	
	
	
	//�����
		File f2 = new File("folderTest"+File.separator+"abc.java");
		System.out.println("����? "+f2.exists());
		System.out.println("����ũ�� : "+f2.length());
		System.out.println("�б⿩�� : "+f2.canRead());
		System.out.println("���⿩�� : "+f2.canWrite());
		System.out.println("�������� : "+f2.isDirectory());
		System.out.println("���Ͽ��� : "+f2.isFile());
		System.out.println("������? : "+f2.isAbsolute());
		System.out.println("������ : "+f2.getAbsolutePath());
		System.out.println("������ ������ : "+f2.lastModified());
		System.out.println("������ ������ : "+new Date(f2.lastModified())); 
		//��¥�������� ǥ��. DateŬ������ util ��Ű�� �ȿ� ����

		
	}
}