import java.io.*;
class FileTest{
	public static void main(String [] args){
		File f = new File("C:\\Users\\Win7\\Desktop\\0717"); // ������ �ü���� ���
		File f1 = new File("C:"+File.separator+"Users"+File.separator+"Win7");
		//�÷����� ���������� ���� ���� ����
		System.out.println(f.exists()); //�ش� ������ �����ϴ��� �˷���
		System.out.println(f.length()); //���� ũ��
		System.out.println(f1.exists());
	}
}