
public class Car extends Thread {//�ٸ� Ŭ������ ��ӹ��� �� ���� �ȴ�.
		//�������̽��� Ȱ���Ͽ� ������ ����� ������ �� �ֵ��� �����Ѵ�.
		String carName;
		
		Car(String carName){
			this.carName = carName;
		}
		
		@Override
		public void run() {
			for(int i=0;i<3;i++) {
				
				try {
					Thread.sleep(1000);
					
					System.out.println(carName + "~�޸��ϴ�.");
				} catch (InterruptedException e) {
				}
			}
		}
		
		public static void main(String[] args) {
			Car car1 = new Car("$�ڵ���1");
			car1.start();
			
			Car car2 = new Car("@�ڵ���2");
			car2.start();
			
			Car car3 = new Car("*�ڵ���3");
			car3.start();
		
		}
	
}
