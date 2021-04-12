/*
	클래스:
			가전: on()/off()
			냉장고: on()/off(), tempUp(), tempDown()
			에어컨: on()/off(), tempUp(), tempDown()
			세탁기: on()/off()
			TV: on()/off()
			보일러: on()/off(), tempUp(), tempDown()
*/

class Appliance{
	void on(){
		System.out.println(getClass().getName()+" On");
	}
	void off(){
		System.out.println(getClass().getName()+" Off");
	}
}


interface TempUpDown{
	void tempUp();
	void tempDown(); //public, abstract 생략 가능
}


class Refrigerator extends Appliance implements TempUpDown{
	
	public void tempUp(){ // interface에서 public이므로 재정의할 때 반드시 public 붙여야 함
		System.out.println(getClass().getName()+": temp up!");
	}
	public void tempDown(){
		System.out.println(getClass().getName()+": temp down!");
	}
	
}

class AirConditioner extends Appliance implements TempUpDown{
	
	public void tempUp(){ // interface에서 public이므로 재정의할 때 반드시 public 붙여야 함
		System.out.println(getClass().getName()+": temp up!");
	}
	public void tempDown(){
		System.out.println(getClass().getName()+": temp down!");
	}
	
}

class Boiler extends Appliance implements TempUpDown{
	
	public void tempUp(){ // interface에서 public이므로 재정의할 때 반드시 public 붙여야 함
		System.out.println(getClass().getName()+": temp up!");
	}
	public void tempDown(){
		System.out.println(getClass().getName()+": temp down!");
	}
	
}


class Washer extends Appliance{}
class TV extends Appliance{}

class InterfaceTest{
	public static void main(String [] args){
		Appliance [] a = {new Refrigerator(), new AirConditioner(), new Boiler(), new Washer(), new TV()};
		for(Appliance app: a){
			app.on();
		}
		System.out.println();
		
		TempUpDown [] t = {new Refrigerator(), new AirConditioner(), new Boiler()};
		for(TempUpDown tp: t){
			tp.tempUp();
			tp.tempDown();
		}
		System.out.println();
		
		for(Appliance app: a){
			app.off();
		}
	
	}
}