abstract class Fruit{
	abstract void print();
	
}

class Grape extends Fruit{
	@Override
	void print(){
		System.out.println("���� ����");
	}
}

class Apple extends Fruit{
	@Override
	void print(){
		System.out.println("���� ���");
	}
}

class Pear extends Fruit{
	@Override
	void print(){
		System.out.println("���� ��");
	}
}


class FruitTest{
	public static void main(String [] args){
		Fruit [] f = {new Grape(), new Apple(), new Pear()};
		for(Fruit fr: f) fr.print();
	}
}