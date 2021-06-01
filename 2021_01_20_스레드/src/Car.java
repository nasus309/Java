
public class Car extends Thread {//다른 클래스를 상속받을 수 없게 된다.
		//인터페이스를 활용하여 쓰레드 기능을 수행할 수 있도록 지원한다.
		String carName;
		
		Car(String carName){
			this.carName = carName;
		}
		
		@Override
		public void run() {
			for(int i=0;i<3;i++) {
				
				try {
					Thread.sleep(1000);
					
					System.out.println(carName + "~달립니다.");
				} catch (InterruptedException e) {
				}
			}
		}
		
		public static void main(String[] args) {
			Car car1 = new Car("$자동차1");
			car1.start();
			
			Car car2 = new Car("@자동차2");
			car2.start();
			
			Car car3 = new Car("*자동차3");
			car3.start();
		
		}
	
}
