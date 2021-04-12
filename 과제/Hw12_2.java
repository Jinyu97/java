import java.io.*;
import java.util.Scanner;
class Hw12_2{
	public static void main(String [] args){
		
		Student [] s = new Student[3];
		File f = new File("학생정보.java");
		
		try{
			
			Scanner sc = new Scanner(f);
			
			int i=0;
			
			while(sc.hasNext()){
				s[i] = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
				i++;
			}
			
			sc.close();
		}catch(FileNotFoundException fe){
			return;
		}
		
		for(Student std: s) System.out.print(std);
		
	}
}

class Student{
	private String name;
	private int grade;
	private double score;
	
	
	Student(){}
	Student(String n, int g, double s){
		name = n;
		grade = g;
		score = s;
	}
	
	
	public String toString(){
		return String.format("이름: %s, 학년: %d, 학점: %.1f\n", name, grade, score);
	}
	
	
}