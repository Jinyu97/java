import java.util.Scanner;
class Hw4_2_S{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("가로 : ");
		int hor = s.nextInt();
		System.out.print("세로 : ");
		int ver = s.nextInt();
		System.out.print("반복 : ");
		int rep = s.nextInt();
		
		for(int i=1; i<=ver; i++){
			for(int j = 1; j<=rep; j++){
				for(int k=1; k<=hor; k++){
					System.out.print("*");
					}
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
		