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
class Desktop extends Computer{}//��ž�� ����ũž�� ��ǻ�͸� ��ӹ��� ��Ȳ�̶� �ٸ� Ŭ������ ��� �Ұ�. 
*/

//���� �������̽��� �ۼ��ϰ� �������̽��� �����ϵ��� �ۼ�
interface ReChargeable{
	void recharge(Phone p);
}
class Laptop extends Computer implements ReChargeable{
	@Override 
	public void recharge(Phone p){
		System.out.println(getClass().getName()+": "+p.getOwner()+"�� �ڵ����� �����մϴ�.");
	}
}
class Desktop extends Computer implements ReChargeable{
	@Override 
	public void recharge(Phone p){
		System.out.println(getClass().getName()+": "+p.getOwner()+"�� �ڵ����� �����մϴ�.");
	}
}
class SecondBattery implements ReChargeable{
	@Override 
	public void recharge(Phone p){
		System.out.println(getClass().getName()+": "+p.getOwner()+"�� �ڵ����� �����մϴ�.");
	}
}
class Charger implements ReChargeable{
	@Override 
	public void recharge(Phone p){
		System.out.println(getClass().getName()+": "+p.getOwner()+"�� �ڵ����� �����մϴ�.");
	}
}



class RechargeSimulation{
	public static void main(String [] args){
		ReChargeable [] myChargeables = {new Desktop(), new Laptop(), new SecondBattery(), new Charger()};
		Phone p = new Phone("������");
		
		for(ReChargeable rc:myChargeables){
			rc.recharge(p);
		}
	}
}
