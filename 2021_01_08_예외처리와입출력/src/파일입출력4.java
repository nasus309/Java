import java.io.File;
import java.util.Scanner;

public class ���������4 {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(new File("c:/Temp/data2.txt"));
		
		int hap = 0;
		
		String ss;
		
		while(s.hasNextLine()) { //���������� ������
			ss= s.nextLine();
			if(ss.charAt(0)>='0' && ss.charAt(0)<='9') {
			//System.out.print("�����Է°� : "+ss+"\n");
			//���Ͽ��� �ԷµǴ� ���� �ϳ��� Ȯ��
			hap = hap + Integer.parseInt(ss);
			//System.out.println("�հ� : " + hap);
			//�ݺ� ����Ŭ �� �������� �� Ȯ��.
			
			//System.out.println(s.nextLine());
			//hap = hap + s.nextInt();  	//hap = hap + Integer.parseInt(s.nextInt());
			}
		}
		System.out.println("�հ� : " + hap);
		s.close();
		

	}

}
