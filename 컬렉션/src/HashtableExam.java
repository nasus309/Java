import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExam {
	//스레드에 동기화가 되어 있기 때문에 쓰레드에 안전하다!(멀티 쓰레드에 유용)
	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<String,String>();
		
		map.put("spring", "12");
		map.put("summer","123");
		map.put("fall", "1234");
		map.put("winter","12345");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디: ");
			String id = s.nextLine();
			
			System.out.print("비밀번호: ");
			String password = s.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				}else {
					System.out.println("아이디가 존재하지 않습니다.");
			}
			
			
		}

	}

}
