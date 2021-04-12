class Pet{}
class Cat extends Pet{}
class Dog extends Pet{}
class Jindo extends Dog{}


class InstanceofTest{
	public static void main(String [] args){
		//��, �����, ������ �� ������ ���� �� Pet Ÿ������ ����(����)�ϱ�
		/*
		Pet p1 = new Cat();
		Pet p2 = new Dog();
		Pet p3 = new Jindo();
		*/
		
		Pet [] myPets = {new Cat(), new Dog(), new Jindo()};
		
		System.out.println(myPets[0] instanceof Cat); //true
		System.out.println(myPets[1] instanceof Cat); //false
		//������ ��(myPets[1]�� �ڷ����� Pet�̱� ������ Cat�� ��Ӱ��� ����)
		System.out.println(myPets[2] instanceof Cat); //false
		
		System.out.println();
		
		System.out.println(myPets[0] instanceof Jindo); //false
		System.out.println(myPets[1] instanceof Jindo); //false
		System.out.println(myPets[2] instanceof Jindo); //true
				
		System.out.println();
		
		System.out.println(myPets[0] instanceof Dog); //false
		System.out.println(myPets[1] instanceof Dog); //true
		System.out.println(myPets[2] instanceof Dog); //true
		
		
		
		
		/*
		Jindo j = new Jindo();
		Cat c = new Cat();
		System.out.println(j instanceof Cat); 
		System.out.println(c instanceof Jindo); 
		//������ �Ұ�: j,c�� �ڷ����� Cat, Jindo Ŭ���� �� ��Ӱ��谡 �����Ƿ�
		*/
		
	}
	
}