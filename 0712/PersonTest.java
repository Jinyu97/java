
class Animal{
	int age;
	String name;
	
	Animal(){ 
	//이 디폴트생성자를 없애면 아래의 생성자때문에 디폴트생성자가 자동으로 생성되지 않으므로 없애면 안 됨
		System.out.println("동물 생성"); 
	}
	
	Animal(int age, String name){
		this.age = age;
		this.name = name;
		System.out.printf("%d세의 동물(%s) 생성\n", this.age, this.name);
	}
	
	// Animal a = new Animal();
	// Animal b = new Animal();
	// a.equals(b); => a: this, b: o
	@Override //equals()메소드 재정의
	public boolean equals(Object o){ //어떤 동물이 서로 같은가?
	// 이름과 나이가 같으면 같은 동물로 간주
		if(this.age==((Animal)o).age && (this.name).equals(((Animal)o).name)) return true; //o는 필드가 없으므로 o를 Animal로 캐스팅
		else return false;
		
	}
	
	@Override //toString() 메소드 재정의
	public String toString(){
		return String.format("이 동물의 나이는 %d세, 이름은 %s입니다.\n", this.age, this.name); // this 빼도 됨
	}
	
	
	void eat(){
		System.out.println("밥을 먹는 중");
	}
	
	void move(){
		System.out.println("움직이는 중");
	}

}

class Person extends Animal{ // Person 클래스 필드 3개, 메소드 3개
	String job;
	
	Person(){
		// Animal(); //부모클래스의 디폴트생성자가 자동적으로 호출됨
		System.out.println("사람 생성"); //사람이 동물 상속받으므로 동물 먼저 생성 -> 사람 생성
	}
	
	Person(int age, String name, String job){
		/* 쓰지 말기
		this.age = age;
		this.name = name;
		// 부모클래스의 필드는 부모클래스가 초기화하도록 할 것.
		*/
		super(age, name); //의미: Animal(age, name);
		this.job = job;
		System.out.printf("직업이 %s인 사람 생성\n", this.job); 
	}
	
	
	// 접근지시자의 범위를 축소해서 override할 수는 없음. 단, 확대하는 것은 가능.
	// ex) 부모 public void move()-> 자식 public void move()로 해야 함
	// ex) 부모 void move() -> 자식 public void move() 가능
	// ex) 부모 private void move() -> override 자체가 불가능
	
	// 메소드 재정의 시 헤더는 완벽하게 일치해야 한다 : X(접근 지시자는 달라도 되고 시그니처만 일치하면 됨)
	@Override
	// 재정의(override): 시그니처가 부모클래스의 메소드와 완벽하게 일치(부모클래스의 메소드를 자식클래스에 맞게 다시 씀)
	// cf) 중복정의(overload): 메소드 이름은 같지만 시그니처는 달라야 함
	// 시그니처 = 메소드명+매개변수들
	void move(){
		System.out.println("걷는 중");
	}
	
	void work(){
		System.out.println("일하는 중");
	}
	
}


// 항상 자식클래스
class PersonTest{
	public static void main(String [] args){
		Animal a = new Animal(5,"개");
		System.out.println(a.toString());
		Animal b = new Animal(5, "새");
		System.out.println(b); // 자동적으로 toString() 메소드 호출
		Animal c = new Animal(5, "새");
		System.out.println(c);
		
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());

		System.out.println();
		
		System.out.println("a, b 일치? "+b.equals(a));
		System.out.println("b, c 일치? "+b.equals(c));
		
		System.out.println();
		
		Person p = new Person(22, "이유진", "학생");
		System.out.printf("나이: %d, 이름: %s, 직업: %s\n", p.age, p.name, p.job);
		System.out.println(p.toString());
		p.eat();
		p.move();
		p.work();

		
		
	}
}