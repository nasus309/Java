import java.io.BufferedReader;
import java.io.FileReader;
public class ���������3 {

	public static void main(String[] args) throws Exception {
		
		
		FileReader fReader = new FileReader("c:/Temp/data1.txt");
		//fReader �� Object(�⺻ ���� �б�)
		
		BufferedReader bReader = new BufferedReader(fReader);
		//bReader �� Object(2����Ʈ�� �о����)
		
		String str = null;
		
		while((str = bReader.readLine()) != null) {
			System.out.println(str);
		}
		
		System.out.println(str); //null
		bReader.close();
		fReader.close();
		

	}

}
