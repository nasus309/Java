import java.util.Scanner;

//�̰� class METHOD ���� �� ���� �ȵ���?
class �ؾ {
	int n ;
	static void ������(){  // �޼ҵ� ����
		System.out.println("�ؾ�� �����ϴ�.");
	}
}

public class METHOD {
	
	
	
	static int coffee_machine(int button) { 	//method�� �տ� int ������ ��ȯ�� �ؾ���(return Ÿ���� int)! �޼ҵ� ����.
												//�޼ҵ带 ���� �� �� �ԷµǴ� ��Ḧ �����ϸ� �̴� parameter(��������). --> button
			
			System.out.println("1.�߰ſ� ���� �غ��Ѵ�.");
			System.out.println("2.�������� �غ��Ѵ�.");
			
			switch(button) {
			case 1:
				System.out.println("3.����Ŀ�Ǹ� ź��."); break;
			case 2:
				System.out.println("3.����Ŀ�Ǹ� ź��."); break;
			case 3:
				System.out.println("3.��Ŀ�Ǹ� ź��."); break;
			default:
				System.out.println("3.�ƹ��ų� ź��."); break;
				
			}
			
			System.out.println("4.���� �״´�.");
			System.out.println("5.��Ǭ���� ��� ���δ�.");
			
			return 0; //�޼ҵ带 ȣ���� ������ ���ư��ڴ�.
			
			
			
	}
	

	public static void main(String[] args) { //���α׷��� ������ main���� ����!!!!!!
		
		Scanner s = new Scanner(System.in); //scanner object�� ���� �� �ִ� s ����.
		int coffee;
		int ret;
		
		System.out.println("� Ŀ�� �帱���? (1:����, 2:����, 3:��) ");
		coffee = s.nextInt();
		
		// �޼ҵ� ȣ��.(�����δ� ���� �޼ҵ�� ���� --> ���α׷��� �帧�� �޼ҵ带���� coffee���ڸ� ��� �޼ҵ� ��ġ�ΰ�!)
		// �޼ҵ带 ȣ�� �� �� ����ϴ� ���� argument(������) ��� �Ѵ�.
		ret = coffee_machine(coffee); 
		//System.out.println(ret); //0 ���
		//System.out.println(coffee_machine(coffee)); //return������ �� ���. ���� MTHOD.coffee_machine() ��¼��~
		System.out.println("�մ� Ŀ�� ���� �ֽ��ϴ�.");
		
		
		//�޼ҵ忡 static �Ⱥ����� Ŭ������ �ν��Ͻ�ȭ �������.
		�ؾ a = new �ؾ();
		//��������.�ʵ��()
		�ؾ.������();
		
		
		//�޼ҵ忡 static ������ �ν��Ͻ�ȭ �ʿ����/ Ŭ������.�ʵ��()
		�ؾ.������();
		
		RUN(3); //1��° RUN�� ȣ������~
		RUN(); //2��° RUN�� ȣ������~

	}
	static void RUN(int a){
		System.out.println();
	}
	
	static void RUN(){
		System.out.println();
	}
}
