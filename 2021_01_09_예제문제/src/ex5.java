
public class ex5 {
	public static void main(String[] args) {
		//두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램
		
		int first;
		int second;
		int j = 0;
		int i =0;
		int count =0;
		
		//내가한거
		for (i=1;i<6;i++) {
			j = 6 - i;
			System.out.printf("(%d,%d)\n",i,j);
			}
		
		
		for(i=1;i<7;i++)
			for(j=1;j<=6;j++) {
				count++;
				if(i+j==6){
					System.out.println(i + "+" + j + "=" + (i+j));
					break; //break해주면 count수 줄어듬 => i+j == 6 를 만족하면 두번째 for문을 빠져 나가기때문?
				}
			}
		System.out.println(count);
	}
}
