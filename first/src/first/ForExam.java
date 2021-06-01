package first;

public class ForExam {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				continue;  //아래쪽 실행 x 다시 바로 위에 문장으로 올라감
//			}
			total = total + i;
			if (i==50) {
				break; //50을 포함한 50까지의 합까지만!
			}
		}
		
		System.out.println(total);
		
    }
}
		



