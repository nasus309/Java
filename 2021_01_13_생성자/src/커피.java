
public class 커피 {
	private String 원산지; //인스턴스변수
	private String 종류; //인스턴스변수
	private int 가격; //인스턴스변수
	private static int 판매수량; //클래스변수(static변수), 인스턴스의 변수가 아니고 클래스의 변수가 되는거임~
	
	//메소드 오버로딩
	public 커피() {}
	public 커피(String s) {
		원산지 = s;
	}
	public 커피(String s,String ss) {
		//위에 메소드와 구분해주기위해 String ss를 파라미터로 써주지만 실제로는 안씀.
	}
	
	//static 메소드 -> 인스턴스가지고 호출 불가능.클래스단위로만 호출 가능...?
	static void 커피수량() {
		System.out.println("아직 재고 파악 안됐음.");
	}
	
	
	public void 내린다() {
		System.out.println("커피가 내려집니다.");
	}
	public void 볶는다() {
		System.out.println("원두를 볶습니다.");
	}
	
	public void set원산지(String 원산지) {
		this.원산지 = 원산지;
	}
	String get원산지() {
		return 원산지;
	}
	
	public void set종류(String 종류) {
		this.종류 = 종류;
	}
	
	public String get종류() {
		return 종류;
	}
	
	public void get가격(int 가격) {
		this.가격 = 가격;
	}
	
	public int get판매수량() {
		return 판매수량;
	}
	
	public void get판매수량(int 판매수량) {
		this.판매수량 = 판매수량;
	}
}
