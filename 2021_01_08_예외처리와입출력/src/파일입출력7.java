import java.io.FileInputStream;
import java.io.FileOutputStream;

public class 파일입출력7 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/Windows/win.ini");
		FileOutputStream fos = new FileOutputStream("c:/Temp/data6.txt");
		int ch;
		
		while ((ch=fis.read()) != -1)
			fos.write((byte)ch);
		
		System.out.println("복사완료");
		fis.close();
		fos.close();
	}

}
