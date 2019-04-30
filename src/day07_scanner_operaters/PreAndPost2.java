package day07_scanner_operaters;

public class PreAndPost2 {

	public static void main (String []args) {
		int messages = 10;
		messages ++;
		++messages;
		System.out.println("Messages: "+ messages);
		
		
		int readMessages = --messages;
		System.out.println("ReadMessages: "+ readMessages);
		System.out.println("Messages: "+ messages);
				//11		//11
		int unreadMessages = readMessages--;
		System.out.println("unreadMessages: " +unreadMessages); //11
		System.out.println("readMessages: " +readMessages); //10
		
		int total = unreadMessages++ - readMessages--;
		System.out.println("unreadMessages: " + unreadMessages);
		System.out.println("readMessages: "+ readMessages);
		System.out.println("total: "+ total);
		
		int count = 20;
		int count2 = 10;
		int totalCount = ++count + --count2;
		System.out.println("count "+ count);
		System.out.println("count2 "+ count2);
		System.out.println("totalCount"+ totalCount);
		
		
		int myCount = count++ + ++count;
		System.out.println("count:" + count);
		System.out.println("myCount :"+myCount);
		
		
	}
}
