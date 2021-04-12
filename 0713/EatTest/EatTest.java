class I{
	
	I(){}
	
	void eat(Object o){
		if(o instanceof Food) System.out.println(o.getClass().getName()+"를 먹습니다.");
		else System.out.println("음식이 아닙니다.");
		
	}
	
	/*
	void eat(Food f){ //Food f = h; //업캐스팅
		System.out.println(f.getClass().getName()+"를 먹습니다."); //동적바인딩
	}
	*/
	
	
	
	/*
	void eat(Hamburger h){
		System.out.println("햄버거를 먹습니다.");
	}
	void eat(Pizza p){
		System.out.println(p.getClass().getName()+"를 먹습니다.");
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