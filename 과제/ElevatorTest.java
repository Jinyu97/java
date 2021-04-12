class Elevator{
	int floor;
	boolean open=false;
	
	void open(){
		if(open) System.out.println("�̹� �����ֽ��ϴ�.");
		else{
			System.out.println("���� �����ϴ�.");
			open = true;
		}
	}
	
	void close(){
		if(open){
			System.out.println("���� �����ϴ�.");
			open = false;
		}
		else System.out.println("�̹� �����ֽ��ϴ�.");
	}
	
	void move(int f){
		close();
		report(f);
		floor = f;
		if(f>0) System.out.printf("%d������ �̵��߽��ϴ�.\n", floor);
		else if(f==0) System.out.printf("�κ�� �̵��߽��ϴ�.\n");
		else System.out.printf("���� %d������ �̵��߽��ϴ�.\n", floor);
		open();
	}
	
	void report(int f){
		if(floor>f){
			for(int i=floor; i>=f; i--){
				if(i==0) System.out.printf("�κ�\t");
				else if(i>0) System.out.printf("%d��\t", i);
				else System.out.printf("���� %d��\t", i);
			}
		}
		else if(floor<f){
			for(int i=floor; i<=f; i++){
				if(i==0) System.out.printf("�κ�\t");
				else if(i>0) System.out.printf("%d��\t", i);
				else System.out.printf("���� %d��\t", i);
			}
		}
		else System.out.println("���� ���Դϴ�.");
		System.out.println();
		
	}
	
}


class ElevatorTest{
	public static void main(String [] args){
		Elevator e1 = new Elevator();
		e1.open();
		e1.move(5);
		e1.move(-2);
	}
}