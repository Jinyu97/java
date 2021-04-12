class I{
	
	I(){}
	
	void eat(Object o){
		if(o instanceof Food) System.out.println(o.getClass().getName()+"�� �Խ��ϴ�.");
		else System.out.println("������ �ƴմϴ�.");
		
	}
	
	/*
	void eat(Food f){ //Food f = h; //��ĳ����
		System.out.println(f.getClass().getName()+"�� �Խ��ϴ�."); //�������ε�
	}
	*/
	
	
	
	/*
	void eat(Hamburger h){
		System.out.println("�ܹ��Ÿ� �Խ��ϴ�.");
	}
	void eat(Pizza p){
		System.out.println(p.getClass().getName()+"�� �Խ��ϴ�.");
	}
	*/
	
}

class EatTest{
	public static void main(String [] args){
		I i = new I();
		Food [] foods = {new Hamburger(), new Pizza(), new Icecream(), new Hotdog(), new Ramyeon()};
		Stone s = new Stone();
		
		for(int j=0; j<foods.length; j++){
			i.eat(foods[j]);
		}
		i.eat(s);
		
	}
}


class Food{}
class Hamburger extends Food{}
class Pizza extends Food{}
class Icecream extends Food{}
class Hotdog extends Food{}
class Ramyeon extends Food{}
class Stone{}