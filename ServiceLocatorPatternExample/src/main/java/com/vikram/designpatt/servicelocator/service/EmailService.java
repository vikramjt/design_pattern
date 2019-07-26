package com.vikram.designpatt.servicelocator.service;

public class EmailService implements MessagingService {
	 
    public String getMessageBody() {
        return "email message";
    }
 
    public String getServiceName() {
        return "EmailService";
    }
}