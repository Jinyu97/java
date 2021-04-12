class HW10_1{
	public static void main(String [] args){
		Animal animal[]={new Cat(), new Dolphin(), new Dove()};
		for(Animal a: animal) a.move();
	}
}

class Animal{
	Animal(){
	}
	
	void move(){
		System.out.printf("���� %s�̰�, ", this.getClass().getName());
	}
}
class Cat extends Animal{
	Cat(){
	}
	@Override
	void move(){
		super.move();
		System.out.println("�޸��ϴ�.");
	}
	
}
class Dolphin extends Animal{
	Dolphin(){
	}
	
	@Override
	void move(){
		super.move();
		System.out.println("�����մϴ�.");
	}
	
}
class Dove extends Animal{
	Dove(){
	}
	
	@Override
	void move(){
		super.move();
		System.out.println("���ƴٴմϴ�.");
	}
	
}