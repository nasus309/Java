
public class for��_��ø {

	public static void main(String[] args) {
		
		
		/**����1**/
		int i,j,count;
		
		count=0;
		
		for (i=0; i<3; i++) {
			// 1. i=0  // 8. i=1
			for(j=0;j<2;j++) {
				// 2. i=0, j=0
				// 5. i=0, j=1
				// 9. i=1, j=0
				
				count++; // 3. count=1 // 6. count=2 // 10. count=3
				System.out.printf("���� i���� %d, j���� %d, �ݺ�Ƚ���� %d\n",i,j,count);
				// 4. i=0, j=0, count=1
				// 7. i=0, j=1, count=2
				//11. i=1, j=0, count=3
				
			}
		}
		
		
		/**����2**/
		System.out.println("���� ������");
		for(i=2;i<=9;i++) {
			System.out.printf("[%d��]\n",i);
			for(j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d\n",i,i,i*j);
			}
		System.out.println();
		}
		
		
		
		System.out.println("���� ������");
		for(i=2;i<=9;i++) {
			System.out.print("["+i+"��]\t");
			}
			System.out.println();
		for(i=1;i<=9;i++) {
			for(j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
		System.out.println();
		}
		
		
		
		//debug �غ���
		int a= 10;
		int b =20;
		
		System.out.println(a);
		System.out.println(b);
		
		
		/**����3**/
		for(i=1,j=1;i<=9;i++,j++)
			System.out.println(i+"*"+j+"="+i*j);
			
	}

}
