import java.util.Scanner;
public class STRING3 {

	public static void main(String[] args) {
		
		/** replace ���� **/
		String str1 = "���� �������. ���� ����";
		String str2 = str1.replace("����", "�ʴ�");
		System.out.println(str2);
		
		System.out.println("���� �ñ��ϴ�. ���� ����".replace("����", "�ʴ�"));
		
		
		/** substring() ���� **/
		str1 = "���� �����̴�.";
		
		System.out.println(str1.substring(3)); // index 3���� ������ ���. (�տ� 3��° ���ڱ��� �߸��� ������ ���)
		System.out.println(str1.substring(3,5)); // �� 5��°������ ���ڿ� �߿� index 3���� ���. (5��° ���ڱ��� �߿� 3��°���ڱ��� �߶��!)
		
		
		/** split() ���� **/
		str1 = "���� �����̴�.�ݰ���.";
		String str3[];
		str3 = str1.split("\\.");  //���� "���ڿ�" �ϸ� �Ǵµ� ������ Ư�����ڶ� "\\."��� ����. �������÷� �������ַ��� "\\\\"���ָ� ��.
		for (int i=0;i<str3.length;i++) {
			System.out.println("["+i+"]"+"\t"+str3[i]+"\t");
		
		}
		
//		for(String x : str3) {
//			System.out.println(x);
//		}
		
		Scanner s = new Scanner(System.in);
		String str, strRep, strSub, strAry[];
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str = s.nextLine();
		
		strRep = str.replace(" ", "$"); 
		strSub = str.substring(3,8); // �Է¹��ڿ��� ����°���� ���� ��° ���ڸ� ����.
		strAry = str.split(" ");
		
		System.out.println("�Է� ���ڿ� ==>" + str);
		System.out.println("�ٲ� ���ڿ� ==>" + strRep);
		System.out.println("�Ϻ� ���ڿ� ==>" + strSub);
		for(int i=0;i<strAry.length;i++) {
			System.out.println("�и��� ���ڿ�" + i + "==>" + strAry[i]);
		}
		
		

	}

}
