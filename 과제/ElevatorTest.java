class Elevator{
	int floor;
	boolean open=false;
	
	void open(){
		if(open) System.out.println("이미 열려있습니다.");
		else{
			System.out.println("문이 열립니다.");
			open = true;
		}
	}
	
	void close(){
		if(open){
			System.out.println("문이 닫힙니다.");
			open = false;
		}
		else System.out.println("이미 닫혀있습니다.");
	}
	
	void move(int f){
		close();
		report(f);
		floor = f;
		if(f>0) System.out.printf("%d층으로 이동했습니다.\n", floor);
		else if(f==0) System.out.printf("로비로 이동했습니다.\n");
		else System.out.printf("지하 %d층으로 이동했습니다.\n", floor);
		open();
	}
	
	void report(int f){
		if(floor>f){
			for(int i=floor; i>=f; i--){
				if(i==0) System.out.printf("로비\t");
				else if(i>0) System.out.printf("%d층\t", i);
				else System.out.printf("지하 %d층\t", i);
			}
		}
		else if(floor<f){
			for(int i=floor; i<=f; i++){
				if(i==0) System.out.printf("로비\t");
				else if(i>0) System.out.printf("%d층\t", i);
				else System.out.printf("지하 %d층\t", i);
			}
		}
		else System.out.println("현재 층입니다.");
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