import java.io.*;
import java.util.Date;
class FileTest{
	public static void main(String [] args){
	//절대경로
		File f = new File("C:\\Users\\Win7\\Desktop\\0718"); // 윈도우 운영체제식 경로
		File f1 = new File("C:"+File.separator+"Users"+File.separator+"Win7");
		//플랫폼에 독립적으로 폴더 접근 가능
		
		System.out.println(f.exists()); //해당 파일(폴더)이 존재하는지 알려줌
		System.out.println(f.length()); //파일 크기
		System.out.println(f1.exists());
		//File.separator = win(\), linux(/): 운영체제에 따라 다름
	
	
	
	//상대경로
		File f2 = new File("folderTest"+File.separator+"abc.java");
		System.out.println("존재? "+f2.exists());
		System.out.println("파일크기 : "+f2.length());
		System.out.println("읽기여부 : "+f2.canRead());
		System.out.println("쓰기여부 : "+f2.canWrite());
		System.out.println("폴더여부 : "+f2.isDirectory());
		System.out.println("파일여부 : "+f2.isFile());
		System.out.println("절대경로? : "+f2.isAbsolute());
		System.out.println("절대경로 : "+f2.getAbsolutePath());
		System.out.println("마지막 수정일 : "+f2.lastModified());
		System.out.println("마지막 수정일 : "+new Date(f2.lastModified())); 
		//날짜형식으로 표현. Date클래스는 util 패키지 안에 존재

		
	}
}