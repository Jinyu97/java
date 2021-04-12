import java.io.*;
import java.util.Scanner;

class Hw12_1{
	public static void main(String [] args){
		if(args.length==0){
			System.out.println("����");
			return;
		}
		
		File input = new File("���� �������� ����.java");
		File output = new File(args[0]);
		
		int radius, order=0;
		double area, area2;
		try{
			Scanner s = new Scanner(input);
			PrintWriter pw = new PrintWriter(output);
			
			while(s.hasNext()){
				order++;
				radius = s.nextInt();
				area = s.nextDouble();
				
				area2 = radius*radius*3.14;
				
				if(area==area2){
					pw.printf("%d��° ���� ���̴� ����� ���������ϴ�! ������(%d), ����(%.2f)\n", order, radius, area);
				}
				else pw.printf("%d��° ���� ���̴� �߸� ���߽��ϴ�! �������� %d�� ��� ���̴� %.2f�� �ƴ϶� %.2f�Դϴ�.\n", order, radius, area, area2);
				
			}
			
			s.close();
			pw.close();
		}catch(FileNotFoundException fnfe){
			return;
		}
		
		System.out.println("������ϻ���");
		
		
	}
}