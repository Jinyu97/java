import java.io.*;
import java.util.Scanner;
class StudentTest{
	public static void main(String [] args){
		Student [] students = new Student[3];
		
		File std = new File("학생정보.java");
		
		if(!(std.exists())){
			System.out.println("학생정보.java 파일이 존재하지 않습니다.");
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
			System.out.println("오류발생");
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
		return String.format("이름: %s, 학년: %d, 학점: %.1f", name, grade, score);
	}
	
	
}