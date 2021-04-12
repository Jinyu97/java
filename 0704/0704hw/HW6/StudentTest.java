class Student{
	String name;
	double score;
	int age;
	Student(){}
	Student(double d){
		score = d;
	}
	Student(int i, double d, String s){
		age = i;
		score = d;
		name = s;
	}
	void speak(){
		System.out.format("나의 이름은 %s, 나이는 %d세, 학점은 %.2f점입니다.\n", name, age, score);
	}
}
class StudentTest{
	public static void main(String [] args){
		Student hong = new Student(5, 4.3, "홍길동");//5세의 학점 4.3인 홍길동 학생 생성
		hong.speak();//홍길동에게 말시키기
		Student myFriend = new Student();//디폴트 생성자를 통해 다른 학생 한명 더 생성
		myFriend.speak();
	}
}