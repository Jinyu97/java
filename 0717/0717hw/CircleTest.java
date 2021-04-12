import java.io.*;
import java.util.Scanner;
class CircleTest{
	public static void main(String [] args){
		int order=0, radius;
		double area, area2;
		
		if(args.length!=1){
			System.out.println("����: java CircleTest ��������������");
			return;
		}
		
		File f = new File(args[0]);
		File ra = new File("���� �������� ����.java");
		
		if(ra.exists()==false){
			System.out.println("���� �������� ����.java ������ �������� �ʽ��ϴ�. Ȯ�����ּ���.");
		}
		
		try{
			Scanner s = new Scanner(ra);
			PrintWriter pw = new PrintWriter(f);
		
			while(s.hasNext()){
				order++;
				radius = s.nextInt();
				area = s.nextDouble();
			
				area2 = radius*radius*3.14;
			
				if(area==area2){
					pw.printf("%d��° ���� ���̴� ����� ���������ϴ�: ������(%d), ����(%.2f)\n", order, radius, area);
				}
				else{
					pw.printf("%d��° ���� ���̴� �߸� ���߽��ϴ�: �������� %d�� ��� ���̴� %.2f�� �ƴ϶� %.2f�Դϴ�.", order, radius, area, area2);
				}
			
			}
		
			s.close();
			pw.close();
			
			
		}catch(FileNotFoundException e){
			System.out.println("���� �߻�");
			System.exit(0);
		}
		
		System.out.println("�ҽ������� ��ġ�� ������ ��� ������ �����Ǿ����ϴ�. Ȯ���غ�����.");
		
		
	}
}