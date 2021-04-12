class Hw10_3{
	public static void main(String [] args){
		Movie [] movies = {new Movie("가나다", 3), new Movie("라마바", 5), new Movie("가나다", 4),new Movie("라마바", 5)};

		for(Movie m: movies) System.out.println(m.toString());
		
		System.out.println("총 개봉 수: "+Movie.number);
		
		System.out.println("m1과 m2: "+movies[0].equals(movies[1]));
		System.out.println("m1과 m3: "+movies[0].equals(movies[2]));
		System.out.println("m4과 m2: "+movies[1].equals(movies[3]));
		
		
	}
}

class Movie{
	String title;
	int series;
	static int number;
	
	Movie(){
		number++;
	}
	
	Movie(String title, int series){
		this();
		this.title = title;
		this.series = series;
	}
	
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Movie)
			return (this.title.equals(((Movie)o).title))&&(this.series==((Movie)o).series);
		else return false;
	}
	
	@Override
	public String toString(){
		return String.format("제목: %s, 시리즈: %d", this.title, this.series);
	}
	
	
}