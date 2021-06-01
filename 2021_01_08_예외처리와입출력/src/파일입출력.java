import java.io.FileInputStream;
import java.util.Scanner;

//IO 처리
public class 파일입출력 {
	
	public static void main(String[] args) {
		
		/**String path = 파일입출력.class.getResource("").getPath(); //name:
		System.out.println(path); //절대경로가 출력됨
		**/
		//Scanner s = new Scanner(System.in);
		
		try {
			FileInputStream fis = new FileInputStream("C:/Temp\\data1.txt");
			
			//fis : 뒤에 선언한 경로안의 파일 정보가 들어있음.

			//fis.read()는 int형임
			int ch;
			
			//s.nextLine();
			
			
			while ((ch=fis.read()) != -1) { //-1은 eof(end of file) 파일의 끝이다.
				System.out.print((char)ch);
			}
			
			fis.close();
		
		}catch(Exception e){
			
		}	
		
	}
	
	/*
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:/Temp\\data1.txt");
		
		int ch;
		
		while ((ch=fis.read()) != -1) {
			System.out.print((char)ch);
		}
		fis.close();
		
	}
	*/

}
