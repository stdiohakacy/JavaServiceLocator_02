package creational.ServiceLocator._02;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private static final List<MessagingService> listService = new ArrayList<MessagingService>();
	
	public MessagingService getService(String name) {
		for (MessagingService messagingService : listService) {
			if(messagingService.getClass().getSimpleName().equalsIgnoreCase(name)) {
				return messagingService;
			}
		}
		return null;
	}
	
	public void addService(MessagingService newService) {
		listService.add(newService);
	}
}
