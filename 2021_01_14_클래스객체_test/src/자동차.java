
public class 자동차 {
	
	int speed;
	String name;
	String color;
	String company;
	
	자동차(){
		
	}
	
	자동차(int s){
		this(s,"아반떼");
		
	}
	
	자동차(int s,String ss){
		speed = s;
		name = ss;
	}
	
	자동차(String s,String ss){
		color = s;
		company = ss;
		
	}
}
