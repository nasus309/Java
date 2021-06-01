
public class STRING4 {

	public static void main(String[] args) {
		
		/** toUpperCase(),toLowerCase(),trim() 예제 **/
		String str = " a b c d e ";
		System.out.println(str.toUpperCase());
		
		str = str.toUpperCase();
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.trim()); //내부 공백은 제거 안됨.
		System.out.println(str.replace(" ", "")); //공백 전부 제거.
		
		String str1 ="aa";
		String str2 ="aa aaaa";
		
		System.out.println(str2.compareTo(str1)); //아스키코드 기준 (str2-str1) 가 양수이면 str2기준 str1이 앞에있다.
												  //예시는 5가나오는데 왜냐면 비교는 문자 하나하나별로 하기 때문이다.aa까지는 똑같고 " aaaa" 5개가 다르다는말.
		
		System.out.println(str2.contains(str1)); // boolean 형태로 출력.
	}

}
