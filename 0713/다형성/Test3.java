/* // 다형성 테스트3
// 동물, 사람, 학생: print()메소드: ***입니다. (동물/사람/학생)
*/
  
  
 class Animal{
	 int age;
	 Animal(){}
	 Animal(int age){
		 this.age = age;
	 }

	void print(){
		System.out.println("동물입니다.");
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
		 System.out.println("사람입니다.");
	 }

 }
 
 class Student extends Person{
	 int grade;
	 
	 Student(){}
	 Student(int grade){
		 this.grade = grade;
	 }
	 
	 @Override
	 public boolean equals(Object o){ //Object o = s;(돌)
		if(o instanceof Student)
			return this.grade==((Student)o).grade; 
		else
			return false; //돌은 Student의 객체가 아니므로 false
	}
	
	@Override
	void print(){
		//super.print();
		System.out.println("학생입니다.");
	}
	
 }
 
 class Stone{
	 
 }
 
 
 
 class DynamicBindingTest{ //동적바인딩 테스트
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