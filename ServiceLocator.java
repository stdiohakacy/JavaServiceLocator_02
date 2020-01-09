package creational.ServiceLocator._02;

public final class ServiceLocator {
	private static Cache cache = new Cache();
	
	private ServiceLocator() throws IllegalAccessException {
		throw new IllegalAccessException("Can not constuctor this class");
	}
	
	public static MessagingService getService(String name) {
		MessagingService service = cache.getService(name);
		if(service != null) {
			System.out.println("Get service from cache " + name);
		}
		System.out.println("Create a new service and add to cache");
		InitialContext context = new InitialContext();
		service = context.lookup(name);
		cache.addService(service);
		return service;
	}
}
