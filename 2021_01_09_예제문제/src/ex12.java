import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// 단어의 글자 위치를 섞어서 보여주고 원래의 단어를 맞추는 프로그램을 구현하시오.
		// 배열을 통해 여러문장을 저장하고 배열의 끝까지 문제를 계속 제출함.
		/**
		 다음의 원래 글자는 무엇일까요? ovle => lveo
		 틀렸습니다. 다시 입력하세요 => love
		 맞았습니다.
		 **/
		
		//String => 문자열 => 문자배열 => char[]
		
		
		String str ="hello";
		str.toCharArray();
		
		Scanner s = new Scanner(System.in);
		String ss;
		String Q[] = {"hello","class","method","object"};
		//Q[0]="hello"
		//Q[1]="class"
		//Q[2]="method"
		//Q[3]="object"
		
		for(int i=0;i<Q.length;i++) {
			char[] question =Q[i].toCharArray(); // 1.hello 2.class ..... 
			//앞에오는 문장을 char[] 배열로 쪼개준다 
			//question[0] = 'h'
			//question[1] = 'e'
			//question[2] = 'l'
			//question[3] = 'l'
			//question[4] = 'o'
			
			for(int j =0;j<question.length;j++) {
				int idx = (int)(Math.random()*question.length); //계산값은 0,1,2,3,4 가 나옴...
				// 1. 0.4351656 * 5 = 2.xxxxx => idx =2
				// 2. 0.189 * 5 = 0.xxx => idx =0
				char tmp = question[i];
				//1. tmp = 'h' 2.tmp ='l'
				question[i] = question[idx];
				//1. question[0] = 'l' 2.question[0] = 'l'
				question[idx] = tmp;
				//1. question[2] = 'h' 2.question[0] = 'l'
	
				//끝나고 다시 반복할 때 j가 바뀌면서 random값이 바껴 다시 섞어주게 된다..
			}
			
			System.out.print("다음의 원래 글자는 무엇일까요? ");
				//글자 섞였나 확인코드.
			for(int k=0;k<question.length;k++) {
				System.out.print(question[k]);
			}
				
			System.out.print(" => ");
			
			
			while(true) {
				ss=s.nextLine();
				
				if(Q[i].equals(ss)) {
					System.out.println("맞았습니다.");
					break;
				}else {
					System.out.print("틀렸습니다. ");
					System.out.print("다음의 원래 글자는 무엇일까요? ");
				}
			}
		}
		
		System.out.println("모든 문제를 풀었습니다.");

	}

}
