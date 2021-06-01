public class ClassTest {

	public static void main(String[] args) {
		
		//Object 생성
		// new 클래스명() => 생성자
		자동차 카니발 = new 자동차();
		자동차 IG = new 자동차();	
		자동차 아벤타도르j = new 자동차();
		자동차 아반떼 = new 자동차();
		자동차 G80 = new 자동차();
		자동차 쏘렌토 = new 자동차();
		자동차 LEVEL3 = new 자동차();
		
		카니발.setPrice(78000000);
		카니발.색상 = "화이트";
		쏘렌토.색상 = "검정";
		
		//배열의 객체 생성
		자동차 포터[] = new 자동차[100]; //배열 생성
		
		for(int i=0;i<포터.length;i++) {
			포터[i] = new 자동차(); //객체 생성?
		}
		
		
		포터[0].색상 = "화이트";

		//배열의 객체생성 다른방법
		자동차 스타렉스[] = {new 자동차(),new 자동차(),new 자동차(),new 자동차()};
		스타렉스[0].색상 = "은색";
		
		
		//메소드 오버로딩.
		카니발.가속();
		카니발.가속(2);
		
		System.out.println(카니발.차종);
		
		포터[0].차종 = "상용차량";
		System.out.println(포터[0].차종); //필드에 직접 접근
		System.out.println(포터[0].get차종()); //메소드 사용
		
		
		System.out.println(포터[0].제조사);
		포터[0].set제조사("현대");
		System.out.println(포터[0].제조사);
		System.out.println(포터[0].get제조사());
		
		
		포터[0].setPrice(5000);
		System.out.println(포터[0].getPrice());
		
		//default 생성자 사용
		스포츠카 람보르기니 = new 스포츠카();
		System.out.println(람보르기니.색상);
		
		//파라미터가 있는 생성자 사용
		스포츠카 람보르기니1 = new 스포츠카("white");
		System.out.println(람보르기니1.색상);
		
		
			
	}

}
