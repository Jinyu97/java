/* // ������ �׽�Ʈ2
// 3. �л� Ŭ�������� equals()�޼ҵ� ������: �г��� ������ ���� �г����� �����ϵ���
����� Ȱ���Ͽ� �Ʒ� Ŭ���� �ۼ�

//** InstanceofTest.java���� instanceof �׽�Ʈ
// 4. ��� Ŭ�������� equals()�޼ҵ� ������: ���̿� �̸��� ������ ���� ������� �����ϵ��� ������

// *���̿� �̸��� �Ű������� ������ �����ڵ� ������ ��
// *��� �� �� ���� �׽�Ʈ, ����� ���� ������ ���غ���
*/
  
  
 class Animal{
	 int age;
	 Animal(){}
	 Animal(int age){
		 this.age = age;
	 }

	 
 }
 
 class Person extends Animal{
	 String name;
	 
	 Person(){}
	 Person(int age, String name){
		super(age);
		this.name = name;
	 }
	 
	 @Override
	 public boolean equals(Object o){
		if(o instanceof Person)
			return this.age==((Person)o).age && (this.name).equals(((Person)o).name);
		else
			return false;
	 }

 }
 
 class Student extends Person{
	 int grade;
	 
	 Student(){}
	 Student(int grade){
		 this.grade = grade;
	 }
	 
	 @Override
	 public boolean equals(Object o){ //Object o = s;(��)
		if(o instanceof Student)
			return this.grade==((Student)o).grade; 
		else
			return false; //���� Student�� ��ü�� �ƴϹǷ� false
	}
	
 }
 
 class Stone{
	 
 }
 
 
 
 class PolymorphsimTest2{
	 public static void main(String [] args){
		Student s1 = new Student(1);
		Student s2 = new Student(3);
		Student s3 = new Student(3);
		System.out.println("�л� 1, �л� 3 ��: "+s1.equals(s3));
		System.out.println("�л� 2, �л� 3 ��: "+s2.equals(s3));
		
		Stone s = new Stone(); //���� �л�1 ��
		System.out.println("�л� 1, �� ��: "+s1.equals(s));

		System.out.println();
		
		Person p1 = new Person(15, "ȫ�浿");
		Person p2 = new Person(22, "������");
		Person p3 = new Person(15, "ȫ�浿");
		
		System.out.println("��� 1, ��� 3 ��: "+p1.equals(p3));
		System.out.println("��� 2, ��� 3 ��: "+p2.equals(p3));
		System.out.println("��� 1, �� ��: "+p1.equals(s));
		
		
		
	 }
 }