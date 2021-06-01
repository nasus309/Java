import java.io.FileInputStream;

public class 파일입출력2_2 {
	
	public static void main(String[] ars) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("c:/Temp/data1.txt");
		int ch;
		byte[] bt = new byte[1024];
	
		int i =0;
		while((ch=fis.read()) != -1) {
			bt[i] = (byte)ch;
			i++;
		}
		System.out.print(new String(bt));
		fis.close();
	}
}
