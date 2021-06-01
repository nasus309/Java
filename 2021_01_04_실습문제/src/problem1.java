
public class problem1 {

	public static void main(String[] args) {
		//다음 문장들을 실행 해 보시오.
		
		System.out.println("1"+"2"); //문장 취급 12
		System.out.println(true+""); //문장 취급(""때문에) true
		System.out.println('A'+'B'); //문자 취급 (내부적으로 정수 처리)
		System.out.println('1'+2);  //문자 취급
		System.out.println('1'+'2'); //문자 취급 (내부적으로 정수 처리)
		System.out.println('J'+"ava"); //문장 취급 Java
		//System.out.println(true+null); boolean과 null은 사칙연산 x

	}

}
