package com.vikram.designpatt.servicelocator.context;

import com.vikram.designpatt.servicelocator.service.EmailService;
import com.vikram.designpatt.servicelocator.service.SMSService;

public class InitialContext {
    public Object lookup(String serviceName) {
        if (serviceName.equalsIgnoreCase("EmailService")) {
            return new EmailService();
        } else if (serviceName.equalsIgnoreCase("SMSService")) {
            return new SMSService();
        }
        return null;
    }
}