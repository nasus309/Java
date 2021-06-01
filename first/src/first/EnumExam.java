package first;

public class EnumExam {
	
	//열겨형이 등장하기전에는 final을 이용
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		String gender1;
		// static한 필드는 객체를 생성하지(new) 않고도 사용 가능!
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
		
		//gender1에 MALE이나 FEMALE만 들어가게 하고싶은데...
		// => 열거형 사용
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		//gender2 = "boy"; => error 뜸!
	
	}
}

enum Gender{
	MALE, FEMALE;
}
