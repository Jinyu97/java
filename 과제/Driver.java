class Car{
	int mileage;
	
	void goStraight(int distance){
		System.out.println(distance+"m �����߽��ϴ�.");
		mileage+=distance;
	}
	
	void turnLeft(){
		System.out.print("��ȸ�� �� ");
	}
	
	void turnRight(){
		System.out.print("��ȸ�� �� ");
	}
	
	int getMileage(){
		return mileage;
	}
	
}

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