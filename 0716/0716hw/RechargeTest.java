class RechargeTest{
	public static void main(String [] args){
		Phone p = new Phone("������");
		Rechargeable [] rc = {new Laptop(), new Desktop(), new Battery(), new USB()};
		
		for(Rechargeable r: rc){
			r.recharge(p);
		}
		
	}
}




class Phone{
	String owner;
	Phone(){}
	Phone(String owner){
		this.owner=owner;
	}
	
	public String getOwner(){
		return owner;
	}
	
}

class Computer{
	
}

interface Rechargeable{
	void recharge(Phone p);
}

class Laptop extends Computer implements Rechargeable{
	
	public void recharge(Phone p){
		System.out.println(p.getOwner()+"�� �ڵ����� "+getClass().getName()+"���� �����մϴ�.");
	}
	
}

class Desktop extends Computer implements Rechargeable{
	
	public void recharge(Phone p){
		System.out.println(p.getOwner()+"�� �ڵ����� "+getClass().getName()+"���� �����մϴ�.");
	}
	
}

class Battery implements Rechargeable{
	public void recharge(Phone p){
		System.out.println(p.getOwner()+"�� �ڵ����� "+getClass().getName()+"���� �����մϴ�.");
	}
}

class USB implements Rechargeable{
	public void recharge(Phone p){
		System.out.println(p.getOwner()+"�� �ڵ����� "+getClass().getName()+"���� �����մϴ�.");
	}
}