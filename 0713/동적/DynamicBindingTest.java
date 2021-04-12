/* // �������ε� �׽�Ʈ
// ����, ���, �л�: print()�޼ҵ�: ***�Դϴ�. (����/���/�л�)
*/
  
  
 class Animal{
	 int age;
	 Animal(){}
	 Animal(int age){
		 this.age = age;
	 }

	void print(){
		System.out.println("�����Դϴ�.");
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
	 
	 @Override
	 void print(){
		 //super.print();
		 System.out.println("����Դϴ�.");
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
	
	@Override
	void print(){
		//super.print();
		System.out.println("�л��Դϴ�.");
	}
	
 }
 
 class Stone{
	 
 }
 
 
 
 class DynamicBindingTest{ //�������ε� �׽�Ʈ
	 public static void main(String [] args){
		
		Animal [] animals = {new Animal(), new Person(), new Student()};
		
		
		//�޼ҵ� ȣ��
		//������ ����: �ش� ��ü(animals)�� �ڷ���(Animal)�� print()�޼ҵ尡 �ִ��� Ȯ���ϰ� ������ ���� ����
		//���� ���: �ڷ����� �ƴ϶� ���� ��ü�� �޼ҵ� ������ ���� : ���� ���ε�
		animals[0].print(); //�����Դϴ�.
		animals[1].print(); //����Դϴ�.
		animals[2].print(); //�л��Դϴ�.
		
		
		
		
	 }
 }