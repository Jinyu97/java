/* // 동적바인딩 테스트
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
		
		Animal [] animals = {new Animal(), new Person(), new Student()};
		
		
		//메소드 호출
		//컴파일 여부: 해당 객체(animals)의 자료형(Animal)에 print()메소드가 있는지 확인하고 컴파일 여부 결정
		//실행 결과: 자료형이 아니라 실제 객체의 메소드 내용을 실행 : 동적 바인딩
		animals[0].print(); //동물입니다.
		animals[1].print(); //사람입니다.
		animals[2].print(); //학생입니다.
		
		
		
		
	 }
 }