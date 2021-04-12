class HW10_3{
	public static void main(String [] args){
		Movie[] m ={new Movie("데드풀 2", "데드풀"), new Movie("인피니티 워", "어벤져스"),  new Movie("데드풀", "데드풀"),  new Movie("앤트맨과 와스프", "앤트맨")};
		
		System.out.println("데드풀 2와 인피니티 워는 같은 시리즈?: "+m[0].equals(m[1]));
		System.out.println("데드풀 2와 데드풀은 같은 시리즈?: "+m[0].equals(m[2]));
		System.out.println("데드풀 2와 앤트맨과 와스프는 같은 시리즈?: "+m[0].equals(m[3]));
		
		System.out.println("영화 앤트맨과 와스프 정보: "+m[3]);
		
		System.out.println("이제까지 개봉된 영화 수: "+Movie.numOfMovie);
		
		
	}
}

class Movie{
	String title;
	String series;
	static int numOfMovie;
	Movie(String title, String series){
		numOfMovie++;
		this.title 	= title;
		this.series = series;
	}
	
	public boolean equals(Object o){
		if(o instanceof Movie)	return series.equals(((Movie)o).series);
		else return false;
	}
	
	public String toString(){
		return String.format("제목: %s, 시리즈: %s", title, series);
	}
	
}