import java.io.FileWriter;
import java.util.Scanner;

public class ���������6 {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		FileWriter fw = new FileWriter("c:/Temp/data5.txt");
		String str;
		
		while(!(str=s.nextLine()).equals("")) {
			fw.write(str+"\r\n");
		}
		
		fw.close(); //�� ���� ��������ָ� ���� ������ϰ� ���������ѰŶ� �Ȱ���.

	}

}
