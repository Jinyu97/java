class Student{
	String name;
	double score;
	int age;
	
	Student(){}
	
	Student(double d){
		score = d;
	}
	
	Student(String s, double d, int i){
		name = s;
		age = i;
		score = d;
	}
	
	void speak(){
		System.out.printf("나의 이름은 %s, 나이는 %d세, 학점은 %.2f점입니다.\n", name, age, score);
	}
	
}

class StudentTest{
	public static void main(String [] args){
		
		Student lee = new Student("이유진", 4.3, 22);
		lee.speak();
		
	}
}