
import java.util.Scanner;
class Student2{
	private String name;
	private int age;
	private double score;
	
	Student2(){}
	
	Student2(String name, int age, double score){
		this.name = name;
		
		if(age>=0 && age<200) this.age = age;
		else this.age=20;
		
		if(score>=0 && score<=4.3) this.score = score;
		else this.score = 3.5;
	}
	
	void setName(String name){
		this.name = name;
	}
	void setAge(int age){
		if(age>=0 && age<200) this.age = age;
		else this.age=20;
	}
	void setScore(double score){
		if(score>=0 && score<=4.3) this.score = score;
		else this.score = 3.5;
	}
	
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	double getScore(){
		return score;
	}
	
	
}

class StudentTest2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		Student2 s1 = new Student2(s.next(), s.nextInt(), s.nextDouble());
		System.out.println("�̸�: "+s1.getName()+", ����: "+s1.getAge()+", ����: "+s1.getScore());
		s1.setAge(24);
		s1.setName("ȫ�浿");
		System.out.println("�̸�: "+s1.getName()+", ����: "+s1.getAge()+", ����: "+s1.getScore());
		
	}
}