class Player{
	
	void play(){
		System.out.println("연주합니다.");
	}
	
}

class Pianist extends Player{
	
	@Override
	void play(){
		System.out.print("피아노를 ");
		super.play();
	}
		
	
}
class Violinist extends Player{
	
	@Override
	void play(){
		System.out.print("바이올린을 ");
		super.play();
	}
		
}
class Cellist extends Player{
	
	@Override
	void play(){
		System.out.print("첼로를 ");
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