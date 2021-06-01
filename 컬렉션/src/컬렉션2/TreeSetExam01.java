package 컬렉션2;
import java.util.Iterator;
import java.util.TreeSet;

//이진트리를 기반으로한 Set컬렉션, 왼쪽과 오른쪽 자식노드를 참조하기 위한 두개의 변수로 구성.
public class TreeSetExam01 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(98);//이진트리 가장 오른쪽에 위치
		scores.add(75);//이진트리 가장왼쪽에 위치
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수: " + score);
		
		score = scores.lower(new Integer(95)); //왼쪽자식노드, 즉 이 객체의 바로 아래에 있는 객체
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(95); //바로 위에 객체 , 오른쪽 자식노드
		System.out.println("95점 위의 점수: " + score);
		
		score = scores.floor(new Integer(95)); //95를 포함한 그 아래값.95가 있다면 95도 return
		System.out.println("95점 이거나 바로 아래 점수: " + score);
		
		score = scores.ceiling(85);
		System.out.println("85점 이거나 바로 위의 점수: " + score);
		
		//TreeSet의 객체를 하나씩 빼오기 pollFirst 는 오름차순으로 가져오고 pollLast는 내림차순으로 가져옴
//		while(!scores.isEmpty()) {
//			score = scores.pollFirst(); //제일 왼쪽 자식노드부터 하나식 셀에서 빼내는 것.TreeSet에서 객체가 빠져버림
//			System.out.println(score +"(남은 객체수 : " + scores.size() + ")");
//		}
		
		//위와같은코드
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			int s = iterator.next();
			iterator.remove();//이부분이없으면 제거 안해줌
			System.out.print(s + "(남은 객체수 : " + scores.size() + ")" + "\n");
		}
		
		
	}
}
