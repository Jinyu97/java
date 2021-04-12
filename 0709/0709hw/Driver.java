class Driver{
	public static void main(String [] args){
		Car c = new Car();
		c.goStraight(25);
		c.turnLeft();
		c.goStraight(30);
		c.turnRight();
		c.goStraight(15);
		c.turnLeft();
		c.goStraight(20);
		System.out.println("총 주행거리는 "+c.getMileage()+"m입니다.");
		
	}
	
	
}

class Car{
	int mileage;
	
	Car(){}
	
	int getMileage(){
		return mileage;
	}
	
	void goStraight(int d){
		System.out.println(d+"m 직진했습니다.");
		mileage+=d;
	} 
	
	void turnLeft(){
		System.out.print("좌회전 후 ");
	}
	
	void turnRight(){
		System.out.print("우회전 후 ");
	}
	
	
	
}