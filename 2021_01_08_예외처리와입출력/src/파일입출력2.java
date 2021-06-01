import java.io.FileInputStream;
import java.util.Scanner;

public class 파일입출력2 {
	
	public static void main(String[] ars) {
	
	//Scanner s = new Scanner(System.in);
	
	try {
		FileInputStream fis = new FileInputStream("C:/Temp/data1.txt");
		
		int ch;
		int i = 0;
		//s.nextLine();
		
		byte bt[] = new byte[1024];
		char c[] = new char[1024];
		short ss[] = new short[1024];
		
		while((ch=fis.read()) != -1) {
			bt[i] = (byte)ch;
			c[i] = (char)ch;
			ss[i] = (short)ch;
			
			System.out.print("byte 배열 : " + (char)bt[i] + "\t");
			System.out.print("char 배열 : " +(char)c[i] + "\t");
			System.out.println("short 배열 : " +(char)ss[i]);
			
			i++;
		}
		System.out.println(new String(bt));
		System.out.println(bt.length);
		System.out.println(new String(c));
		System.out.println(c.length);
		for(int j=0;j<ss.length;j++) {
			System.out.print((char)ss[j]);
			System.out.print(ss.length);
		}
		fis.close();
		
	}catch(Exception e) {
		
	}
	
}
	
}
