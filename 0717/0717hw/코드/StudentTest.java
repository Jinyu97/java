import java.util.Scanner;
import java.io.*;
class Student{
	private String name;
	private int grade;
	private double score;
	
	Student(){}
	Student(String name, int grade, double score){
		this.name = name;
		
		if(grade>0 && grade<=6) this.grade = grade;
		else this.grade = 1;
		
		if(score>=0 && score<=4.3) this.score = score;
		else this.score = 3.0;
	}
	
	public String toString(){
		return String.format("�̸�: %s, �г�: %d, ����: %.1f", this.name, this.grade, this.score);
	}
}


class StudentTest{
	public static void main(String [] args){
		Student [] students = new Student[3];
		
		File input = new File("�л�����.java");		
		
		if(!input.exists()){
			System.out.println("\"�л�����.java\" ������ �������� �ʽ��ϴ�. Ȯ�����ּ���.");
			return;
		}
		
		try{
			Scanner s = new Scanner(input);
			int i=0;
			
			while(s.hasNext()){
				students[i] = new Student(s.next(), s.nextInt(), s.nextDouble());
				i++;
			}
			
			s.close();
			
		}catch(FileNotFoundException e){
			System.out.println("���� �б� ����");
			return;
		}
		
		for(Student student:students){
			System.out.println(student);
		}
		
		
	}
}