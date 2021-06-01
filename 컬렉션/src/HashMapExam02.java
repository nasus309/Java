import java.util.HashMap;
import java.util.Map;

public class HashMapExam02 {
	
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student,Integer>();
		
		map.put(new Student(1,"홍길동"), 95); //동등객체는 중복해서 키를 사용할 수 없다~!
		map.put(new Student(1,"홍길동"), 90); //원래는 다른 객체지만 키가 같으니까 동등 객체!
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println(map.get(new Student(1,"홍길동"))); //key를 통해 value얻기
		
	}

}
