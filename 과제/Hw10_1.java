class Hw10_1{
	public static void main(String [] args){
		Animal [] animal = {new Cat(), new Dolphin(), new Dove()};
		for(Animal a: animal) a.move();
	}
}

class Animal{
	
	void move(){
		System.out.print("���� "+getClass().getName()+"�̰�, ");
	}
	
}

class Cat extends Animal{
	
	@Override
	void move(){
		super.move();
		System.out.println("�޸��ϴ�.");
	}
}

class Dolphin extends Animal{
	
	@Override
	void move(){
		super.move();
		System.out.println("�����մϴ�.");
	}
}

class Dove extends Animal{
	
	@Override
	void move(){
		super.move();
		System.out.println("���ƴٴմϴ�.");
	}
}
