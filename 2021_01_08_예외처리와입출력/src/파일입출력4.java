import java.io.File;
import java.util.Scanner;

public class 파일입출력4 {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(new File("c:/Temp/data2.txt"));
		
		int hap = 0;
		
		String ss;
		
		while(s.hasNextLine()) { //다음라인이 있으면
			ss= s.nextLine();
			if(ss.charAt(0)>='0' && ss.charAt(0)<='9') {
			//System.out.print("파일입력값 : "+ss+"\n");
			//파일에서 입력되는 값을 하나씩 확인
			hap = hap + Integer.parseInt(ss);
			//System.out.println("합계 : " + hap);
			//반복 사이클 당 정수값의 합 확인.
			
			//System.out.println(s.nextLine());
			//hap = hap + s.nextInt();  	//hap = hap + Integer.parseInt(s.nextInt());
			}
		}
		System.out.println("합계 : " + hap);
		s.close();
		

	}

}
