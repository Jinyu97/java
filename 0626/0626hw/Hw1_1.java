import java.util.Scanner;
class Hw1_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.print("ù ��° ���� ���� : ");
		a = s.nextInt();
		System.out.print("�� ��° ���� ���� : ");
		b = s.nextInt();
		
		System.out.printf("%-11s|%-11s|%-11s|%-11s|\n", "number", "decimal", "octal", "hexadecimal");
		System.out.printf("%4$-11s|%1$+11d|%1$#11o|%1$#11x|\n%5$-11s|%2$+11d|%2$#11o|%2$#11x|\n%6$-11s|%3$+-11d|%3$#-11o|%3$#-11x|\n", a, b, a+b, "number 1", "number 2", "sum");
		
		
		
	}
}