/*1.
상속을 활용하여 아래 클래스 작성

동물 클래스
 - 필드: 나이
 
 //사람 클래스
  - 필드: 이름, 나이
  
 //학생 클래스
  - 필드: 학년, 이름, 나이
  */
  
  
 class Animal{
	 int age;
	 Animal(){}
	 /*
	 Animal(int age){
		 this.age = age;
	 }
	 */
	 
 }
 
 class Person extends Animal{
	 String name;
	 
	 Person(){}
	 /*
	 Person(int age, String name){
		super(age);
		this.name = name;
	 }*/
 }
 
 class Student extends Person{
	 int grade;
	 
	 Student(){}
	 /*
	 Student(int age, String name, int grade){
		 super(age, name);
		 this.grade = grade;
	 }*/
 }
 
 class Test1{
	 public static void main(String [] args){
		 Animal a1 = new Animal(); //동물 생성
		 
		 //Person a2 = new Person(); //사람 생성
		 Animal a2 = new Person(); //사람 생성 가능!! 캐스팅(형변환)이 발생했는데, 이런 종류의 캐스팅을 업캐스팅이라고 함
		
		//Student a3 = new Student(); //학생 생성
		 Animal a3 = new Student(); //학생 생성 가능! (업캐스팅)
		 Person a4 = new Student(); //업캐스팅
		 //다형성: polymorphsim: 하나의 객체를 여러가지 타입으로 지정할 수 있는 성질
		 
		 Student s1 = (Student)a4; 
		 //다운캐스팅 가능. a4는 원래 학생인데 임시로 사람으로 설정했다가 다시 학생으로 캐스팅하므로 
		 
		 //불가능(다운캐스팅): 컴파일 오류
		 //Student s = new Person();
		 
		 
		 //업캐스팅의 한계
		 //System.out.println(a2.name); //불가능
		 System.out.println(((Person)a2).name); //가능
		 System.out.println(((Student)a3).grade); //가능
		 System.out.println(((Person)a3).name); //가능, Student까지 캐스팅해도 됨
		 System.out.println(a3.age); // 캐스팅없이도 가능
		 
		 
		 //다운캐스팅의 한계: 실행시 비정상 종료 가능()
		 System.out.println("가능: "+((Person)a2).name); 
		 System.out.println("실행 불가능: "+((Student)a2).grade); //컴파일은 가능
		 
		 //컴파일 불가능: 다운 캐스팅
		 // Student s = new Person();
		 
		 /*
		 Animal a = new Animal(5);
		 System.out.println("동물나이: "+a.age);
		 Person p = new Person(10, "홍길동");
		 System.out.println("사람나이: "+p.age+", 이름: "+p.name);
		 Student s = new Student(22, "이유진", 3);
		 System.out.println("학생나이: "+s.age+", 이름: "+s.name+", 학년: "+s.grade);
		 */
	 }
 }