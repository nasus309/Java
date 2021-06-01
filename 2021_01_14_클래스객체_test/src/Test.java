
public class Test {
	public static void main(String args[]) {
		//SutdaCard
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info()); //3
		System.out.println(card2.info()); //1K
		
		//자동차
		자동차 c1 = new 자동차();
		자동차 c2 = new 자동차(50);
		System.out.println(c2.speed);
		자동차 c3 = new 자동차("black","samsung");
		System.out.println(c3.color);
		System.out.println(c3.company);
		
		
		//Student
		Student s1 = new Student();
		s1.kor = 95;
		s1.eng = 60;
		s1.math = 72;
		System.out.println(s1.getTotal());
		System.out.println(s1.getAverage());
		s1.getAverage2();
		System.out.println(s1.getAverage3());
		
		
	}

}
