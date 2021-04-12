/* 학생 클래스
 -나이 필드
 
 -Comparable 인터페이스를 구현: 이 인터페이스에 있는 모든 메소드를 재정의해줘야 한다는 뜻
 -compareTo(Object o) 메소드만 구현해주면 됨
	//호출 예시: st1.compareTo(st2)
	: st1의 나이가 st2의 나이보다 작다면 -1, 크다면 1, 같다면 0 반환
 
*/

import java.util.Arrays;
class Student implements Comparable{
	int age;
	Student(){}
	Student(int age){
		this.age = age;
	}
	@Override
	public int compareTo(Object o){ // 헤더의 수식어에 public 추가하기!
		if(o instanceof Student){
			if(this.age<((Student)o).age) return -1;
			else if(this.age == ((Student)o).age) return 0;
			else return 1; // else if~로 하면 컴파일 불가
		}
		else{
			System.out.println("비교 불가");
			return 9999;
		}
	}
}




class CompareTest{
	public static void main(String [] args){
		Student [] stds = {new Student(105), new Student(5), new Student(25), new Student(15), new Student(7)};
		
		
		System.out.println("학생1, 학생2 나이 비교: "+stds[0].compareTo(stds[1]));
		System.out.println("학생2, 학생3 나이 비교: "+stds[1].compareTo(stds[2]));
		System.out.println("학생1, 학생3 나이 비교: "+stds[2].compareTo(stds[0]));
		
		Arrays.sort(stds); //Arrays 클래스의 sort 메소드를 호출할 때, 매개변수로 Comparable 인터페이스를 구현한 클래스의 배열을 넣어주면 자동적으로 오름차순 정렬됨
		
		for(Student st: stds){
			System.out.print(st.age+" ");
		}
		
		String [] strings = {"ZBC", "Abc", "zbc"}; // 오름차순 정렬. ZBC가 맨앞이면 대문자가 소문자보다 앞
		
		for(String s: strings){
			System.out.print(s+" ");
		}
		
	}
}