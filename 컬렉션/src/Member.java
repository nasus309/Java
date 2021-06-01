public class Member {
	public String name;
	public int age;
	
	public Member(String name,int age) {
		
		this.age = age;
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		//Object 타입의 매개변수는 모든객체가 매개값으로 제공될 수 있기 떄문에 기준 객체외 동일한 타입인지 확인.
		//obj이 기준객체.
		if(obj instanceof Member) { 
			Member member = (Member)obj;
			//Member member = new Member(name, age);
			return member.name.equals(name) && member.age == age; //다 같으면 true, name대신 this.name 해도됨?
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age; //이름과 나이가 같다면 해시코드가 같을거다! 그럼 빼기해도됨?
		//return Objects.hash(name,ages); 
	}
}
