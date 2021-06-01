public class Member {
	public String name;
	public int age;
	
	public Member(String name,int age) {
		
		this.age = age;
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		//Object Ÿ���� �Ű������� ��簴ü�� �Ű������� ������ �� �ֱ� ������ ���� ��ü�� ������ Ÿ������ Ȯ��.
		//obj�� ���ذ�ü.
		if(obj instanceof Member) { 
			Member member = (Member)obj;
			//Member member = new Member(name, age);
			return member.name.equals(name) && member.age == age; //�� ������ true, name��� this.name �ص���?
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age; //�̸��� ���̰� ���ٸ� �ؽ��ڵ尡 �����Ŵ�! �׷� �����ص���?
		//return Objects.hash(name,ages); 
	}
}
