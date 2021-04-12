import java.util.Scanner;
class Hw3_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("점 1의 x좌표를 입력하세요. : ");
		double x1 = s.nextDouble();
		System.out.print("점 1의 y좌표를 입력하세요. : ");
		double y1 = s.nextDouble();
		System.out.print("점 2의 x좌표를 입력하세요. : ");
		double x2 = s.nextDouble();
		System.out.print("점 2의 y좌표를 입력하세요. : ");
		double y2 = s.nextDouble();
		
		if ((x1==x2)||(y1==y2)) {
			System.out.println("점 1, 점 2가 직사각형의 대각선이 되도록 입력하세요.");
			return ;
		}
		
		double ans1 = Math.abs((x2-x1)*2)+Math.abs((y2-y1)*2);
		double ans2 = Math.abs((x2-x1)*(y2-y1));
		double ans3 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		
		System.out.printf("직사각형의 둘레 : %.1f\n넓이 : %.1f\n대각선 길이 : %.1f\n", ans1, ans2, ans3);
	}
}