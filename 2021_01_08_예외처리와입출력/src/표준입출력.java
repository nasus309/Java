import java.io.IOException;

//IO 처리
public class 표준입출력 {
	
	public static void main(String[] args) {
	
		String ss ="skgus";
		String input = "";
		int key;
		
		
		//System.in.read(); 는 int로 받아줌!(아스키코드)
		//println, print의 차이점을 알아둬라
		

		try {
			System.out.print("ID 입력 : ");
			while((key = System.in.read())!=13) { // 받아준 int형 한글자의 아스키코드가 13(enter)이 아니면 //관계연산자가 있으면 무조건 true or false
				input = input + Character.toString((char)key); //int형 한 글자를 char로 바꾸고 그 글자를 String으로 바꿔줌
			}
			if (ss.equals(input)) {
				System.out.println(input+"님 반갑습니다!");
				//연결 확인 및 세션 등록
			}else {
				System.out.println("등록되지 않은 사용자입니다.");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
			
		
		
		/**참고
		//enter가 linefeed(10번) , 13번은 carriage return(커서를 맨앞으로...)
		//eclipse에서는 enter 치면 (10번+13번) 순서대로 진행해서 10치면 오류뜸 intellij에서는 10만해도 enter 처리 해줘서 오류 안뜸...
		//eclipse에는 carriage return(\r)을 써도 enter처리 까지 같이해주는데 intellij에서는 커서를 앞으로해서 지워버림....
		System.out.println("test\r");        
		System.out.println("hello"); 
		위 문장을 실행하면 eclipse => test  hello / intellij => hello (test 안나옴)
	
		https://huammmm1.tistory.com/376   **/
		
		
	}

}

