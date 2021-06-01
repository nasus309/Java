
public class 예외처리 {
	
	static void xxxx(Exception c) {}
	
	
	public static void main(String[] args) {
		
		int a[][] = new int[4][5];
		String ss = "안녕하세요";
		a[3][4] = 100;
		Exception c = new Exception(); //사용자 정의 클래스가 아닌, 라이브러리 클래스(API)
		xxxx(c); //call by ref
		
		int 연봉,인센티브;
		
		연봉 = 50000000;
		//인센티브는 연봉의 0.2 
		
		try {
			인센티브 = (int)(연봉*0.002); //Logic 오류 -> 원래는 0.2를 곱해야는데 프로그램을 잘 못 짰음..
			System.out.printf("연봉 : %d, 인센티브 : %d\n",연봉,인센티브);
			
		}catch (Exception 오류) {
			오류.printStackTrace(); //어떤 오류가 일어났는지 정보를 보고싶다.
		}
		
		int aa[] = new int[3];
		try {
			aa[3] = 100;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자가 배열 크기보다 커요");
		}
		
		try {
			aa[2] = 100 / 0; //여기서 오류가 나서 여기까지만 실행하고 try구문은 넘어감.
			aa[3] = 100;
		}catch(ArithmeticException e) {
			System.out.println("산술오류가 발생했습니다. 0으로 나누는 등의 오류입니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 범위 오류가 발생했습니다. 배열 첨자가 배열 크기보다 커요.");
		}catch(Exception e) { //Exception 오류(logic 오류빼고 다 잡아줌)는 맨마지막에 써줘야함.
			System.out.println("뭔지는 몰라도 오류가 발생했습니다.");
			e.printStackTrace(); //이거 걸어주면 오류 발생 메세지 띄워줌~
		}finally { //오류여부에 관계없이 무조건 실행됨.
			System.out.println("프로그램이 종료됩니다.");
		}
		
		int x =100, y=0;
		int result;
		
		try {
			result = x/y;
		}catch(ArithmeticException e) {
			System.out.print("발생 오류==> ");
			System.out.println(e.getMessage());
		}
		
		//오류메세지 직접 만들기
		
		x = 100;
		y = 0;
		
		try {
			if(y==0)
				throw new Exception("0으로 나누려고요? 안됩니다.");
			result = x/y;
		}catch (Exception e) {
			System.out.print("발생 오류==> ");
			System.out.println(e.getMessage());
		}
		
		
		
		
		

	}
	
	
}
