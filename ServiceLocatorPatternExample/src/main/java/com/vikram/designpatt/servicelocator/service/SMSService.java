package com.vikram.designpatt.servicelocator.service;

public class SMSService implements MessagingService {
	 
    public String getMessageBody() {
        return "sms message";
    }
 
    public String getServiceName() {
        return "SMSService";
    }
}