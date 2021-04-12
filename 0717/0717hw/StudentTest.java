import java.io.*;
import java.util.Scanner;
class StudentTest{
	public static void main(String [] args){
		Student [] students = new Student[3];
		
		File std = new File("�л�����.java");
		
		if(!(std.exists())){
			System.out.println("�л�����.java ������ �������� �ʽ��ϴ�.");
			return;
		}
		
		try{
			Scanner s = new Scanner(std);
			int i=0;
			while(s.hasNext()){
				students[i] = new Student(s.next(), s.nextInt(), s.nextDouble());
				i++;
			}
			
			s.close();
			
		}catch(FileNotFoundException e){
			System.out.println("�����߻�");
			System.exit(0);
		}
		for(Student st: students) System.out.println(st);
		
	}
}


class Student{
	String name;
	int grade;
	double score;
	
	Student(){}
	Student(String name, int grade, double score){
		this.name = name;
		this.grade = grade;
		this.score = score;
	}
	
	
	@Override
	public String toString(){
		return String.format("�̸�: %s, �г�: %d, ����: %.1f", name, grade, score);
	}
	
	
}