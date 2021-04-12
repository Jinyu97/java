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
		return String.format("이 도형은 "+getClass().getName()+"이고, 둘레는 %.2f, 넓이는 %.2f입니다.\n", this.round, this.area);
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
		return super.toString()+String.format("또, 반지름은 %.1f입니다.\n", this.radius);
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
		return super.toString()+String.format("이 삼각형의 한 변의 길이는 %.2f이고, 높이는 %.2f입니다.\n", side, Math.sqrt(3)/2*side);
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