
public class ex5 {
	public static void main(String[] args) {
		//�ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷�
		
		int first;
		int second;
		int j = 0;
		int i =0;
		int count =0;
		
		//�����Ѱ�
		for (i=1;i<6;i++) {
			j = 6 - i;
			System.out.printf("(%d,%d)\n",i,j);
			}
		
		
		for(i=1;i<7;i++)
			for(j=1;j<=6;j++) {
				count++;
				if(i+j==6){
					System.out.println(i + "+" + j + "=" + (i+j));
					break; //break���ָ� count�� �پ�� => i+j == 6 �� �����ϸ� �ι�° for���� ���� �����⶧��?
				}
			}
		System.out.println(count);
	}
}
