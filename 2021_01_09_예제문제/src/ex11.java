import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// 배열 answer 에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을 찍어서 그래프를 그리는 프로그램을 작성하시오.
		// Ex.Answer = {1,3,5}
		/*
		 1 : *
		 3 : ***
		 5 : *****
		 */
		
		int count = 0;
		int answer2[] = {1,3,5,7,9};
		
		for (int i=0;i<answer2.length;i++) {
			System.out.printf("%d :",answer2[i]);
			for(int j=0;j<answer2[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//배열크기를 입력받아서 배열을 생성하고 별 찍기!
		
		int answer[];
		int 배열크기;
		Scanner s = new Scanner(System.in);
		
		System.out.println("배열 크기를 입력하세요 :");
		
		배열크기 = s.nextInt();
		
		answer = new int[배열크기];
		
		System.out.println("총" + answer.length + "크기의 배열을 만들었습니다.");
		
		for(int i=0; i <answer.length;i++) {
			System.out.print("원소를 입력하세요 : ");
			answer[i] = s.nextInt();
		}
		
		System.out.println("입력한 배열 원소 값을 기반해서 그래프를 그립니다.");
		
		for (int i=0;i<answer.length;i++) {
			if(i<10) {
				System.out.print("배열 [ "+i+"] 번지 : ");
			}else {
				System.out.print("배열 ["+i+"] 번지 : \n");
			}
			
			for(int j=0;j<answer[i];j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		
		
	}

}
