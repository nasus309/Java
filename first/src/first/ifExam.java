package first;

public class ifExam {

	public static void main(String[] args) {
		
		int x = 50; //초기화
		int y = 50;
		
		if (x<y) {
			System.out.println("x는 y보다 작습니다.");
			System.out.println("test");
		}
		
		
		//if 블럭({})이 없으면 한줄만 실행
		//그래서 조건 안맞아도 밑에꺼 test는 if에 포함안돼서 출력됨.
		if (x < y)
			System.out.println("x는 y보다 작습니다.");
			System.out.println("test");
			
		if (x==y) {
			System.out.println("x는 y와 같습니다");
		}else if (x<y){
			System.out.println("x는 y보다 작습니다");
		}else {
			System.out.println("x는 y와 다릅니다");
		}
			
			

	}

}
