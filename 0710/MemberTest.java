class Member{
	
	String name;
	int age;
	static int members; // static 필드: 이 클래스로부터 생성된 객체들이 모두 공유함
	// 클래스에 하나 존재하기 때문에 "객체.필드"로 접근하지 않고, "클래스.필드"로 접근
	
	Member(){
		members++;
	}
	Member(String name, int age){
		this(); //Member();와 의미 같음, 다른 생성자 호출 시 코드 제일 앞에 와야 함.
		this.name = name;
		this.age = age;
	}
		
	// 총 동호회원수를 알려주는 메소드
	static void printMembers(){
		System.out.println("총 동호회원수는 "+members+"명입니다.");
	}
	
	/*
	static void printName(){ 
	// static은 모든 객체가 같은 결과 나오므로 객체마다 다른 name을 사용할 수 없다.
	// static에서는 non-static을 쓸 수 없다.
		System.out.println("이름: "+name);
	}
*/
	
}


class MemberTest{
	public static void main(String [] args){
		
		// m1.age : 아직 객체 없으므로 접근 불가능
		
		System.out.println("총 동호회원수: "+Member.members); 
		//static은 객체가 하나도 생성되지 않은 상황에서도 접근 가능
		//static 메소드에서는 non-static 멤버(필드, 메소드)에 접근 불가
		//non-static은 객체가 하나라도 생성되어야지만 접근 가능 
		
		//Member.printName();
		Member m1 = new Member();
		Member m2 = new Member("홍길동", 22);
		Member m3 = new Member();
		Member m4 = new Member("장발장", 45);
		
		System.out.println("총 동호회원수: "+Member.members);
		Member.printMembers();
		
		
	}
}