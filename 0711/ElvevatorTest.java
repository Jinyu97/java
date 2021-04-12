class ElevatorTest{
	public static void main(String [] args)throws Exception{
		Elevator e1 = new Elevator();
		e1.Open();
		e1.Move(5);
		
	}
}
	
class Elevator{
	int floor;
	boolean door;
	Elevator(){};
	
	static void Open(){
		if(door==true) System.out.println("�̹� �����ֽ��ϴ�.");
		else{
			System.out.println("���� �����ϴ�.");
			door = true;
		}
	}
	
	static void Close(){
		if(door==true){
			System.out.println("���� �����ϴ�.");
			door=false;
		}
		else System.out.println("�̹� �����ֽ��ϴ�.");
	}
	
	static void Move(int f){
		Close();
		if(f>=-2 && f<=10){
			report(f);
			if(f==0) System.out.println("�κ�� �̵��߽��ϴ�.");
			else System.out.println(f+"������ �̵��߽��ϴ�.");
			Open();
			floor=f;
		}
		else System.out.println("-2�̻� 10 ������ ���� �Է��ϼ���.");
	}
	
	static void Report(int f){
		if(floor<f){
			for(int i=floor; i<=f; i++){
				if(i==0) System.out.print("�κ�\t");
				else System.out.print(i+"\t");
			}
		}
		else if(floor>f){
			for(int i=floor; i>=f; i--){
				if(i==0) System.out.print("�κ�\t");
				else System.out.print(i+"\t");
			}
		}
		else System.out.println("���� ���Դϴ�.");
		
	}
	
	
}