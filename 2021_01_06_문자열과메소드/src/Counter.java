class Updater {
	public void update(Counter counter) {
		counter.count++;
	}
}


public class Counter {
	int count=0;
	
	public static void main(String[] args) {
	
		Counter myCounter = new Counter(); //여기서 바로 heap에 0 이 생기나?
		System.out.println("before update:"+myCounter.count);
		
		Updater myUpdater = new Updater();
		
		myUpdater.update(myCounter); // update 메서드에 리턴값이 있으면 System.out.prinlnt(myUpdater.update(myCounter)) 해주면 1임?
		
		System.out.println("after update:"+myCounter.count);

	}

}
