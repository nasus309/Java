import java.io.IOException;

//IO ó��
public class ǥ������� {
	
	public static void main(String[] args) {
	
		String ss ="skgus";
		String input = "";
		int key;
		
		
		//System.in.read(); �� int�� �޾���!(�ƽ�Ű�ڵ�)
		//println, print�� �������� �˾Ƶֶ�
		

		try {
			System.out.print("ID �Է� : ");
			while((key = System.in.read())!=13) { // �޾��� int�� �ѱ����� �ƽ�Ű�ڵ尡 13(enter)�� �ƴϸ� //���迬���ڰ� ������ ������ true or false
				input = input + Character.toString((char)key); //int�� �� ���ڸ� char�� �ٲٰ� �� ���ڸ� String���� �ٲ���
			}
			if (ss.equals(input)) {
				System.out.println(input+"�� �ݰ����ϴ�!");
				//���� Ȯ�� �� ���� ���
			}else {
				System.out.println("��ϵ��� ���� ������Դϴ�.");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
			
		
		
		/**����
		//enter�� linefeed(10��) , 13���� carriage return(Ŀ���� �Ǿ�����...)
		//eclipse������ enter ġ�� (10��+13��) ������� �����ؼ� 10ġ�� ������ intellij������ 10���ص� enter ó�� ���༭ ���� �ȶ�...
		//eclipse���� carriage return(\r)�� �ᵵ enteró�� ���� �������ִµ� intellij������ Ŀ���� �������ؼ� ��������....
		System.out.println("test\r");        
		System.out.println("hello"); 
		�� ������ �����ϸ� eclipse => test  hello / intellij => hello (test �ȳ���)
	
		https://huammmm1.tistory.com/376   **/
		
		
	}

}

