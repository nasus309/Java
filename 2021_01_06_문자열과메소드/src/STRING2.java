import java.util.Scanner;
public class STRING2 {

	public static void main(String[] args) {
		
		/**indexOf(),lastIndexOf() ��� ����**/
		String ss = "Java�� �����ϴ� ��, Java�� ��վ��.^^";
		System.out.println("���ڿ� ==>" + ss);
		
		System.out.print("���� ó�� ������ Java ��ġ ==> ");
		System.out.println(ss.indexOf("Java"));
		System.out.print("�������� ������ Java ��ġ ==> ");
		System.out.println(ss.lastIndexOf("Java"));
		
		
		
		/**startsWith(),endsWith() ��� ����**/
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ� �Է� : ");
		str = s.nextLine();
		
		System.out.print("��� ���ڿ� : ");
		
		if (!str.startsWith("("))
			System.out.printf("(");	
		
		for (int i=0;i<str.length();i++)                //System.out.print(str); �ص���.
			System.out.printf("%c",str.charAt(i));
		
		if (!str.endsWith(")"))
			System.out.printf(")");
		
		System.out.println(str.indexOf("ll"));  //hello ���� �� ��ȣ �� �ε��� ����. �� 2�� ����. �׷� ��� ��ȣ ����? �ؿ� ����.
		
		
		
        /**��ȣ ������ �ε��� ���ϱ�**/		
/*		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ� �Է� : ");
		str = s.nextLine();
		
		System.out.print("��� ���ڿ� : ");
		
		if (!str.startsWith("("))	
			str = "(" + str;		

		if (!str.endsWith(")"))
			str = str + ")";
		
		System.out.println(str);
		System.out.println(str.indexOf("ll"));
*/
		
	}

}
