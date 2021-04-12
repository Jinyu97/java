class Hw10_2{
	public static void main(String [] args){
		Student s1 = new Student();
		Subject [] subject = {new Korean(), new English(), new Mathematics(), new Science()};
		
		for(Subject s: subject) s1.report(s);
		
	}
	
}


class Student{
	
	void report(Subject s){
		System.out.println(s.getClass().getName()+" Á¡¼ö: "+s.score);
		
	}
	
}


class Subject{
	int score;
	
	Subject(){
		score = (int)(Math.random()*101);
	}
	
	
}

class Korean extends Subject{
	
}
class English extends Subject{
	
}
class Mathematics extends Subject{
	
}
class Science extends Subject{
	
}