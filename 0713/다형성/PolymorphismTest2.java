/* // 다형성 테스트2
// 3. 학생 클래스에서 equals()메소드 재정의: 학년이 같으면 같은 학년으로 간주하도록
상속을 활용하여 아래 클래스 작성

//** InstanceofTest.java에서 instanceof 테스트
// 4. 사람 클래스에서 equals()메소드 재정의: 나이와 이름이 같으면 같은 사람으로 간주하도록 재정의

// *나이와 이름을 매개변수로 가지는 생성자도 만들어야 함
// *사람 몇 명 만들어서 테스트, 사람과 돌도 같은지 비교해보기
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
	 public boolean equals(Object o){ //Object o = s;(돌)
		if(o instanceof Student)
			return this.grade==((Student)o).grade; 
		else
			return false; //돌은 Student의 객체가 아니므로 false
	}
	
 }
 
 class Stone{
	 
 }
 
 
 
 class PolymorphismTest2{
	 public static void main(String [] args){
		Student s1 = new Student(1);
		Student s2 = new Student(3);
		Student s3 = new Student(3);
		System.out.println("학생 1, 학생 3 비교: "+s1.equals(s3));
		System.out.println("학생 2, 학생 3 비교: "+s2.equals(s3));
		
		Stone s = new Stone(); //돌과 학생1 비교
		System.out.println("학생 1, 돌 비교: "+s1.equals(s));

		System.out.println();
		
		Person p1 = new Person(15, "홍길동");
		Person p2 = new Person(22, "이유진");
		Person p3 = new Person(15, "홍길동");
		
		System.out.println("사람 1, 사람 3 비교: "+p1.equals(p3));
		System.out.println("사람 2, 사람 3 비교: "+p2.equals(p3));
		System.out.println("사람 1, 돌 비교: "+p1.equals(s));
		
		
		
	 }
 }