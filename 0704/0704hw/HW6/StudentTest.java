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
		System.out.format("���� �̸��� %s, ���̴� %d��, ������ %.2f���Դϴ�.\n", name, age, score);
	}
}
class StudentTest{
	public static void main(String [] args){
		Student hong = new Student(5, 4.3, "ȫ�浿");//5���� ���� 4.3�� ȫ�浿 �л� ����
		hong.speak();//ȫ�浿���� ����Ű��
		Student myFriend = new Student();//����Ʈ �����ڸ� ���� �ٸ� �л� �Ѹ� �� ����
		myFriend.speak();
	}
}