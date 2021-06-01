package first;

public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 50000;
		long y = x; // (묵시적)형변환
		
		long x2 = 5;
//		int y2 = x2; x2가 int보다 큰 long 타입이기 때문에 오류가 발생. 강제 형변환 필요
		int y2 = (int)x2;

	}

}
