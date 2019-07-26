package com.vikram.designpatt.servicelocator.cache;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.vikram.designpatt.servicelocator.service.MessagingService;

public class Cache {
    private List<MessagingService> services = new ArrayList<>();
 
    public MessagingService getService(String serviceName) {
        // retrieve from the list
    	MessagingService result = null;
    	Optional<MessagingService> match = services.stream().filter(elem -> elem.getServiceName().equals(serviceName)).findFirst();
    	if(match.isPresent()) {
    		result = match.get();
    	}
    	return result;
    }
 
    public void addService(MessagingService newService) {
    	services.add(newService);
    }
}
