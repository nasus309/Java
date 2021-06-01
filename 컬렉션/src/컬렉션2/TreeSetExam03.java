package 컬렉션2;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam03 {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		//알파벳의 순서~
		treeSet.add("apple");
		treeSet.add("forever"); //f뒤에 o와서 포함 xxx
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		//c~f사이 단어 검색 (c,d,e,f)
		System.out.println("[c~f 사이의 단어검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true); 
		//범위 검색 시 사용 (시작조건,시작값포함여부(true면포함),끝값,끝값포함여부)
		for(String word: rangeSet) {
			System.out.println(word);
		}
		
	}

}
