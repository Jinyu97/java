import java.util.Scanner;
class Hw1_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		int age;
		double weight;
		String name;
		
		System.out.print("����, ������, �̸�: ");
		age = s.nextInt();
		weight = s.nextDouble();
		name = s.nextLine();
		
		System.out.printf("\"���� �̸��� \'%s\',\n���̴� %#x,\n\t�����Դ� %-10.3f�̴�\"", name, age, weight);
	
	}
	
	
}