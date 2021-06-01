import java.util.HashSet;
import java.util.Set;

public class HashSetExam2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30)); 
		// 두개는 다른객체이다(new를 써줘서) 근데 이름과 나이가 같아서 동등객체임....하나의 객체로 인식 
		
		System.out.println("총 객체수 : " + set.size());
	}
}
