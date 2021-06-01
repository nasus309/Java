
public class 배열의활용 {

	public static void main(String[] args) {
		
		//배열로 스택만들기
		char stack[] = new char[5]; //0~4
		int top = 0;
		 
		stack[top] = 'A'; // top==0
		System.out.printf("%c 자동차가 터널에 들어감\n",stack[top]);
		top++; 
		System.out.printf("주차장 차량 현황 최대 %d대 가능 현재 %d대 입고\n",stack.length,top);
		
		stack[top] = 'B'; // top==1
		System.out.printf("%c 자동차가 터널에 들어감\n",stack[top]);
		top++; 
		System.out.printf("주차장 차량 현황 최대 %d대 가능 현재 %d대 입고\n",stack.length,top);
		
		stack[top] = 'C'; // top==2
		System.out.printf("%c 자동차가 터널에 들어감\n",stack[top]);
		top++; 
		System.out.printf("주차장 차량 현황 최대 %d대 가능 현재 %d대 입고\n",stack.length,top);
		
		stack[top] = 'D'; // top==3
		System.out.printf("%c 자동차가 터널에 들어감\n",stack[top]);
		top++; // top==4
		System.out.printf("주차장 차량 현황 최대 %d대 가능 현재 %d대 입고\n",stack.length,top);
		
		System.out.println();
		
		top--; // top==3
		System.out.printf("%c 자동차가 터널을 빠져나감\n",stack[top]);
		stack[top] =' ';
		
		top--; // top==2
		System.out.printf("%c 자동차가 터널을 빠져나감\n",stack[top]);
		stack[top] =' ';
		
		top--; // top==1
		System.out.printf("%c 자동차가 터널을 빠져나감\n",stack[top]);
		stack[top] =' ';
	}

}
