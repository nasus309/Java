class Car2{
		String carName;
	}

public class Truck extends Car2 implements Runnable {
	
	//public synchronized void withDraw...? synchronized ���ϴ°�...?
	
	
	Truck(String carName){
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
		Truck car1 = new Truck("Ʈ��1");
		Thread truck1 = new Thread(car1);
		truck1.start();
		
		Truck car2 = new Truck("Ʈ��2");
		Thread truck2 = new Thread(car2);
		truck2.start();
		
		Truck car3 = new Truck("Ʈ��3");
		Thread truck3 = new Thread(car3);
		truck3.start();
	}
	
	

}
