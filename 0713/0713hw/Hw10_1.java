class Hw10_1{
	public static void main(String [] args){
		
	 Animal [] animal = {new Cat(), new Dolphin(), new Dove()};
	 for(Animal a: animal) a.move();
		
		
	}
	
}

class Animal{
	public void move(){
		System.out.print("나는"+getClass().getName()+"이고, ");
	}
	
}

class Cat extends Animal{
	
	@Override
	public void move(){
		super.move();
		System.out.println("달립니다.");
	}
}

class Dolphin extends Animal{
	
	@Override
	public void move(){
		super.move();
		System.out.println("수영합니다.");
	}
}

class Dove extends Animal{
	
	@Override
	public void move(){
		super.move();
		System.out.println("날아다닙니다.");
	}
}

