
import java.util.Arrays;

class Movie implements Comparable{
	String title;
	String series;
	double score;
	
	Movie(){}
	Movie(String title, String series, double score){
		this.title = title;
		this.series = series;
		this.score = score;
	}
	
	public int compareTo(Object o){
		if(o instanceof Movie){
			if(this.score<((Movie)o).score) return -1;
			else if(this.score==((Movie)o).score) return 0;
			else return 1;
		}
		else{
			System.out.println("비교불가");
			return 999;
		}
	}
	
	public String toString(){
		return String.format("영화 제목: %s, 시리즈: %s, 평점: %.1f\n", title, series, score);
	}
	
	
}

class MovieTest{
	public static void main(String [] args){
		Movie [] movies = {new Movie("habc","d", 6),new Movie("zdsa","d", 2),new Movie("AEg","aed", 3.9),new Movie("eadd","ff", 5.5),new Movie("abc","deeas", 1)};
		
		Arrays.sort(movies);
		
		for(Movie m: movies){
			System.out.print(m);
		}
		
		
	}
}