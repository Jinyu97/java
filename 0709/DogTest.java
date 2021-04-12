/* 강아지 클래스
	- 필드
		이름, 나이, 포만감(정수)
	- 생성자
		디폴트 생성자: 기본적인 강아지 생성자
						이름은 개똥이, 나이는 3세, 포만감은 5인 강아지
		이름, 나이, 포만감을 매개변수로 받는 생성자:
						매개변수로 받은 값을 필드값으로 초기화함
					* 조건: 
						나이는 0세 이상 100세 미만(이외의 값으로 초기화할 경우 3세로 고정할 것), 
						포만감은 0 이상 10 이하의 값으로(이외의 값으로 초기화할 경우 5로 고정할 것)
*/


class Dog{
	String name; 
	private int age; //접근 지정자: public, protected, private(외부에서 접근할 수 없음)
	private int full;
	
	// setter: 반환타입 void, private 필드 값을 유효값 설정하여 변경할 수 있게 하기 위해
	void setAge(int age){ // 나이를 안전하게 변경
		if(age>=0 && age<100) this.age = age;
		else this.age=3;
	}
	
	// getter: 
	String getName(){ //이름을 알려줌: 이름을 반환하는 메소드
		return name;
	}
	
	int getAge(){ 
		return age;
	}
	
	int getFull(){ 
		return full;
	}
	
	
	Dog(){ // 디폴트 생성자
		this("개똥이", 3, 5); // 의미 : Dog("개똥이", 3, 5);
		
		/* //이렇게 해도 됨
		name = "개똥이";
		age = 3;
		full = 5;
		*/
	}
	Dog(String name, int age, int full){ // 생성자 // 매개변수 age는 중괄호 안에서만 사용 가능
		this.name = name; // this = 이 객체의~
		
		if(age>=0 && age<100) this.age = age;
		else this.age=3;
		
		if(full>=0 && full<=10) this.full = full;
		else this.full=5;
	}
	
	
	public String toString(){ // 객체 정보를 문자열로 반환
		// 이 강아지의 모든 필드 정보를 반환: 이 강아지의 이름은 **이며, 나이는 **세, 포만감은 **입니다.
		// return "이 강아지의 이름은 "+name+"이며, 나이는 "+age+"세, 포만감은 "+full+"입니다.";
		return String.format("이 강아지의 이름은 %s이며, 나이는 %d세, 포만감은 %d입니다.", name, age, full); // 문자열에 format을 지정하는 메소드 = String.format();
		
	}
	
}

//객체가 생성된 후에 필드 정보를 바꾸고 싶을 때, 설정자(setter)라는 메소드를 활용: 예) setAge(), setName(), ...
//강아지 한 마리 생성 후, 강아지 정보 출력하기
class DogTest{
	public static void main(String [] args){
		Dog myDog = new Dog();
		System.out.println(myDog.toString());
		System.out.println(myDog); // 객체 자체를 출력 = 객체에 대한 정보를 문자열 타입으로 반환하는 메소드를 자동으로 실행(toString 호출한 결과와 같음)
		myDog.name = "멍멍이";
		// myDog.age = -5; : private 필드이므로 바꿀 수 없음		
		System.out.println(myDog);
		
		myDog.setAge(18); // private 필드이므로 setter로 값 변경
		//System.out.println("이 강아지의 나이: "+myDog.age); // age는 private 필드이므로 접근 불가
		System.out.println("이 강아지의 나이: "+myDog.getAge()); // getter로 접근
		
	}
	
}