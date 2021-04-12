class Cat{
	String name;
	
	// 말하는 동작: 내 이름은 ***
	void speak(){
		System.out.println("내 이름은 "+name+"입니다.");
	}
	
	Cat(){
		name = "길냥이";
	} 
	// 디폴트 생성자(매개변수가 없는 생성자): 아무런 생성자도 만들지 않은 경우, 자동으로 만들어줌
	// 생성자가 하나라도 있는 경우(아래의 Cat(String s){}) 자동으로 만들어주지 않음(컴파일 에러)
	// 특징1: 클래스명과 메소드명이 일치
	// 특징2: 반환타입이 없다.
	// 고양이 생성 시에 이름을 초기화하는 생성자!
	
	Cat(String s){
		name = s;
	}
	
}

// 원칙은 java파일 하나에 클래스 하나만 쓸 수 있음. 지금은 두 개 사용-> public class가 있다면 그 클래스명을 파일명으로 하고, 없다면 main이 들어간 클래스명과 파일명 일치시키기
class CatTest{
	public static void main(String [] args){
		// 고양이 한 마리 생성
		Cat myCat = new Cat(); // 디폴트 생성자를 호출
		myCat.speak();
		
		Cat nameCat = new Cat("야옹이");
		nameCat.speak();
		
	}
	
}