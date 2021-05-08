package homework.business.abstracts;

import homework.entities.concretes.User;

public interface UserService {
	void signUp(User user);

	void logIn(String email, String password);
}
