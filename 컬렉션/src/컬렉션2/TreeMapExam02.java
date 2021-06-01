package 컬렉션2;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam02 {

	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		scores.put(new Integer(87),"홍길동");
		scores.put(new Integer(98),"이동수");
		scores.put(new Integer(75),"박길순");
		scores.put(new Integer(95),"신용권");
		scores.put(new Integer(80),"김자바");
		
		//key,value 다가져옴
		NavigableMap<Integer,String> descendingMap = scores.descendingMap(); 
		Set<Map.Entry<Integer,String>> descendingMapEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer,String> entry : descendingMapEntrySet) {
			System.out.print(entry.getKey()+"-"+entry.getValue()+" ");
		}
		System.out.println();
		//내림차순을 이용해 다시 오름차순으로
//		NavigableMap<Integer,String> ascendingMap = scores.descendingMap(); 
//		Set<Map.Entry<Integer,String>> ascendingMapEntrySet = ascendingMap.entrySet();
//		for(Map.Entry<Integer,String> entry : ascendingMapEntrySet) {
//			System.out.print(entry.getKey()+"-"+entry.getValue()+" ");
//		}

	}

}
