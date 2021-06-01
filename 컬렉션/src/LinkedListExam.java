import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	//객체를 특정인덱스에 삽입하거나 삭제할 때 매우 유용한 컬렉션
	//빠른 성능!
	public static void main(String[] args) {
		//둘다 사용방법은 똑같고 내부저장구조만 다름
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) +"ns");
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) +"ns");
	}

}
