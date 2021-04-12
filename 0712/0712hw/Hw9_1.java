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
		return String.format("�� ������ %s�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n", getClass().getName(), this.round, this.area);
	}
	
}

class Circle extends Figure{
	double radius;
	
	Circle(){
		this(1);
	}
	Circle(double radius){
		super(2*radius*Math.PI, radius*radius*Math.PI);
		this.radius = radius;
	}
	
	@Override
	public String toString(){
		return super.toString()+String.format("��, �������� %.1f�Դϴ�.", this.radius);
	}
	
	@Override
	public boolean equals(Object o){
		return this.radius==((Circle)o).radius;
	}
	
	
}

class EquilateralTriangle extends Figure{
	double side, height;
	
	EquilateralTriangle(){
		this(1);
	}
	EquilateralTriangle(double side){
		super(3*side, Math.sqrt(3)/4*side*side);
		this.side = side;
		this.height = Math.sqrt(3)/2*side;
	}
	
	@Override
	public String toString(){
		return super.toString()+String.format("�� �ﰢ���� �� ���� ���̴� %.2f�̰� ���̴� %.2f�Դϴ�.", this.side, this.height);
	}
	
	
}



class Hw9_1{
	public static void main(String [] args){
		
		Circle c1 = new Circle(3.0);
		System.out.println(c1.toString());
		System.out.println();
		
		EquilateralTriangle t = new EquilateralTriangle(3);
		System.out.println(t.toString());
		
		System.out.println();
		
		Circle c2 = new Circle(1);
		System.out.println(c2.toString());
		
		System.out.println();
		if(c1.equals(c2)) System.out.println("���� �� ���� �յ��Դϴ�.");
		else System.out.println("���� �� ���� �յ��� �ƴմϴ�.");
		
		
		
	}
}