
public class 가전Test {

	public static void main(String[] args) {
	
	//default 생성자
	가전제품 LedTV = new 가전제품();
	가전제품 스타일러 = new 가전제품();
	
	//파라메타를 이용한 생성자, 메소드 오버로딩.
	가전제품 스타일러1 = new 가전제품(2000);
	//스타일러1.생산년도; 는 왜 안됨~~~~~~~~??
	System.out.println(스타일러1.생산년도);
	
	// LedTV.가격 = 1000000; ->private라 오류 뜸.
	// System.out.println(LedTV.가격);
	
	System.out.println(LedTV.get가격()); //0
	LedTV.set가격(10000);
	System.out.println(LedTV.get가격()); //10000
	LedTV.에너지효율등급 = 1;
	
	LedTV.set전원(false);
	System.out.println(LedTV.get전원());
	
	}
}
