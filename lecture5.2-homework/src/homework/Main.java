package homework;

import homework.business.abstracts.UserService;
import homework.business.concretes.UserManager;
import homework.core.concretes.EmailValidatorManager;
import homework.core.concretes.GoogleServiceAdapter;
import homework.dataAccess.concretes.InMemoryUserDao;
import homework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Tolgahan","Kilic","tolgahanklc1907@gmail.com","12345");
		
		UserService userService = new UserManager(new EmailValidatorManager(),new GoogleServiceAdapter(), new InMemoryUserDao());
		
		userService.signUp(user);
		
		userService.logIn("tolgahanklc1907@gmail.com","12345");
	}

}
