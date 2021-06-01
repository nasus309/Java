import java.util.Scanner;
public class STRING3 {

	public static void main(String[] args) {
		
		/** replace 예제 **/
		String str1 = "나는 배고프다. 나는 나는";
		String str2 = str1.replace("나는", "너는");
		System.out.println(str2);
		
		System.out.println("나는 궁금하다. 나는 나는".replace("나는", "너는"));
		
		
		/** substring() 예제 **/
		str1 = "나는 나현이다.";
		
		System.out.println(str1.substring(3)); // index 3부터 끝까지 출력. (앞에 3번째 글자까지 잘르고 끝까지 출력)
		System.out.println(str1.substring(3,5)); // 총 5번째까지의 문자열 중에 index 3부터 출력. (5번째 글자까지 중에 3번째글자까지 잘라라!)
		
		
		/** split() 예제 **/
		str1 = "나는 나현이다.반갑다.";
		String str3[];
		str3 = str1.split("\\.");  //원래 "문자열" 하면 되는데 온점은 특수문자라 "\\."라고 해줌. 역슬래시로 구분해주려면 "\\\\"해주면 됨.
		for (int i=0;i<str3.length;i++) {
			System.out.println("["+i+"]"+"\t"+str3[i]+"\t");
		
		}
		
//		for(String x : str3) {
//			System.out.println(x);
//		}
		
		Scanner s = new Scanner(System.in);
		String str, strRep, strSub, strAry[];
		
		System.out.print("문자열을 입력하세요 : ");
		str = s.nextLine();
		
		strRep = str.replace(" ", "$"); 
		strSub = str.substring(3,8); // 입력문자열의 세번째부터 여덟 번째 문자를 추출.
		strAry = str.split(" ");
		
		System.out.println("입력 문자열 ==>" + str);
		System.out.println("바꾼 문자열 ==>" + strRep);
		System.out.println("일부 문자열 ==>" + strSub);
		for(int i=0;i<strAry.length;i++) {
			System.out.println("분리한 문자열" + i + "==>" + strAry[i]);
		}
		
		

	}

}
