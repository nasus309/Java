import java.io.BufferedReader;
import java.io.FileReader;
public class 파일입출력3 {

	public static void main(String[] args) throws Exception {
		
		
		FileReader fReader = new FileReader("c:/Temp/data1.txt");
		//fReader 는 Object(기본 파일 읽기)
		
		BufferedReader bReader = new BufferedReader(fReader);
		//bReader 는 Object(2바이트씩 읽어오기)
		
		String str = null;
		
		while((str = bReader.readLine()) != null) {
			System.out.println(str);
		}
		
		System.out.println(str); //null
		bReader.close();
		fReader.close();
		

	}

}
