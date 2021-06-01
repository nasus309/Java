package 컬렉션2;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam02 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(98);//이진트리 가장 오른쪽에 위치
		scores.add(75);//이진트리 가장왼쪽에 위치
		scores.add(95);
		scores.add(80);
		
		//scores.descendingIterator(); 내림차순으로 정렬된 반복자
		//scores.descendingSet(); 내림차순으로 정렬된 set 컬렉션
		
		//내림차순
		NavigableSet<Integer> descendingSet = scores.descendingSet(); //내림차순으로 정렬된 객체들이 저장
		for(Integer score : descendingSet) { 
			System.out.print(score + " "); //높은숫자부터 출력
		}
		System.out.println();
		
		//내림차순 두 번 -> 오름차순!!
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for(Integer score : ascendingSet) { 
			System.out.print(score + " "); //낮은숫자부터 출력
		}
		System.out.println();
		
	}

}
