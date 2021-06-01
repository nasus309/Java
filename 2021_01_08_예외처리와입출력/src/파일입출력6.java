import java.io.FileWriter;
import java.util.Scanner;

public class 파일입출력6 {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		FileWriter fw = new FileWriter("c:/Temp/data5.txt");
		String str;
		
		while(!(str=s.nextLine()).equals("")) {
			fw.write(str+"\r\n");
		}
		
		fw.close(); //이 구문 실행안해주면 파일 저장안하고 강제종료한거랑 똑같음.

	}

}
