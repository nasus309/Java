import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam01 {
	//key값과 value값을 가짐.
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동",90);
		map.put("동장군",80);
		map.put("홍길동",95);  //키가 같으면 중복저장 x, 이전의 값이 이 값으로 대체
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println(map.get(0)); //null
		System.out.println();
		
		Set<String> keySet = map.keySet(); //key의 set
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ": " + value);
			System.out.println();
		}
		map.remove("홍길동"); //키,value 까지 다 삭제
		System.out.println("총 Entry 수 : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
	}

}
