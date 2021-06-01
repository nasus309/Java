
public class problem4 {

	public static void main(String[] args) {
		
		//제어문을 활용하여 방정식의 모든 양의 해를 구하시오.
		// 2x + 4y = 10의 해 구하기.
		
		System.out.println("2x + 4y = 10 방정식의 양의 해를 구하는 프로그램입니다.");
		int x;
		int y;
		for(x=0;x<=5;x++) { // x=0
			for(y=0;y<=2;y++) { 
				//1 step (x=0) y=0 안맞음 y=1 안맞음 y=2 안맞음 x에 1이 들어가야함
				//2 step (x=1) y=0 안맞음 y=1 안맞음 y=2 맞음!
				//3 step (x=2) y=0
				if ((2*x)+(4*y)==10) {
					System.out.printf("x = %d, y =%d\n",x,y);
				}
			}	
		}
		//범위가 -10~10 일때
		for(x=-10;x<=10;x++) {
			for(y=-10;y<=10;y++) { 
				if ((2*x)+(4*y)==10) {
					System.out.printf("x = %d, y =%d\n",x,y);
				}		
			}
		}
	}

}
