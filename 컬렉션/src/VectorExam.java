import java.util.List;
import java.util.Vector;

public class VectorExam {
	
	//vector 가 필요한 이유 (멀티쓰레드환경에서
	//만약 add를 호출하는 쓰레드 두개가 같이 들어오면 어떤 쓰레드부터 처리해줘야할 지 모르기 때문에!
	//vector는 스레드 동기화(synchronization)가 되어있기때문에 ....?
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>(); //구현클래스를 vector로
		
		list.add(new Board("제목1","내용1","글쓴이1"));
		
		list.add(new Board("제목2","내용2","글쓴이2"));
		
		list.add(new Board("제목3","내용3","글쓴이3"));
		
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		System.out.println(list.get(3)); 
	
		
		System.out.println(list);
		
		
		/*
		list.remove(2);
		list.remove(3);
		
		for(int i=0;i<list.size();i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
		*/
	}
}
