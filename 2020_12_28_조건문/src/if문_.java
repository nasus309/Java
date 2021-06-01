
public class if문_ {

	public static void main(String[] args) {
		
		//******if문******
		int a = 99;
		
		if(a<100) 
			System.out.println("100보다 작군요");
			System.out.println("100보다 작군요");
		//if문은 블럭이 없을 경우에 한문장만 처리해준다! 왠만하면 블럭을 지정해주기.
			
		if(a<100 && a>50)
			System.out.println("입력한 값은 50-100사이의 값입니다");
		
		if(true) {
			System.out.println("참");
		}
		if(false) {
			System.out.println("거짓이니까 안보임!");
		}
		
		//******if-else문******
		System.out.println("");
		int b = 200;
		
		if (b<100) {
			System.out.println("100보다 작군요");
			System.out.println("참이면 이 문장도 보이겠죠!");
		}else {
			System.out.println("100보다 크군요");
			System.out.println("b < 100가 거짓이면 이 문장도 보이겠죠!");
		}
		
		System.out.println("끝");
	}

}

