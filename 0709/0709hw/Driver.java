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
		System.out.println("�� ����Ÿ��� "+c.getMileage()+"m�Դϴ�.");
		
	}
	
	
}

class Car{
	int mileage;
	
	Car(){}
	
	int getMileage(){
		return mileage;
	}
	
	void goStraight(int d){
		System.out.println(d+"m �����߽��ϴ�.");
		mileage+=d;
	} 
	
	void turnLeft(){
		System.out.print("��ȸ�� �� ");
	}
	
	void turnRight(){
		System.out.print("��ȸ�� �� ");
	}
	
	
	
}