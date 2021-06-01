
public class 가전제품 {

	private int 가격;
	int 생산년도;
	int 에너지효율등급;
	String 브랜드;
	String 모델;
	Boolean 전원;
	
	//생성자
	public 가전제품() {} 
	
	public 가전제품(int year) {
		생산년도 = year;
	}
	
	int get가격() {
		return 가격;
	}
	
	void set가격(int 가격) {
		this.가격 = 가격;
	}
	
	int get생산년도() {
		return 생산년도;
	}
	
	void set생산년도(int year) {
		생산년도 = year;
	}
	
	String get브랜드() {
		return 브랜드;
	}
	
	void set브랜드(String 브랜드) {
		this.브랜드 = 브랜드;
	}
	
	boolean get전원() {
		return 전원;
	}
	
	void set전원(boolean 전원) {
		this.전원 = 전원;
	}
	
	//메소드
	public void 켜다() {
		전원 = true;
	}
	
	public void 끄다() {
		전원 = false;
	}
	
	public void 메뉴실행() {
		if(전원) {
			System.out.println("메뉴를 실행합니다.");
		}else {
			System.out.println("전원이 꺼져있습니다. 전원부터 켜주세요.");
		}
	}
}
