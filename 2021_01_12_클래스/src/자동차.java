
public class 자동차 {
	int 연식; 
	double 연비;
	String 색상;
	String 제조사;
	String 차종;
	String 모델;
	private int price; //information hide...? 정보 은닉
	int 속도;
	
	String get차종() { // 프로그래머 사이에서 get이 앞에 붙어있으면 필드에 접근해서 데이터를 읽어오는 것으로 인지.(getXXX())
		return 차종;
	}
	
	public void setPrice(int 가격) { // 프로그래머 사이에서 set이 앞에 붙어있으면 필드에 접근해서 데이터를 쓰는 것으로 인지.(setXXX())
		//price가 private 변수라 변수.price 식으로 필드에 직접 접근 불가능인데
		//메소드를 통해서는 접근 가능하게 해준다! (변수.setPrice();)
		this.price = 가격;
	}
	
	int getPrice() { 
		return price;
	}
	
	
	String get제조사() {
		return 제조사;
	}
	
	public void set제조사(String 제조사) {
		this.제조사 = 제조사;
	}
	
	int get속도() {
		return 속도;
	}
	
	public void set속도(int 속도) {
		this.속도 = 속도;
	}
	
	void set색상(String 색상) {
		this.색상 = 색상;
	}
	
	String get색상() {
		return 색상;
	}
	
	void set모델(String 모델) {
		this.모델 = 모델;
	}
	
	String get모델() {
		return 모델;
	}
	
	public void 가속() {
		속도 = 속도 + 10;
	}
	
	public void 가속(int value) {
		속도 = 속도 + value;
	}
	
	
	public void 감속() {
		if(속도<=0) {
			속도 = 0;
		}else {
			속도 = 속도 - 10;
		}
	}
	
	public void 네비게이션켜기() {
		
	}
		
}
