import java.util.Scanner;
class Hw1_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		int age;
		double weight;
		String name;
		
		System.out.print("나이, 몸무게, 이름: ");
		age = s.nextInt();
		weight = s.nextDouble();
		name = s.nextLine();
		
		System.out.printf("\"나의 이름은 \'%s\',\n나이는 %#x,\n\t몸무게는 %-10.3f이다\"", name, age, weight);
	
	}
	
	
}