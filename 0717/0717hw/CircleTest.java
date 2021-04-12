import java.io.*;
import java.util.Scanner;
class CircleTest{
	public static void main(String [] args){
		int order=0, radius;
		double area, area2;
		
		if(args.length!=1){
			System.out.println("사용법: java CircleTest 결과가저장될파일");
			return;
		}
		
		File f = new File(args[0]);
		File ra = new File("원의 반지름과 넓이.java");
		
		if(ra.exists()==false){
			System.out.println("원의 반지름과 넓이.java 파일이 존재하지 않습니다. 확인해주세요.");
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
					pw.printf("%d번째 원의 넓이는 제대로 구해졌습니다: 반지름(%d), 넓이(%.2f)\n", order, radius, area);
				}
				else{
					pw.printf("%d번째 원의 넓이는 잘못 구했습니다: 반지름이 %d일 경우 넓이는 %.2f가 아니라 %.2f입니다.", order, radius, area, area2);
				}
			
			}
		
			s.close();
			pw.close();
			
			
		}catch(FileNotFoundException e){
			System.out.println("오류 발생");
			System.exit(0);
		}
		
		System.out.println("소스파일이 위치한 폴더에 결과 파일이 생성되었습니다. 확인해보세요.");
		
		
	}
}