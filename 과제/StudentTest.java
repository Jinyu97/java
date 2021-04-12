class Student{
	String name;
	double score;
	int age;
	
	Student(){}
	
	Student(double score){
		this.score = score;
	}
	Student(String name, double score, int age){
		this.name = name;
		this.score = score;
		this.age = age;
	}
	
	
	void speak(){
		System.out.println("�̸�: "+name+", ����: "+score+", ����: "+age); 
	}
	
}


class StudentTest{
	public static void main(String [] args){
		Student s1 = new Student("������", 4.3, 22);
		s1.speak();
	}
}