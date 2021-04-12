import java.util.Arrays;

class Hw11_1{
	public static void main(String [] args){
		Movie [] movies = {new Movie("데드풀 2", "데드풀", 9.11), new Movie("인피니티 워", "어벤져스", 9.09), new Movie("데드풀", "데드풀", 8.53), new Movie("앤트맨과 와스프", "앤트맨", 8.92), new Movie("에이지 오브 울트론", "어벤져스", 8.59)};
		
		Arrays.sort(movies);
		
		for(Movie m: movies){
			System.out.print(m);
		}
		
		
	}
}

class Movie implements Comparable{
	String title;
	String series;
	double grade;
	
	Movie(){}
	Movie(String title, String series, double grade){
		this.title = title;
		this.series = series;
		this.grade = grade;
	}
	
	@Override
	public int compareTo(Object o){
		if(o instanceof Movie){
			if(this.grade<((Movie)o).grade) return -1;
			else if(this.grade==((Movie)o).grade) return 0;
			else return 1;
		}
		else return 9999;
	}
	
	@Override
	public String toString(){
		return String.format("제목: %s, 시리즈: %s, 평점: %.1f\n", this.title, this.series, this.grade);
	}
	
}

