import java.io.FileInputStream;
import java.util.Scanner;

//IO ó��
public class ��������� {
	
	public static void main(String[] args) {
		
		/**String path = ���������.class.getResource("").getPath(); //name:
		System.out.println(path); //�����ΰ� ��µ�
		**/
		//Scanner s = new Scanner(System.in);
		
		try {
			FileInputStream fis = new FileInputStream("C:/Temp\\data1.txt");
			
			//fis : �ڿ� ������ ��ξ��� ���� ������ �������.

			//fis.read()�� int����
			int ch;
			
			//s.nextLine();
			
			
			while ((ch=fis.read()) != -1) { //-1�� eof(end of file) ������ ���̴�.
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
