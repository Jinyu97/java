import java.util.Scanner;
class Hw3_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("�� 1�� x��ǥ�� �Է��ϼ���. : ");
		double x1 = s.nextDouble();
		System.out.print("�� 1�� y��ǥ�� �Է��ϼ���. : ");
		double y1 = s.nextDouble();
		System.out.print("�� 2�� x��ǥ�� �Է��ϼ���. : ");
		double x2 = s.nextDouble();
		System.out.print("�� 2�� y��ǥ�� �Է��ϼ���. : ");
		double y2 = s.nextDouble();
		
		if ((x1==x2)||(y1==y2)) {
			System.out.println("�� 1, �� 2�� ���簢���� �밢���� �ǵ��� �Է��ϼ���.");
			return ;
		}
		
		double ans1 = Math.abs((x2-x1)*2)+Math.abs((y2-y1)*2);
		double ans2 = Math.abs((x2-x1)*(y2-y1));
		double ans3 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		
		System.out.printf("���簢���� �ѷ� : %.1f\n���� : %.1f\n�밢�� ���� : %.1f\n", ans1, ans2, ans3);
	}
}