
public class STRING4 {

	public static void main(String[] args) {
		
		/** toUpperCase(),toLowerCase(),trim() ���� **/
		String str = " a b c d e ";
		System.out.println(str.toUpperCase());
		
		str = str.toUpperCase();
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.trim()); //���� ������ ���� �ȵ�.
		System.out.println(str.replace(" ", "")); //���� ���� ����.
		
		String str1 ="aa";
		String str2 ="aa aaaa";
		
		System.out.println(str2.compareTo(str1)); //�ƽ�Ű�ڵ� ���� (str2-str1) �� ����̸� str2���� str1�� �տ��ִ�.
												  //���ô� 5�������µ� �ֳĸ� �񱳴� ���� �ϳ��ϳ����� �ϱ� �����̴�.aa������ �Ȱ��� " aaaa" 5���� �ٸ��ٴ¸�.
		
		System.out.println(str2.contains(str1)); // boolean ���·� ���.
	}

}
