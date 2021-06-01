package �÷���2;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam02 {

	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		scores.put(new Integer(87),"ȫ�浿");
		scores.put(new Integer(98),"�̵���");
		scores.put(new Integer(75),"�ڱ��");
		scores.put(new Integer(95),"�ſ��");
		scores.put(new Integer(80),"���ڹ�");
		
		//key,value �ٰ�����
		NavigableMap<Integer,String> descendingMap = scores.descendingMap(); 
		Set<Map.Entry<Integer,String>> descendingMapEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer,String> entry : descendingMapEntrySet) {
			System.out.print(entry.getKey()+"-"+entry.getValue()+" ");
		}
		System.out.println();
		//���������� �̿��� �ٽ� ������������
//		NavigableMap<Integer,String> ascendingMap = scores.descendingMap(); 
//		Set<Map.Entry<Integer,String>> ascendingMapEntrySet = ascendingMap.entrySet();
//		for(Map.Entry<Integer,String> entry : ascendingMapEntrySet) {
//			System.out.print(entry.getKey()+"-"+entry.getValue()+" ");
//		}

	}

}
