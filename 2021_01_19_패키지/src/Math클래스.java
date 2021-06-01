
public class Math클래스 {
	public static void main(String[] args) {
		
		Integer s[] = {9,3,7,2,5};
		Integer maxVal,minVal;
		int i,j;
		
		System.out.print("정렬 전==> ");
		for(i=0;i<5;i++) {
			System.out.print(s[i]+" ");
		}
		
		System.out.println();
		
		for(i=0;i<4;i++) {
			for(j=i;j<5;j++) {
				maxVal = Math.max(s[i],s[j]);
				minVal = Math.min(s[i],s[j]);
				s[i] = minVal;
				s[j] = maxVal;
			}
		}
			
		System.out.print("정렬 후==> ");
			
		for(i=0;i<5;i++) {
			System.out.print(s[i]+ " ");
		}
		
	}

}
