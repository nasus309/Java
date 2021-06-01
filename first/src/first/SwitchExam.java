package first;

public class SwitchExam {

	public static void main(String[] args) {
		//switch, case, default, break
		//case는 만난 case부터 나머지를 모두 출력.
		//조건에 해당하는 값만 출력하려면 break와 함께 써줌.
		
		int value = 1;
		
		switch(value) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default :
				System.out.println("그 외 다른 숫자");
		}
		
		
		String str = "A";
		switch(str) {
			case "A":
				System.out.println("A");
				break;
			case "B":
				System.out.println("B");
		}
		

	}

}
