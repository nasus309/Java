package 컬렉션3;

public class Message {
	public String command; //메일?문자?카톡?
	public String to; //누구에게?
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
