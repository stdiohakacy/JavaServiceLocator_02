package creational.ServiceLocator._02;

public class InitialContext {
	public MessagingService lookup(String name) {
		if(name.equalsIgnoreCase("EmailService"))
			return new EmailService();
		else if(name.equalsIgnoreCase("SMSService"))
			return new SMSService();
		return null;
	}
}
