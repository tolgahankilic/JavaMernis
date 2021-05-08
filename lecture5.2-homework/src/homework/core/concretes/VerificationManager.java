package homework.core.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import homework.core.abstracts.VerificationService;
import homework.entities.concretes.User;

public class VerificationManager implements VerificationService {

	List<User> users = new ArrayList<User>();

	public boolean validEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";
		
		Pattern pattern = Pattern.compile(emailRegex);
		if (email == null) {
			return false;
		}
		return pattern.matcher(email).matches();
	}
	
	public boolean validPassword(String password) {
		if (password == null || password.length() < 6) {
			return false;
		}
		return true;
	}
	
	public boolean validFirstName(String firstName) {
		if (firstName == null || firstName.length() < 2) {
			return false;
		}
		return true;
	}
	
	public boolean validLastName(String lastName) {
		if (lastName == null || lastName.length() < 2) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isValid(User user) {
		if (!validEmail(user.getEmail())) {
			System.out.println("Gecersiz email girisi yaptiniz.");
			return false;
		}
		
		if (!validPassword(user.getPassword())) {
			System.out.println("Gecersiz sifre, en az 6 karakter olmali.");
			return false;
		}
		
		if (!validFirstName(user.getFirstName())) {
			System.out.println("Kullanici adi 2 karakterden fazla olmali.");
			return false;
		}
		
		if (!validLastName(user.getLastName())) {
			System.out.println("Kullanici soyadi 2 karakterden fazla olmali");
			return false;
		}
		
		return true;
	}

	@Override
	public boolean checkLogin(String email, String password) {
		for (User user : users) {
			if (user.getEmail() == email && user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}

}
