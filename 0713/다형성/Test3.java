/* // ������ �׽�Ʈ3
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
		Animal a = new Animal();
		Person p = new Person();
		Student s = new Student();
		
		a.print();
		System.out.println();
		
		p.print();
		System.out.println();
		
		s.print();
		System.out.println();
		
		
		
		
	 }
 }