class INT{
	int aa[] = new int[10];
}

public class �迭������2 {

	public static void main(String[] args) {
		
		/**���߿� �ҰŴ� ���� �ض� 
		 * �迭���� �迭**/
		INT x[] = new INT[5];
		x[0] = new INT();
		x[1] = new INT();
		x[0].aa[0] =100;
		
		
		/**����4**/
		int aa[]= {100,200,300,400};
		int bb[] = new int[] {100,200,300};
		
		int cc[];
		cc = new int[] {100,200};
		int[] dd = new int[1];
		dd[0] = 100;
		int i;
		
		for(i=0;i<4;i++)
			System.out.printf("aa[%d] ==>%d\t",i,aa[i]);
		System.out.println();
		
		for(i=0;i<3;i++)
			System.out.printf("bb[%d] ==>%d\t",i,bb[i]);
		System.out.println();
		
		for(i=0;i<2;i++)
			System.out.printf("cc[%d] ==>%d\t",i,cc[i]);
		System.out.println();
		
		for(i=0;i<1;i++)
			System.out.printf("dd"+ "[%d] ==>%d\t",i,dd[i]);
		System.out.println();
				
		
		
		
		/**����5**/
		//int aa[]= {100,200,300,400};
		//int cc[]= {100,200};
		cc = aa; //aa�迭�� �ּҸ� �״�� ������! aa�迭�� ���� �ٲ�� ���� cc�迭�� ���� �ٲ�� ��!(�ּҴ� �״��)
		for(i=0;i<cc.length;i++) {
			System.out.println(cc[i]);
			cc[i] = cc[i]+100;
		}		
		
		for(i=0;i<aa.length;i++) {
			System.out.println(aa[i]);
			aa[i] = aa[i]+100;
		}
		
		for(i=0;i<cc.length;i++) {
			System.out.println(cc[i]);
			cc[i] = cc[i]+100;
		}		
		
		
		/**����6**/
		//*****���������� ���ʺ����� ������ �Ѵ� ������ �ִ�? String****//
		String ss ="�ȳ�";
		String sss = "�ݰ�";
		System.out.println(ss); //�ȳ�
		System.out.println(System.identityHashCode(ss)); //816
		System.out.println(System.identityHashCode(sss)); //182
		ss=sss;
		System.out.println(ss); //�ݰ�
		System.out.println(System.identityHashCode(ss)); //182
		System.out.println(System.identityHashCode(sss)); //182
		sss="��������";
		System.out.println(System.identityHashCode(ss)); //182
		System.out.println(System.identityHashCode(sss)); //145 => sss�� �ּҰ� �ٲ�����~
		System.out.println(ss); //�ݰ� --> ��? int�� �ٸ��� heap������ ������ �ٸ� ���ο� �ּҿ� data�� ��������.
		
		
		
		
		/**����7**/
		int aaa[] = new int[100]; //2�� ���
		int bbb[] = new int[100]; //2�� ��� ����.
		//int i;
		
		//2�ǹ��
		for(i=0;i<aaa.length;i++) {
			aaa[i] = i * 2;
			System.out.printf("%d\t",aaa[i]);
		}		
		System.out.println();
		
		//2�� ��� ����
		for(i=0;i<aaa.length;i++) {
			bbb[i] = aaa[99-i];
			System.out.printf("%d\t",bbb[i]);
		}
		System.out.println();
		//�Ǵٸ����
		for(i=99;i>=0;i--) {
			bbb[i] = aaa[99-i];
			System.out.printf("%d\t",aaa[i]);
		}
		System.out.println();
		

		/**����8**/
		int ccc[] = {10,20,30,40,50};
		int count,size;
		
		count = dd.length;            //�迭 ����� ������ ����Ѵ�.
		size = count * Integer.BYTES; //�迭 ��ü ũ��(����Ʈ)�� ����Ѵ�.
		
		System.out.printf("�迭 ccc[]�� ����� ������ %d�� �Դϴ�.\n",count);
		System.out.printf("�迭 ccc[]�� ����� ��ü ũ��� %d ����Ʈ�Դϴ�.\n",size);
		
		
		/**����**/
		/*
		 int = Integer // Wrapper class -> ���� �ڷ����� Objectȭ �ߴ�.
		 char = Character
		 double = Double
		 float = Float
		 short = Short
		 long = Long
		 boolean = Boolean
		 byte = Byte
		 */
		
		Double a = 10.0; //class
		double b = 20.0; //�׳� ���� �ڷ���.���������� �ٲٰ�ʹ�~ �� �� Wrapper class ��� ����~
		
		String str = "�ȳ��ϼ��� ~~~~~~"; //12����
		String ddd[] = new String[100];
		int count1 = 0;
		count1 = str.length(); //str ������ ���� ����
		System.out.println(count1 * Character.BYTES); // str������ byte,Wrapper class
		count1 = ddd.length; //�迭�� index ����
		System.out.println(count1);
		
		System.out.println(Character.BYTES); //2
		System.out.println(Long.BYTES);		 //8
		System.out.println(Integer.BYTES);	 //4
		System.out.println(Double.BYTES);	 //8
		
		//Wrapper class
		Double y[] = new Double[100];
		y[0] = 10.0;
		
		

	}

}
