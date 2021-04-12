class Phone{
	private String owner;
	public Phone(String owner){
		this.owner = owner;
	}
	public String getOwner(){
		return owner;
	}
}

class Computer{}
/*
class Laptop extends Computer{}
class Desktop extends Computer{}//랩탑과 데스크탑은 컴퓨터를 상속받은 상황이라 다른 클래스는 상속 불가. 
*/

//따라서 인터페이스를 작성하고 인터페이스를 구현하도록 작성
interface ReChargeable{
	void recharge(Phone p);
}
class Laptop extends Computer implements ReChargeable{
	@Override 
	public void recharge(Phone p){
		System.out.println(getClass().getName()+": "+p.getOwner()+"의 핸드폰을 충전합니다.");
	}
}
class Desktop extends Computer implements ReChargeable{
	@Override 
	public void recharge(Phone p){
		System.out.println(getClass().getName()+": "+p.getOwner()+"의 핸드폰을 충전합니다.");
	}
}
class SecondBattery implements ReChargeable{
	@Override 
	public void recharge(Phone p){
		System.out.println(getClass().getName()+": "+p.getOwner()+"의 핸드폰을 충전합니다.");
	}
}
class Charger implements ReChargeable{
	@Override 
	public void recharge(Phone p){
		System.out.println(getClass().getName()+": "+p.getOwner()+"의 핸드폰을 충전합니다.");
	}
}



class RechargeSimulation{
	public static void main(String [] args){
		ReChargeable [] myChargeables = {new Desktop(), new Laptop(), new SecondBattery(), new Charger()};
		Phone p = new Phone("권혜진");
		
		for(ReChargeable rc:myChargeables){
			rc.recharge(p);
		}
	}
}
