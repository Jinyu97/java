class HW10_3{
	public static void main(String [] args){
		Movie[] m ={new Movie("����Ǯ 2", "����Ǯ"), new Movie("���Ǵ�Ƽ ��", "�����"),  new Movie("����Ǯ", "����Ǯ"),  new Movie("��Ʈ�ǰ� �ͽ���", "��Ʈ��")};
		
		System.out.println("����Ǯ 2�� ���Ǵ�Ƽ ���� ���� �ø���?: "+m[0].equals(m[1]));
		System.out.println("����Ǯ 2�� ����Ǯ�� ���� �ø���?: "+m[0].equals(m[2]));
		System.out.println("����Ǯ 2�� ��Ʈ�ǰ� �ͽ����� ���� �ø���?: "+m[0].equals(m[3]));
		
		System.out.println("��ȭ ��Ʈ�ǰ� �ͽ��� ����: "+m[3]);
		
		System.out.println("�������� ������ ��ȭ ��: "+Movie.numOfMovie);
		
		
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
		return String.format("����: %s, �ø���: %s", title, series);
	}
	
}