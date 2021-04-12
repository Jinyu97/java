class Pet{}
class Cat extends Pet{}
class Dog extends Pet{}
class Jindo extends Dog{}


class InstanceofTest{
	public static void main(String [] args){
		//개, 고양이, 진돗개 한 마리씩 만든 후 Pet 타입으로 지정(참조)하기
		/*
		Pet p1 = new Cat();
		Pet p2 = new Dog();
		Pet p3 = new Jindo();
		*/
		
		Pet [] myPets = {new Cat(), new Dog(), new Jindo()};
		
		System.out.println(myPets[0] instanceof Cat); //true
		System.out.println(myPets[1] instanceof Cat); //false
		//컴파일 됨(myPets[1]의 자료형이 Pet이기 때문에 Cat과 상속관계 있음)
		System.out.println(myPets[2] instanceof Cat); //false
		
		System.out.println();
		
		System.out.println(myPets[0] instanceof Jindo); //false
		System.out.println(myPets[1] instanceof Jindo); //false
		System.out.println(myPets[2] instanceof Jindo); //true
				
		System.out.println();
		
		System.out.println(myPets[0] instanceof Dog); //false
		System.out.println(myPets[1] instanceof Dog); //true
		System.out.println(myPets[2] instanceof Dog); //true
		
		
		
		
		/*
		Jindo j = new Jindo();
		Cat c = new Cat();
		System.out.println(j instanceof Cat); 
		System.out.println(c instanceof Jindo); 
		//컴파일 불가: j,c의 자료형과 Cat, Jindo 클래스 간 상속관계가 없으므로
		*/
		
	}
	
}