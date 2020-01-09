package creational.ServiceLocator._02;

public class Client {

	public static void main(String[] args) {
		MessagingService service = ServiceLocator.getService("EmailService");
		System.out.println(service.getMessageBody());
		
		service = ServiceLocator.getService("SMSService");
		System.out.println(service.getMessageBody());
		
		service = ServiceLocator.getService("EmailService");
		System.out.println(service.getMessageBody());
		
		service = ServiceLocator.getService("SMSService");
		System.out.println(service.getMessageBody());
	}

}
