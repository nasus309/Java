
public class SutdaCard {
	int num; //카드의 숫자(1~10사이의 정수)
	boolean isKwang; //광이면 true, 아니면 false
	
	
	SutdaCard(){
		this(1,true); //밑에 StudaCard 생성자(메소드)를 통해 생성한거임.this에 정수와 문장을 받는 생성자 찾고 호출
		/*num=1
		  isKwang = ture
		 */
	}
	
	SutdaCard(int num,boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;	
	}
	
	String info() {
		
		//return num + (isKwang ? "K":"");
		
		String s;
		if(isKwang) {
			 s= "K";
		}else {
			s = "";
		}
		
		return (num + s);
		
	}
	
	
	
}
