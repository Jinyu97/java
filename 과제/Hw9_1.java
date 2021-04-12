class Figure{
	double round;
	double area;
	
	Figure(){}
	Figure(double round, double area){
		this.round = round;
		this.area = area;
	}
	
	@Override
	public String toString(){
		return String.format("�� ������ "+getClass().getName()+"�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n", this.round, this.area);
	}
	
}

class Circle extends Figure{
	double radius;
	Circle(){}
	Circle(double radius){
		super(radius*2*Math.PI, radius*radius*Math.PI);
		this.radius = radius;
	}
	
	@Override
	public String toString(){
		return super.toString()+String.format("��, �������� %.1f�Դϴ�.\n", this.radius);
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Circle){
			if(this.radius == ((Circle)o).radius) return true;
			else return false;
		}
		else return false;
	}
	
}

class EquilateralTriangle extends Figure{
	double side;
	EquilateralTriangle(){}
	EquilateralTriangle(double side){
		super(side*3, Math.sqrt(3)/4*side*side);
		this.side = side;
	}
	@Override
	public String toString(){
		return super.toString()+String.format("�� �ﰢ���� �� ���� ���̴� %.2f�̰�, ���̴� %.2f�Դϴ�.\n", side, Math.sqrt(3)/2*side);
	}
	
}

class Hw9_1{
	public static void main(String [] args){
		Circle c1 = new Circle(3.0);
		Circle c2 = new Circle(1);
		Circle c3 = new Circle(3.0);
		EquilateralTriangle t1 = new EquilateralTriangle(3.0);
		
		System.out.println(c1);
		System.out.println(t1);
		System.out.println(c2);
		
		System.out.println(c1.equals(c2));
		System.out.println(c3.equals(c1));
		
		
	}
}