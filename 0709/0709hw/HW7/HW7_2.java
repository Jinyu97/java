import java.util.Scanner;

class HW7_2{
	public static void main(String [] args){
		String name;
		int age;
		double grade;
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = s.nextLine();
		System.out.print("나이: ");
		age = s.nextInt();
		System.out.print("학점: ");
		grade = s.nextDouble();
		
		//콘솔에서 입력받은 정보로 학생 객체 생성
		Student st = new Student(name, age, grade);
		
		st.setGrade(4.3);//학점을 4.3으로 재 설정
		System.out.println("이름: "+st.getName());
		System.out.println("학점: "+st.getGrade());
	}
}

class Student{
	private String name;
	private int age;
	private double grade;
	
	public Student(){//디폴트 생성자는 이와 같이 아무 일도 하지 않아도 무방. 	
	}
	
	public Student(String s, int i, double d){
		setName(s);//생성자에서 setter 호출 가능. 
		setAge(i);
		setGrade(d);
	}
	
	void setName(String s){
		name = s;
	}
	void setAge(int i){
		if(i<0||i>=200) age = 20; 
		else age = i;
	}
	void setGrade(double d){
		if(grade<0||grade>4.3) grade = 3.0;
		else grade = d;
	}
	
	
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	double getGrade(){
		return grade;
	}
	
}