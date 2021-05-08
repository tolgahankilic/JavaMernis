package homework.core.abstracts;

import homework.entities.concretes.User;

public interface VerificationService {
	boolean isValid(User user);
	boolean checkLogin(String email, String password);
}
