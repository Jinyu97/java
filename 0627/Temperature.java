import java.util.Scanner;
class Temperature{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int f;
		System.out.print("È­¾¾¿Âµµ: ");
		f = s.nextInt();
		System.out.printf("¼·¾¾¿Âµµ: %.2f\n", (double)5/9*(f-32));
		System.out.printf("¼·¾¾¿Âµµ: %.2f\n", 5.0/9*(f-32));
		
		
	}
}