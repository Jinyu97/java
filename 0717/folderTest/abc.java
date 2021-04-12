import java.io.*;
class FileTest{
	public static void main(String [] args){
		File f = new File("C:\\Users\\Win7\\Desktop\\0717"); // 윈도우 운영체제식 경로
		File f1 = new File("C:"+File.separator+"Users"+File.separator+"Win7");
		//플랫폼에 독립적으로 폴더 접근 가능
		System.out.println(f.exists()); //해당 파일이 존재하는지 알려줌
		System.out.println(f.length()); //파일 크기
		System.out.println(f1.exists());
	}
}