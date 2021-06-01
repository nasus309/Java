package 컬렉션2;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam01 {
	//TreeMap<K,V> treeMap = new TreeMap<K,V>():
	//key로 대소비교!
	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		scores.put(new Integer(87),"홍길동");
		scores.put(new Integer(98),"이동수");
		scores.put(new Integer(75),"박길순");
		scores.put(new Integer(95),"신용권");
		scores.put(new Integer(80),"김자바");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수: "+ entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: "+ entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lowerEntry(95); //95보다 적은 해당 entry
		System.out.println("95점 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(95); //95보다 높은 해당 entry
		System.out.println("95점 위의 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.floorEntry(95); //95포함 아래 점수
		System.out.println("95점이거나 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
	
		entry = scores.ceilingEntry(95); //95보다 적은 해당 entry
		System.out.println("95점이거나 바로 위의 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		while(!scores.isEmpty()) { 
			entry = scores.pollFirstEntry(); //  제일 왼쪽부터 가져와서 TreeMap에서 빼버리기~
			System.out.println(entry.getKey() + "-" + entry.getValue()+"(남은 객체수 :" + scores.size() +")");
		}
	}

}
