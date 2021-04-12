/*
	Ŭ����:
			����: on()/off()
			�����: on()/off(), tempUp(), tempDown()
			������: on()/off(), tempUp(), tempDown()
			��Ź��: on()/off()
			TV: on()/off()
			���Ϸ�: on()/off(), tempUp(), tempDown()
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
	void tempDown(); //public, abstract ���� ����
}


class Refrigerator extends Appliance implements TempUpDown{
	
	public void tempUp(){ // interface���� public�̹Ƿ� �������� �� �ݵ�� public �ٿ��� ��
		System.out.println(getClass().getName()+": temp up!");
	}
	public void tempDown(){
		System.out.println(getClass().getName()+": temp down!");
	}
	
}

class AirConditioner extends Appliance implements TempUpDown{
	
	public void tempUp(){ // interface���� public�̹Ƿ� �������� �� �ݵ�� public �ٿ��� ��
		System.out.println(getClass().getName()+": temp up!");
	}
	public void tempDown(){
		System.out.println(getClass().getName()+": temp down!");
	}
	
}

class Boiler extends Appliance implements TempUpDown{
	
	public void tempUp(){ // interface���� public�̹Ƿ� �������� �� �ݵ�� public �ٿ��� ��
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