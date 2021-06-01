package 컬렉션3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
	//Queue 인터페이스는 FIFO(선입선출) -> 구현클래스 : LinkedList
	//응용예 : 작업큐,메시지큐... 
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","신용권"));
		messageQueue.offer(new Message("sendKakaotalk","홍두깨"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}
}
