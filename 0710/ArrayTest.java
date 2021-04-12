import java.util.Scanner;
class ArrayTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		// int [] scores = {50, 10, 20, 70, 80}; //점수가 정해진 상황: {}로 초기화
		
		int [] scores = new int[5];
		int sum=0;
		for(int i=0; i<scores.length; i++){
			System.out.print("학생 "+(i+1)+"의 성적: ");
			scores[i] = s.nextInt();
			sum += scores[i];
		}
		
		System.out.println("평균: "+(double)sum/scores.length);
		System.out.println();
		
		
		
		
		// 자동차들 배열
		Car [] myCars = {new Car("모닝", 2013), new Car("아반떼", 2018),new Car("모닝", 2013), new Car("아반떼", 2018),new Car("벤츠", 2018)};
		
		//자동차 5대의 이름 출력
		//for문으로
		for(int i=0; i<myCars.length; i++){
			System.out.print(myCars[i].name+"\t");
		}
		System.out.println();
		
		//for-each문으로 => for(배열 원소를 하나 저장할 변수 선언:배열명){반복할내용}
		for(Car myCar: myCars){ 
		// for-each문: 기초 자료형 배열 값은 변경 불가, Car는 참조 자료형이므로 배열값 직접
		// 변경 가능
			myCar.year = 2015;
		}
		
		for(Car myCar: myCars){
			System.out.print(myCar.year+"\t");
		}
		
		System.out.println();		
		
		
		// for문: 일부 성분들에게만 일을 시킬 수 있음, 배열 크기를 알아야 함
		// for-each문: 모든 성분들에게 일 시켜야만 함, 배열 크기를 몰라도 됨
		
		
		
		/*
		Car [] myCars = new Car[5]; //자동차 5대를 담을 수 있는 차고. 자동차는 아직 없음
		// myCars[0].year; 지금 상황에선 안 됨
		myCars[0] = new Car("모닝", 2013);
		myCars[1] = new Car("아반떼", 2018);
		myCars[2] = new Car("모닝", 2013);
		myCars[3] = new Car("아반떼", 2018);
		myCars[4] = new Car("벤츠", 2018);

		*/
	}
}


class Car{
	String name;
	int year;
	Car(){}
	Car(String name, int year){
		this.name = name;
		this.year = year;
	}
	
}