class Subject{
	private int score;
	
	Subject(){
		score = (int)(Math.random()*101);
	}
	
	int getScore(){
		return score;
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

class Student{
	
	void report(Subject s){
		System.out.println(s.getClass().getName()+" Á¡¼ö: "+s.getScore());
	}
	
}

class SubjectTest{
	public static void main(String [] args){
		Student st = new Student();
		Subject [] sb = {new Korean(), new English(), new Mathematics(), new Science()};
		
		for(Subject s: sb) st.report(s);
		
	}
}