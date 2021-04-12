abstract class Fruit{
	abstract void print();
	
}

class Grape extends Fruit{
	@Override
	void print(){
		System.out.println("나는 포도");
	}
}

class Apple extends Fruit{
	@Override
	void print(){
		System.out.println("나는 사과");
	}
}

class Pear extends Fruit{
	@Override
	void print(){
		System.out.println("나는 배");
	}
}


class FruitTest{
	public static void main(String [] args){
		Fruit [] f = {new Grape(), new Apple(), new Pear()};
		for(Fruit fr: f) fr.print();
	}
}