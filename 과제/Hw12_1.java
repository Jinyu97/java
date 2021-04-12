import java.io.*;
import java.util.Scanner;

class Hw12_1{
	public static void main(String [] args){
		if(args.length==0){
			System.out.println("사용법");
			return;
		}
		
		File input = new File("원의 반지름과 넓이.java");
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
					pw.printf("%d번째 원의 넓이는 제대로 구해졌습니다! 반지름(%d), 넓이(%.2f)\n", order, radius, area);
				}
				else pw.printf("%d번째 원의 넓이는 잘못 구했습니다! 반지름이 %d일 경우 넓이는 %.2f가 아니라 %.2f입니다.\n", order, radius, area, area2);
				
			}
			
			s.close();
			pw.close();
		}catch(FileNotFoundException fnfe){
			return;
		}
		
		System.out.println("결과파일생성");
		
		
	}
}