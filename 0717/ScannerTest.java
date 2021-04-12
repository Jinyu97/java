//���� �б�
/* �̸� �г� ����
  ȫ�浿 4   4.3
  ����� 6   2.7
  �Ѹ�   3   4.0
  */
  
import java.io.*;
import java.util.Scanner; //�Է� ��Ʈ��

class ScannerTest{
	public static void main(String [] args){
		String name;
		int grade;
		double score;
		
		
		//���� ���� ��ü ����
		File std = new File("std.txt");
		
		//���� �������� ������ ������ �����ϴ��� �Ǵ� �� ó��
		if(std.exists()==false){
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
			System.exit(0); //�Ű������� ������ ���� ������ ��. �Ǵ� return;
		}
		
		
		try{ // �Ʒ����� ���ܹ߻�
			//�����ϴ� ��쿡�� ���Ͽ��� �ڷ� �а� ����Ϳ� ���
			Scanner s = new Scanner(std); //���Ͽ� �Է� ��Ʈ�� ����
			//cf) System.in=Ű����: ǥ�� �Է�
			System.out.println("���� ����: ");
		
			//���Ͽ��� �ڷ� �б�: ���Ͽ� �ڷᰡ �����ϴ� ���ȿ��� ����ؼ� �б� �۾�
			while(s.hasNext()){
				//hasNext(): ��ĳ�ʿ��� �� �о� �� ���� �ִٸ� true, ���ٸ� false ��ȯ
				name = s.next();
				grade = s.nextInt();
				score = s.nextDouble();
				System.out.printf("�̸�: %s, �г�: %d, ����: %.1f", name, grade, score);
				System.out.println();
			}
			
		
			//��Ʈ�� �ݱ�
			s.close();
			
		}catch(FileNotFoundException fnfe){
			System.err.println("FileNotFoundException �߻��Ͽ� ���α׷��� �����մϴ�."); //System.out.println���� �ص� ��
		}
		
		
	}
}