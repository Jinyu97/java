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
		if(door==true) System.out.println("이미 열려있습니다.");
		else{
			System.out.println("문이 열립니다.");
			door = true;
		}
	}
	
	void Close(){
		if(door==true){
			System.out.println("문이 닫힙니다.");
			door=false;
		}
		else System.out.println("이미 닫혀있습니다.");
	}
	
	void Move(int f){
		Close();
		if(f>=-2 && f<=10){
			Report(f);
			System.out.println();
			if(f==0) System.out.println("로비로 이동했습니다.");
			else System.out.println(f+"층으로 이동했습니다.");
			Open();
			floor=f;
		}
		else System.out.println("-2이상 10 이하의 층만 입력하세요.");
	}
	
	void Report(int f)throws Exception{
		if(floor<f){
			for(int i=floor; i<=f; i++){
				if(i==0) {
					System.out.print("로비\t");
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
				if(i==0) System.out.print("로비\t");
				else System.out.print(i+"\t");
			}
		}
		else System.out.println("현재 층입니다.");
		
	}
	
	
}