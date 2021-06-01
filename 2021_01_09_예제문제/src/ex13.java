import java.util.Scanner;

public class ex13 {
	
	static double getDistance(int x1,int y1,int x2,int y2) {
		
		return Math.sqrt((x2-x1)*(x2-x1) +(y2-y1)*(y2-y1) );
	}

	public static void main(String[] args) {
		// 두점 거리를 계산하는 getDistance() 메소드를 구현하시오.
		// 제곱근 계산은 Math.sqrt(double a)를 사용.
		
		Scanner s = new Scanner(System.in);
		int x1;
		int y1;
		int x2;
		int y2;
		double result;
		
		System.out.print("첫번째 점 : ");
		x1 = Integer.parseInt(s.next());
		y1 = Integer.parseInt(s.next());
		System.out.print("두번째 점 : ");
		x2 = Integer.parseInt(s.next());
		y2 = Integer.parseInt(s.next());
		
	
		/*System.out.print("x1 좌표를 입력하세요 : ");
		x1 = s.nextInt();
		System.out.print("y1 좌표를 입력하세요 : ");
		y1 = s.nextInt();
		System.out.print("x2 좌표를 입력하세요 : ");
		x2 = s.nextInt();
		System.out.print("x2 좌표를 입력하세요 : ");
		y2 = s.nextInt();*/
		
		result = getDistance(x1,y1,x2,y2);
		
		System.out.printf("(%d,%d)와 (%d,%d)의 거리는 %f 입니다.",x1,y1,x2,y2,result);
		
		
		

	}

}
