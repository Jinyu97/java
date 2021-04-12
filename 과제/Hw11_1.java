import java.util.Arrays;

class Hw11_1{
	public static void main(String [] args){
		Movie [] movies = {new Movie("����Ǯ 2", "����Ǯ", 9.11), new Movie("���Ǵ�Ƽ ��", "�����", 9.09), new Movie("����Ǯ", "����Ǯ", 8.53), new Movie("��Ʈ�ǰ� �ͽ���", "��Ʈ��", 8.92), new Movie("������ ���� ��Ʈ��", "�����", 8.59)};
		
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
		return String.format("����: %s, �ø���: %s, ����: %.1f\n", this.title, this.series, this.grade);
	}
	
}

