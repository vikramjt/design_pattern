package com.vikram.designpatt.servicelocator;

import com.vikram.designpatt.servicelocator.cache.Cache;
import com.vikram.designpatt.servicelocator.context.InitialContext;
import com.vikram.designpatt.servicelocator.service.MessagingService;

public class ServiceLocator {
	 
    private static Cache cache = new Cache();
 
    public static MessagingService getService(String serviceName) {
 
        MessagingService service = cache.getService(serviceName);
 
        if (service != null) {
            return service;
        }
 
        InitialContext context = new InitialContext();
        MessagingService service1 = (MessagingService) context
          .lookup(serviceName);
        cache.addService(service1);
        return service1;
    }
}