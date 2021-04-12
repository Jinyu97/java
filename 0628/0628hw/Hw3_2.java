import java.util.Scanner;
class Hw3_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("정수 1개를 입력하세요. : ");
		int a = s.nextInt();
		int msb = a>>31;
		int absol1;
		String absol2;
		if (msb == 0) {
			absol1 = a;
			absol2 = "양수";
		}
		else {
			absol1 = -1*a;
			absol2 = "음수";
		}
		
		int quo = absol1>>3;
		int rem = absol1&7;
		
	System.out.printf("\"%d는 %s입니다. 이 수의 절댓값은 %d이고,\n\t이를 8로 나눈 몫은 %d이고,\n\t\t나머지는 %d입니다.\"", a, absol2, absol1, quo, rem);
	}
}