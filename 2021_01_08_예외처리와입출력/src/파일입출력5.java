import java.io.FileInputStream;
import java.io.FileOutputStream;

public class 파일입출력5 {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("c:/Temp/data4.txt");
		
		int ch;
		
		while ((ch=System.in.read()) != 13) {
			fos.write((byte)ch);
		}
		
		fos.close();
		
//		FileInputStream fs = new FileInputStream("c:/Temp/data5.txt");
//		
//		int ch2;
//		
//		while ((ch2=fs.read()) != 13) {
//			System.out.println((char)ch2);
//		}
//		
//		fos.close();

	}

}
