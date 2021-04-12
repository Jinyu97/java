class Player{
	
	void play(){
		System.out.println("�����մϴ�.");
	}
	
}

class Pianist extends Player{
	
	@Override
	void play(){
		System.out.print("�ǾƳ븦 ");
		super.play();
	}
		
	
}
class Violinist extends Player{
	
	@Override
	void play(){
		System.out.print("���̿ø��� ");
		super.play();
	}
		
}
class Cellist extends Player{
	
	@Override
	void play(){
		System.out.print("ÿ�θ� ");
		super.play();
	}
		
}

class Conductor{
	void direct(Player [] arr){
		for(Player a: arr){
			a.play();
		}
		
	}
}


class Concert{
	public static void main(String [] args){
		
		Player [] p = {new Pianist(), new Violinist(), new Cellist(),new Pianist(), new Violinist(), new Cellist(),new Pianist(), new Violinist(), new Cellist()};
		Conductor c = new Conductor();
		c.direct(p);
		
	}
}