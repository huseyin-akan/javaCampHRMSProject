package Husonia.HRMS.business.abstracts;

import Husonia.HRMS.entities.concretes.User;

public interface EmailService {
	void sendVerification();
	
	void verify(User user, String token);
}
