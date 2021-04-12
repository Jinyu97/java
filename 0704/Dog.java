// 강아지와 놀거나(포만감>6) 강아지에게 밥 주기(포만감<=6)
// 강아지 객체 => 강아지 클래스(설계도)
// 스캐너 객체 => 스캐너 클래스에 따라 생성됨
// Scanner s = new Scanner(System.in);

class Dog{ // 강아지 설계도(클래스) 메인 메소드는 없어도 됨
	// 강아지라면 가지고 있어야 할 속성과 동작을 기술
	// 추상화를 거침 : 프로그램에서 필요한 속성과 동작만을 추출
	// 속성(=필드) : 변수 선언(포만감, 이름)
	// 메인 메소드 안에 있으면 일반변수, 클래스 안에 있으면 필드
	// 필드는 메소드가 아니라 클래스에 포함됨
	// 필드는 따로 초기화하지 않는다면 자료형에 맞는 0으로 초기화됨(정수: 0, 실수: 0.0, 문자열: null, boolean: false)
	int full;
	String name;
	
	// 생성자: 특별한 메소드(객체를 생성할 때만 호출 가능한 메소드): 반환타입 없고, 메소드명은 클래스명과 일치
	
	Dog(){} // 매개변수가 없는 생성자: 디폴트생성자
	
	// 태어나면서 이름과 포만감을 지정하는 생성자
	Dog(int i, String s){
		full = i;
		name = s;
	}
	
	// 동작 : 메소드로 작성
	// 노는 메소드
	void play(){
		// 노는 과정...
		System.out.println("재미있다.");
	}
	
	// 먹는 메소드: food 개수만큼 포만감 증가시키고 잘먹었습니다~! 출력
	void eat(int food){
		full += food;
		System.out.println("잘먹었습니다~!");
	}
	
	// 먹는 메소드: 매개변수 String
	void eat(String S){
		System.out.println(S+"를(을) 먹습니다.");
	}
	
	void eat(String S, int food){
		System.out.println(S+"를(을) "+food+"개 먹습니다.");
	}

}