
public class 기타제어문 {

	public static void main(String[] args) {
		
//		int n =(int)(Math.random()*100); //0~1사이의 실수 값에 *100 한 것을 int로 잘라내니까 1~100사이의 랜덤한 정수가 나옴.		
//		System.out.println(n);
		
		
		
		int hap = 0;
		int i;
		

		/**예제1**/
		//continue
		/**
		for(i=1;i <=100;i++) {
			if(i%3==0)
				continue;
			
			hap = hap + i;
		}
		
		System.out.println("1~100까지의 합(3의배 수제외) :"+hap);
		**/

		
		
		/**예제2**/
		//break myLabel; --> myLabel 반복문을 나감.(label위치 사용)
		나가고싶어:for(;;) {
			for(i=1;i <=100;i++) {
				hap += 1;
				if(hap>2000) {
					System.out.printf("%d\n",hap);
					hap=0;
					break 나가고싶어;
				}
			}
			
		}
		
		
		/**예제3**/
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
  return --> 나를 호출했던 곳으로 되돌아 가겠다! 메소드를 종료하고 돌아감?
  
  main(){
  
  	데이터 수집(){
  		데이터 정제(){
  			return;
  		}
  		여기로 도달
  		return;
  	}
  	여기로 도달
  	return;
  }
  
 */
