
public class SutdaCard {
	int num; //ī���� ����(1~10������ ����)
	boolean isKwang; //���̸� true, �ƴϸ� false
	
	
	SutdaCard(){
		this(1,true); //�ؿ� StudaCard ������(�޼ҵ�)�� ���� �����Ѱ���.this�� ������ ������ �޴� ������ ã�� ȣ��
		/*num=1
		  isKwang = ture
		 */
	}
	
	SutdaCard(int num,boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;	
	}
	
	String info() {
		
		//return num + (isKwang ? "K":"");
		
		String s;
		if(isKwang) {
			 s= "K";
		}else {
			s = "";
		}
		
		return (num + s);
		
	}
	
	
	
}
