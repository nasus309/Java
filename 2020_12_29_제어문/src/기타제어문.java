
public class ��Ÿ��� {

	public static void main(String[] args) {
		
//		int n =(int)(Math.random()*100); //0~1������ �Ǽ� ���� *100 �� ���� int�� �߶󳻴ϱ� 1~100������ ������ ������ ����.		
//		System.out.println(n);
		
		
		
		int hap = 0;
		int i;
		

		/**����1**/
		//continue
		/**
		for(i=1;i <=100;i++) {
			if(i%3==0)
				continue;
			
			hap = hap + i;
		}
		
		System.out.println("1~100������ ��(3�ǹ� ������) :"+hap);
		**/

		
		
		/**����2**/
		//break myLabel; --> myLabel �ݺ����� ����.(label��ġ ���)
		������;�:for(;;) {
			for(i=1;i <=100;i++) {
				hap += 1;
				if(hap>2000) {
					System.out.printf("%d\n",hap);
					hap=0;
					break ������;�;
				}
			}
			
		}
		
		
		/**����3**/
		for(;;) {
			for(i=1;i <=100;i++) {
				hap += 1;
				if(hap>2000) {
					System.out.printf("%d\n",hap);
					hap=0;
					return;
				
				}
			}
			
		}
	}

}



/*
  return --> ���� ȣ���ߴ� ������ �ǵ��� ���ڴ�! �޼ҵ带 �����ϰ� ���ư�?
  
  main(){
  
  	������ ����(){
  		������ ����(){
  			return;
  		}
  		����� ����
  		return;
  	}
  	����� ����
  	return;
  }
  
 */
