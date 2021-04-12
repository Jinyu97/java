class ElevatorTest{
	public static void main(String [] args){
		Elevator e1 = new Elevator();
		e1.Open();
		e1.Move(5);
		e1.Move(-2);
		
	}
}
	
class Elevator{
	int floor;
	boolean door;
	Elevator(){};
	
	void Open(){
		if(door==true) System.out.println("�̹� �����ֽ��ϴ�.");
		else{
			System.out.println("���� �����ϴ�.");
			door = true;
		}
	}
	
	void Close(){
		if(door==true){
			System.out.println("���� �����ϴ�.");
			door=false;
		}
		else System.out.println("�̹� �����ֽ��ϴ�.");
	}
	
	void Move(int f){
		Close();
		if(f>=-2 && f<=10){
			Report(f);
			System.out.println();
			if(f==0) System.out.println("�κ�� �̵��߽��ϴ�.");
			else System.out.println(f+"������ �̵��߽��ϴ�.");
			Open();
			floor=f;
		}
		else System.out.println("-2�̻� 10 ������ ���� �Է��ϼ���.");
	}
	
	void Report(int f)throws Exception{
		if(floor<f){
			for(int i=floor; i<=f; i++){
				if(i==0) {
					System.out.print("�κ�\t");
					Thread.sleep(1000);
				}
				else{
					System.out.print(i+"\t");
					Thread.sleep(1000);
				}
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