
public class for��_ {
	public static void main(String[] args) {
		
		
		/**����1**/
		int i; //��������
		for (i=0; i<5;i++) {
			System.out.printf("�ȳ��ϼ���. %dȸ �ݺ�.\n",i);
		}
		System.out.println(i); // 5��
	
		
		/**����2**/
		//i=1(�ʱ�ȭ) �����ָ� ��� �޶���.
		for (i=1;i<=100;i++) {
			System.out.printf("%d ",i);
			if (i>11)
				break; // 12���� �����.
		}
		System.out.printf("%d ",i); 
		System.out.println("");
		
		
		/**����3**/
		// 1~5������ �� ���ϱ�.
		int sum = 0;
		for (i=1;i<=5;i++) {
			sum = sum + i;
		}
		System.out.printf("1���� 5������ ���� %d�Դϴ�.\n",sum);
		
		
		/**����4**/
		//500~1000������ Ȧ������ ��.
		int hap = 0;
		for (i=501;i<=1000;i=i+2) {
			hap += i;
		}
		
		System.out.println("500���� 1000������ Ȧ���� �� : "+hap);
		/*�ٸ����
		 for (i=500; i<=1000; i++){
		 	if(i%2==1){
		 		hap = hap+i;
		 	}
		 }*/
		
		
		/**����4**/
		i=0;
		for(;;) {
			System.out.println(i);
			i++;
			if (i>10)
				break;
		}
		
	}

}
