package first;

public class CarExam2 {

	public static void main(String[] args) {
		
		
		// Car 클래스에
		/*public Car(String n) {
			name = n; }*/
		// 위에 문장 써주면 Car c1 = new Car(); --> 오류 왜 ?
		//Car 클래스에 생성자를 하나 만들어줬기 때문에... 더이상 기본생성자 사용 못함
		Car c2 = new Car("소방차");
		Car c3 = new Car("구급차");
		
		System.out.println(c2.name); // 소방차
		

	}

}
