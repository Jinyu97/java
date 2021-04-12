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
		System.out.printf("���� �̸��� %s, ���̴� %d��, ������ %.2f���Դϴ�.\n", name, age, score);
	}
	
}

class StudentTest{
	public static void main(String [] args){
		
		Student lee = new Student("������", 4.3, 22);
		lee.speak();
		
	}
}