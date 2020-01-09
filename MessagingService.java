package creational.ServiceLocator._02;

public interface MessagingService {
	public String getMessageBody();

	public String getServiceName();
}

class EmailService implements MessagingService {

	@Override
	public String getMessageBody() {
		return "Message body of Email";
	}

	@Override
	public String getServiceName() {
		return "EmailService";
	}
}

class SMSService implements MessagingService {

	@Override
	public String getMessageBody() {
		return "Message body of SMS";
	}

	@Override
	public String getServiceName() {
		return "SMSService";
	}
}